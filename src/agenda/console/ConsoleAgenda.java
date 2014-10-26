package agenda.console;

import java.util.List;

import agenda.api.Agenda;
import agenda.api.Conference;

public class ConsoleAgenda {
	private volatile Agenda agenda;

	
//	public void start() {
//		List<Conference> conferences = agenda.listConferences();
//		for (Conference conference : conferences) {
//			System.out.println(conference);
//		}
//	}
	
	public void listConferences() {
		List<Conference> conferences = agenda.listConferences();
		if (conferences != null)
			for (Conference conference : conferences) {
				System.out.println(conference);
			}
		else {
			System.out.println("agenda is not available");
		}
	}

	public void addConference(String name, String place) {
		agenda.addConference(new Conference(name, place));
	}
}
