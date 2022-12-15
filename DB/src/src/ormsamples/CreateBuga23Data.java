/**
 * Licensee: 
 * License Type: Evaluation
 */
package ormsamples;

import org.orm.*;
public class CreateBuga23Data {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO Gruppe(Id) VALUES (1)");
					statement.executeUpdate("INSERT INTO Veranstalter(Nachname, Vorname, Password) VALUES ('VerNTest', 'VerVTest', 'VerPTest')");
					statement.executeUpdate("INSERT INTO SystemManager(Nachname, Vorname, Password) VALUES ('SysNTest', 'SysVTest', 'SYSPTest')");
					statement.executeUpdate("INSERT INTO Veranstaltung(Id, VeranstalterNachname, SystemManagerNachname, Name, Ort, Info, Datum, Plaetze, Ausgebucht, Discriminator) VALUES (1, 'VerNTest', 'SysNTest', 'VeranNTest', 'VeranOTest', 'VerITest', '2022.05.05', 50, False, 'VeranDTest')");
					statement.executeUpdate("INSERT INTO Benutzer(Id, GruppeId, Vorname, Nachname, Email, Password) VALUES (1, 1, 'VTest', 'NTest', 'TestEmail', 'PTest')");
					statement.executeUpdate("INSERT INTO Benutzer(Id, GruppeId, Vorname, Nachname, Email, Password) VALUES (2, 1, '2VTest', '2NTest', '2TestEmail', '2PTest')");
					statement.executeUpdate("INSERT INTO Bewertung(ID, VeranstaltungId, BenutzerId) VALUES (1, 1, 1)");
					statement.executeUpdate("INSERT INTO Bewertung_bewertungen(BewertungID, BewertungIndex, Bewertungen) VALUES (1, 1, 4)");
					statement.executeUpdate("INSERT INTO Ticket(ID, VeranstaltungId2, BenutzerId, GruppeId, VeranstaltungId, Preis, Anzahl, Bezahlt) VALUES (1, 1, 1, null, 1, 5, 50, False)");
					statement.executeUpdate("INSERT INTO Benutzer_Veranstaltung(BenutzerId, VeranstaltungId) VALUES (1, 1)");
					statement.executeUpdate("INSERT INTO Gruppe_benutzer(GruppeId, GruppeIndex, Benutzer) VALUES (1, 1, 'BTest')");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().beginTransaction();
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe ldehhnaipmtkuenstlicheAttraktionenmodelGruppe = de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDAO.createGruppe();
			// Initialize the properties of the persistent object here
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelGruppe);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ldehhnaipmtkuenstlicheAttraktionenmodelTicket = de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDAO.createTicket();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Event, benutzer, veranstaltung
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelTicket);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalter = de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterDAO.createVeranstalter();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Veranstaltungen, nachname
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelVeranstalter);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager ldehhnaipmtkuenstlicheAttraktionenmodelSystemManager = de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerDAO.createSystemManager();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Veranstaltungen, nachname
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelSystemManager);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event ldehhnaipmtkuenstlicheAttraktionenmodelEvent = de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDAO.createEvent();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Tickets
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelEvent);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion ldehhnaipmtkuenstlicheAttraktionenmodelAttraktion = de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionDAO.createAttraktion();
			// Initialize the properties of the persistent object here
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelAttraktion);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung ldehhnaipmtkuenstlicheAttraktionenmodelBewertung = de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungDAO.createBewertung();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Bewerter, Veranstaltung
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelBewertung);
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer ldehhnaipmtkuenstlicheAttraktionenmodelBenutzer = de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDAO.createBenutzer();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : ticket, Veranstaltung, Bewertungen
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDAO.save(ldehhnaipmtkuenstlicheAttraktionenmodelBenutzer);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateBuga23Data createBuga23Data = new CreateBuga23Data();
			try {
				createBuga23Data.createTestData();
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
