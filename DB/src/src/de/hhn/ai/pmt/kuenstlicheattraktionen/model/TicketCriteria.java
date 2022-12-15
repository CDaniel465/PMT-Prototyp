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

public class TicketCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression veranstaltungId;
	public final AssociationExpression veranstaltung;
	public final IntegerExpression benutzerId;
	public final AssociationExpression benutzer;
	public final IntegerExpression BesuchergruppeId;
	public final AssociationExpression Besuchergruppe;
	public final IntegerExpression EventId;
	public final AssociationExpression Event;
	public final FloatExpression preis;
	public final IntegerExpression anzahl;
	public final BooleanExpression bezahlt;
	
	public TicketCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		veranstaltungId = new IntegerExpression("veranstaltung.id", this);
		veranstaltung = new AssociationExpression("veranstaltung", this);
		benutzerId = new IntegerExpression("benutzer.id", this);
		benutzer = new AssociationExpression("benutzer", this);
		BesuchergruppeId = new IntegerExpression("Besuchergruppe.id", this);
		Besuchergruppe = new AssociationExpression("Besuchergruppe", this);
		EventId = new IntegerExpression("Event.id", this);
		Event = new AssociationExpression("Event", this);
		preis = new FloatExpression("preis", this);
		anzahl = new IntegerExpression("anzahl", this);
		bezahlt = new BooleanExpression("bezahlt", this);
	}
	
	public TicketCriteria(PersistentSession session) {
		this(session.createCriteria(Ticket.class));
	}
	
	public TicketCriteria() throws PersistentException {
		this(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession());
	}
	
	public VeranstaltungCriteria createVeranstaltungCriteria() {
		return new VeranstaltungCriteria(createCriteria("veranstaltung"));
	}
	
	public BenutzerCriteria createBenutzerCriteria() {
		return new BenutzerCriteria(createCriteria("benutzer"));
	}
	
	public GruppeCriteria createBesuchergruppeCriteria() {
		return new GruppeCriteria(createCriteria("Besuchergruppe"));
	}
	
	public EventCriteria createEventCriteria() {
		return new EventCriteria(createCriteria("Event"));
	}
	
	public Ticket uniqueTicket() {
		return (Ticket) super.uniqueResult();
	}
	
	public Ticket[] listTicket() {
		java.util.List list = super.list();
		return (Ticket[]) list.toArray(new Ticket[list.size()]);
	}
}

