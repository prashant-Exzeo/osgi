package agenda.service.mongo;

import java.util.List;

import org.amdatu.mongo.MongoDBService;

import com.mongodb.DBCollection;

import agenda.api.Agenda;
import agenda.api.Conference;

public class MongoAgendaService implements Agenda{

	private volatile MongoDBService mongoDBService;
	
	@Override
	public List<Conference> listConferences() {
		DBCollection collection = mongoDBService.getDB().getCollection("conferences");
//		JacksonDBCollection
		return null;
	}

	@Override
	public void addConference(Conference conference) {
		// TODO Auto-generated method stub
		
	}

}
