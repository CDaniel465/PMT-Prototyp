/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class DeleteBuga23Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe ldehhnaipmtkuenstlicheAttraktionenmodelGruppe = de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDAO.loadGruppeByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDAO.delete(ldehhnaipmtkuenstlicheAttraktionenmodelGruppe);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ldehhnaipmtkuenstlicheAttraktionenmodelTicket = de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDAO.loadTicketByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDAO.delete(ldehhnaipmtkuenstlicheAttraktionenmodelTicket);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalter = de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterDAO.loadVeranstalterByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterDAO.delete(ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalter);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager ldehhnaipmtkuenstlicheAttraktionenmodelSystemManager = de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerDAO.loadSystemManagerByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerDAO.delete(ldehhnaipmtkuenstlicheAttraktionenmodelSystemManager);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event ldehhnaipmtkuenstlicheAttraktionenmodelEvent = de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDAO.loadEventByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDAO.delete(ldehhnaipmtkuenstlicheAttraktionenmodelEvent);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion ldehhnaipmtkuenstlicheAttraktionenmodelAttraktion = de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionDAO.loadAttraktionByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionDAO.delete(ldehhnaipmtkuenstlicheAttraktionenmodelAttraktion);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung ldehhnaipmtkuenstlicheAttraktionenmodelBewertung = de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungDAO.loadBewertungByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungDAO.delete(ldehhnaipmtkuenstlicheAttraktionenmodelBewertung);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer ldehhnaipmtkuenstlicheAttraktionenmodelBenutzer = de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDAO.loadBenutzerByQuery(null, null);
			// Delete the persistent object
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDAO.delete(ldehhnaipmtkuenstlicheAttraktionenmodelBenutzer);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteBuga23Data deleteBuga23Data = new DeleteBuga23Data();
			try {
				deleteBuga23Data.deleteTestData();
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
