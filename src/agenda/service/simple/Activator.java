package agenda.service.simple;

import org.apache.felix.dependencymanager.DependencyActivatorBase;
import org.apache.felix.dependencymanager.DependencyManager;
import org.osgi.framework.BundleContext;
import org.osgi.service.log.LogService;

import agenda.api.Agenda;

public class Activator extends DependencyActivatorBase {

	@Override
	public void destroy(BundleContext context, DependencyManager manager)
			throws Exception {

	}

	@Override
	public void init(BundleContext context, DependencyManager manager)
			throws Exception {
		manager.add(createService().setInterface(Agenda.class.getName(), null)
				.setImplementation(SimpleAgendaService.class));
//		manager.add(createService().setInterface(Agenda.class.getName(), null)
//				.setImplementation(SimpleAgendaService.class)
//				.add(createServiceDependency().setService(LogService.class)));
	}
}
