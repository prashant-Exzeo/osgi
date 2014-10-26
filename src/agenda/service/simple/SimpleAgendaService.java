package agenda.service.simple;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.osgi.service.log.LogService;

import agenda.api.Agenda;
import agenda.api.Conference;

public class SimpleAgendaService implements Agenda {

	private List<Conference> conferences = new CopyOnWriteArrayList<>();
	private volatile LogService logService;
	
	@Override
	public List<Conference> listConferences() {
		return conferences;
	}

	@Override
	public void addConference(Conference conference) {
		conferences.add(conference);
		logService.log(logService.LOG_INFO, "conference added..");
	}

	public void start() {
		conferences.add(new Conference("Osgi", "exzeo"));
		conferences.add(new Conference("Scala", "ThoughtWorks"));
	}

}
