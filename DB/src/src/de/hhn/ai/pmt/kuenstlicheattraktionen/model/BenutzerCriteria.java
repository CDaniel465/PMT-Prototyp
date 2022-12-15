/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package de.hhn.ai.pmt.kuenstlicheattraktionen.model;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class BenutzerCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression GruppeId;
	public final AssociationExpression Gruppe;
	public final StringExpression vorname;
	public final StringExpression nachname;
	public final StringExpression email;
	public final StringExpression password;
	public final CollectionExpression Bewertungen;
	public final CollectionExpression Veranstaltung;
	public final IntegerExpression ticketId;
	public final AssociationExpression ticket;
	
	public BenutzerCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		GruppeId = new IntegerExpression("Gruppe.id", this);
		Gruppe = new AssociationExpression("Gruppe", this);
		vorname = new StringExpression("vorname", this);
		nachname = new StringExpression("nachname", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		Bewertungen = new CollectionExpression("ORM_bewertungen", this);
		Veranstaltung = new CollectionExpression("ORM_veranstaltung", this);
		ticketId = new IntegerExpression("ticket.id", this);
		ticket = new AssociationExpression("ticket", this);
	}
	
	public BenutzerCriteria(PersistentSession session) {
		this(session.createCriteria(Benutzer.class));
	}
	
	public BenutzerCriteria() throws PersistentException {
		this(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession());
	}
	
	public GruppeCriteria createGruppeCriteria() {
		return new GruppeCriteria(createCriteria("Gruppe"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria createBewertungenCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria(createCriteria("ORM_bewertungen"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungCriteria createVeranstaltungCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungCriteria(createCriteria("ORM_veranstaltung"));
	}
	
	public TicketCriteria createTicketCriteria() {
		return new TicketCriteria(createCriteria("ticket"));
	}
	
	public Benutzer uniqueBenutzer() {
		return (Benutzer) super.uniqueResult();
	}
	
	public Benutzer[] listBenutzer() {
		java.util.List list = super.list();
		return (Benutzer[]) list.toArray(new Benutzer[list.size()]);
	}
}

