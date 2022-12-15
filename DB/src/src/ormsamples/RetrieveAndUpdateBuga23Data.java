/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateBuga23Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe ldehhnaipmtkuenstlicheAttraktionenmodelGruppe = de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDAO.loadGruppeByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelGruppe);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ldehhnaipmtkuenstlicheAttraktionenmodelTicket = de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDAO.loadTicketByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelTicket);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalter = de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterDAO.loadVeranstalterByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalter);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager ldehhnaipmtkuenstlicheAttraktionenmodelSystemManager = de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerDAO.loadSystemManagerByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelSystemManager);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event ldehhnaipmtkuenstlicheAttraktionenmodelEvent = de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDAO.loadEventByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelEvent);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion ldehhnaipmtkuenstlicheAttraktionenmodelAttraktion = de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionDAO.loadAttraktionByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelAttraktion);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung ldehhnaipmtkuenstlicheAttraktionenmodelBewertung = de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungDAO.loadBewertungByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelBewertung);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer ldehhnaipmtkuenstlicheAttraktionenmodelBenutzer = de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDAO.loadBenutzerByQuery(null, null);
			// Update the properties of the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelBenutzer);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Gruppe by GruppeCriteria");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeCriteria ldehhnaipmtkuenstlicheAttraktionenmodelGruppeCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtkuenstlicheAttraktionenmodelGruppeCriteria.id.eq();
		System.out.println(ldehhnaipmtkuenstlicheAttraktionenmodelGruppeCriteria.uniqueGruppe());
		
		System.out.println("Retrieving Ticket by TicketCriteria");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria ldehhnaipmtkuenstlicheAttraktionenmodelTicketCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtkuenstlicheAttraktionenmodelTicketCriteria.ID.eq();
		System.out.println(ldehhnaipmtkuenstlicheAttraktionenmodelTicketCriteria.uniqueTicket());
		
		System.out.println("Retrieving Veranstalter by VeranstalterCriteria");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterCriteria ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalterCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalterCriteria.nachname.eq();
		System.out.println(ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalterCriteria.uniqueVeranstalter());
		
		System.out.println("Retrieving SystemManager by SystemManagerCriteria");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerCriteria ldehhnaipmtkuenstlicheAttraktionenmodelSystemManagerCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtkuenstlicheAttraktionenmodelSystemManagerCriteria.nachname.eq();
		System.out.println(ldehhnaipmtkuenstlicheAttraktionenmodelSystemManagerCriteria.uniqueSystemManager());
		
		System.out.println("Retrieving Event by EventCriteria");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventCriteria ldehhnaipmtkuenstlicheAttraktionenmodelEventCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtkuenstlicheAttraktionenmodelEventCriteria.id.eq();
		System.out.println(ldehhnaipmtkuenstlicheAttraktionenmodelEventCriteria.uniqueEvent());
		
		System.out.println("Retrieving Attraktion by AttraktionCriteria");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionCriteria ldehhnaipmtkuenstlicheAttraktionenmodelAttraktionCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtkuenstlicheAttraktionenmodelAttraktionCriteria.id.eq();
		System.out.println(ldehhnaipmtkuenstlicheAttraktionenmodelAttraktionCriteria.uniqueAttraktion());
		
		System.out.println("Retrieving Bewertung by BewertungCriteria");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria ldehhnaipmtkuenstlicheAttraktionenmodelBewertungCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtkuenstlicheAttraktionenmodelBewertungCriteria.ID.eq();
		System.out.println(ldehhnaipmtkuenstlicheAttraktionenmodelBewertungCriteria.uniqueBewertung());
		
		System.out.println("Retrieving Benutzer by BenutzerCriteria");
		de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria ldehhnaipmtkuenstlicheAttraktionenmodelBenutzerCriteria = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldehhnaipmtkuenstlicheAttraktionenmodelBenutzerCriteria.id.eq();
		System.out.println(ldehhnaipmtkuenstlicheAttraktionenmodelBenutzerCriteria.uniqueBenutzer());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateBuga23Data retrieveAndUpdateBuga23Data = new RetrieveAndUpdateBuga23Data();
			try {
				retrieveAndUpdateBuga23Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateBuga23Data.retrieveByCriteria();
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
