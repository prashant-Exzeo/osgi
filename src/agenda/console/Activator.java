package agenda.console;

import java.util.Properties;

import org.apache.felix.dependencymanager.DependencyActivatorBase;
import org.apache.felix.dependencymanager.DependencyManager;
import org.apache.felix.service.command.CommandProcessor;
import org.osgi.framework.BundleContext;

import agenda.api.Agenda;

public class Activator extends DependencyActivatorBase {

	@Override
	public void destroy(BundleContext context, DependencyManager manager)
			throws Exception {
	}

	@Override
	public void init(BundleContext context, DependencyManager manager)
			throws Exception {
		
//		manager.add(createService().setInterface(Object.class.getName(), null).setImplementation(ConsoleAgenda.class).add(createServiceDependency().setService(Agenda.class)));
		
		
		Properties properties = new Properties();
		properties.put(CommandProcessor.COMMAND_SCOPE, "agenda");
		properties.put(CommandProcessor.COMMAND_FUNCTION, new String[] {
				"listConferences", "addConference" });

		manager.add(createService()
				.setInterface(Object.class.getName(), properties)
				.setImplementation(ConsoleAgenda.class)
				.add(createServiceDependency().setService(Agenda.class)
						.setRequired(true)));
	}
}
