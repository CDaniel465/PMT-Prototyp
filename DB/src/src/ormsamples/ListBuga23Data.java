/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class ListBuga23Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Gruppe...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe[] dehhnaipmtkuenstlicheAttraktionenmodelGruppes = de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDAO.listGruppeByQuery(null, null);
		int length = Math.min(dehhnaipmtkuenstlicheAttraktionenmodelGruppes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelGruppes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Ticket...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket[] dehhnaipmtkuenstlicheAttraktionenmodelTickets = de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDAO.listTicketByQuery(null, null);
		length = Math.min(dehhnaipmtkuenstlicheAttraktionenmodelTickets.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelTickets[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Veranstalter...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter[] dehhnaipmtkuenstlicheAttraktionenmodelVeranstalters = de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterDAO.listVeranstalterByQuery(null, null);
		length = Math.min(dehhnaipmtkuenstlicheAttraktionenmodelVeranstalters.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelVeranstalters[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing SystemManager...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager[] dehhnaipmtkuenstlicheAttraktionenmodelSystemManagers = de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerDAO.listSystemManagerByQuery(null, null);
		length = Math.min(dehhnaipmtkuenstlicheAttraktionenmodelSystemManagers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelSystemManagers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Event...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event[] dehhnaipmtkuenstlicheAttraktionenmodelEvents = de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDAO.listEventByQuery(null, null);
		length = Math.min(dehhnaipmtkuenstlicheAttraktionenmodelEvents.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelEvents[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Attraktion...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion[] dehhnaipmtkuenstlicheAttraktionenmodelAttraktions = de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionDAO.listAttraktionByQuery(null, null);
		length = Math.min(dehhnaipmtkuenstlicheAttraktionenmodelAttraktions.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelAttraktions[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Bewertung...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung[] dehhnaipmtkuenstlicheAttraktionenmodelBewertungs = de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungDAO.listBewertungByQuery(null, null);
		length = Math.min(dehhnaipmtkuenstlicheAttraktionenmodelBewertungs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelBewertungs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Benutzer...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer[] dehhnaipmtkuenstlicheAttraktionenmodelBenutzers = de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDAO.listBenutzerByQuery(null, null);
		length = Math.min(dehhnaipmtkuenstlicheAttraktionenmodelBenutzers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelBenutzers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Gruppe by Criteria...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeCriteria ldehhnaipmtkuenstlicheAttraktionenmodelGruppeCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtkuenstlicheAttraktionenmodelGruppeCriteria.id.eq();
		ldehhnaipmtkuenstlicheAttraktionenmodelGruppeCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe[] dehhnaipmtkuenstlicheAttraktionenmodelGruppes = ldehhnaipmtkuenstlicheAttraktionenmodelGruppeCriteria.listGruppe();
		int length =dehhnaipmtkuenstlicheAttraktionenmodelGruppes== null ? 0 : Math.min(dehhnaipmtkuenstlicheAttraktionenmodelGruppes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelGruppes[i]);
		}
		System.out.println(length + " Gruppe record(s) retrieved."); 
		
		System.out.println("Listing Ticket by Criteria...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria ldehhnaipmtkuenstlicheAttraktionenmodelTicketCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtkuenstlicheAttraktionenmodelTicketCriteria.ID.eq();
		ldehhnaipmtkuenstlicheAttraktionenmodelTicketCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket[] dehhnaipmtkuenstlicheAttraktionenmodelTickets = ldehhnaipmtkuenstlicheAttraktionenmodelTicketCriteria.listTicket();
		length =dehhnaipmtkuenstlicheAttraktionenmodelTickets== null ? 0 : Math.min(dehhnaipmtkuenstlicheAttraktionenmodelTickets.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelTickets[i]);
		}
		System.out.println(length + " Ticket record(s) retrieved."); 
		
		System.out.println("Listing Veranstalter by Criteria...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterCriteria ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalterCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalterCriteria.nachname.eq();
		ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalterCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter[] dehhnaipmtkuenstlicheAttraktionenmodelVeranstalters = ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalterCriteria.listVeranstalter();
		length =dehhnaipmtkuenstlicheAttraktionenmodelVeranstalters== null ? 0 : Math.min(dehhnaipmtkuenstlicheAttraktionenmodelVeranstalters.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelVeranstalters[i]);
		}
		System.out.println(length + " Veranstalter record(s) retrieved."); 
		
		System.out.println("Listing SystemManager by Criteria...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerCriteria ldehhnaipmtkuenstlicheAttraktionenmodelSystemManagerCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtkuenstlicheAttraktionenmodelSystemManagerCriteria.nachname.eq();
		ldehhnaipmtkuenstlicheAttraktionenmodelSystemManagerCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager[] dehhnaipmtkuenstlicheAttraktionenmodelSystemManagers = ldehhnaipmtkuenstlicheAttraktionenmodelSystemManagerCriteria.listSystemManager();
		length =dehhnaipmtkuenstlicheAttraktionenmodelSystemManagers== null ? 0 : Math.min(dehhnaipmtkuenstlicheAttraktionenmodelSystemManagers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelSystemManagers[i]);
		}
		System.out.println(length + " SystemManager record(s) retrieved."); 
		
		System.out.println("Listing Event by Criteria...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventCriteria ldehhnaipmtkuenstlicheAttraktionenmodelEventCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtkuenstlicheAttraktionenmodelEventCriteria.id.eq();
		ldehhnaipmtkuenstlicheAttraktionenmodelEventCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event[] dehhnaipmtkuenstlicheAttraktionenmodelEvents = ldehhnaipmtkuenstlicheAttraktionenmodelEventCriteria.listEvent();
		length =dehhnaipmtkuenstlicheAttraktionenmodelEvents== null ? 0 : Math.min(dehhnaipmtkuenstlicheAttraktionenmodelEvents.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelEvents[i]);
		}
		System.out.println(length + " Event record(s) retrieved."); 
		
		System.out.println("Listing Attraktion by Criteria...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionCriteria ldehhnaipmtkuenstlicheAttraktionenmodelAttraktionCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtkuenstlicheAttraktionenmodelAttraktionCriteria.id.eq();
		ldehhnaipmtkuenstlicheAttraktionenmodelAttraktionCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion[] dehhnaipmtkuenstlicheAttraktionenmodelAttraktions = ldehhnaipmtkuenstlicheAttraktionenmodelAttraktionCriteria.listAttraktion();
		length =dehhnaipmtkuenstlicheAttraktionenmodelAttraktions== null ? 0 : Math.min(dehhnaipmtkuenstlicheAttraktionenmodelAttraktions.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelAttraktions[i]);
		}
		System.out.println(length + " Attraktion record(s) retrieved."); 
		
		System.out.println("Listing Bewertung by Criteria...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria ldehhnaipmtkuenstlicheAttraktionenmodelBewertungCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtkuenstlicheAttraktionenmodelBewertungCriteria.ID.eq();
		ldehhnaipmtkuenstlicheAttraktionenmodelBewertungCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung[] dehhnaipmtkuenstlicheAttraktionenmodelBewertungs = ldehhnaipmtkuenstlicheAttraktionenmodelBewertungCriteria.listBewertung();
		length =dehhnaipmtkuenstlicheAttraktionenmodelBewertungs== null ? 0 : Math.min(dehhnaipmtkuenstlicheAttraktionenmodelBewertungs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelBewertungs[i]);
		}
		System.out.println(length + " Bewertung record(s) retrieved."); 
		
		System.out.println("Listing Benutzer by Criteria...");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria ldehhnaipmtkuenstlicheAttraktionenmodelBenutzerCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//ldehhnaipmtkuenstlicheAttraktionenmodelBenutzerCriteria.id.eq();
		ldehhnaipmtkuenstlicheAttraktionenmodelBenutzerCriteria.setMaxResults(ROW_COUNT);
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer[] dehhnaipmtkuenstlicheAttraktionenmodelBenutzers = ldehhnaipmtkuenstlicheAttraktionenmodelBenutzerCriteria.listBenutzer();
		length =dehhnaipmtkuenstlicheAttraktionenmodelBenutzers== null ? 0 : Math.min(dehhnaipmtkuenstlicheAttraktionenmodelBenutzers.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(dehhnaipmtkuenstlicheAttraktionenmodelBenutzers[i]);
		}
		System.out.println(length + " Benutzer record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListBuga23Data listBuga23Data = new ListBuga23Data();
			try {
				listBuga23Data.listTestData();
				//listBuga23Data.listByCriteria();
			}
			finally {
				de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
