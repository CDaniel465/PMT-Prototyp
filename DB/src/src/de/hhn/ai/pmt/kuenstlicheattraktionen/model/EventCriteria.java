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

public class EventCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression VeranstalterId;
	public final AssociationExpression Veranstalter;
	public final StringExpression ManagerId;
	public final AssociationExpression Manager;
	public final StringExpression name;
	public final StringExpression ort;
	public final StringExpression info;
	public final CollectionExpression Bewertungen;
	public final CollectionExpression Besucher;
	public final IntegerExpression ticketId;
	public final AssociationExpression ticket;
	public final TimestampExpression datum;
	public final IntegerExpression plaetze;
	public final BooleanExpression ausgebucht;
	public final CollectionExpression Tickets;
	
	public EventCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		VeranstalterId = new StringExpression("Veranstalter.nachname", this);
		Veranstalter = new AssociationExpression("Veranstalter", this);
		ManagerId = new StringExpression("Manager.nachname", this);
		Manager = new AssociationExpression("Manager", this);
		name = new StringExpression("name", this);
		ort = new StringExpression("ort", this);
		info = new StringExpression("info", this);
		Bewertungen = new CollectionExpression("ORM_bewertungen", this);
		Besucher = new CollectionExpression("ORM_besucher", this);
		ticketId = new IntegerExpression("ticket.id", this);
		ticket = new AssociationExpression("ticket", this);
		datum = new TimestampExpression("datum", this);
		plaetze = new IntegerExpression("plaetze", this);
		ausgebucht = new BooleanExpression("ausgebucht", this);
		Tickets = new CollectionExpression("ORM_tickets", this);
	}
	
	public EventCriteria(PersistentSession session) {
		this(session.createCriteria(Event.class));
	}
	
	public EventCriteria() throws PersistentException {
		this(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession());
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria createTicketsCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria(createCriteria("ORM_tickets"));
	}
	
	public VeranstalterCriteria createVeranstalterCriteria() {
		return new VeranstalterCriteria(createCriteria("Veranstalter"));
	}
	
	public SystemManagerCriteria createManagerCriteria() {
		return new SystemManagerCriteria(createCriteria("Manager"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria createBewertungenCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria(createCriteria("ORM_bewertungen"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria createBesucherCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria(createCriteria("ORM_besucher"));
	}
	
	public TicketCriteria createTicketCriteria() {
		return new TicketCriteria(createCriteria("ticket"));
	}
	
	public Event uniqueEvent() {
		return (Event) super.uniqueResult();
	}
	
	public Event[] listEvent() {
		java.util.List list = super.list();
		return (Event[]) list.toArray(new Event[list.size()]);
	}
}

