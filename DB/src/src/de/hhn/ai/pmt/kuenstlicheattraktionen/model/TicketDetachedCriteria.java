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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TicketDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public TicketDetachedCriteria() {
		super(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket.class, de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		veranstaltungId = new IntegerExpression("veranstaltung.id", this.getDetachedCriteria());
		veranstaltung = new AssociationExpression("veranstaltung", this.getDetachedCriteria());
		benutzerId = new IntegerExpression("benutzer.id", this.getDetachedCriteria());
		benutzer = new AssociationExpression("benutzer", this.getDetachedCriteria());
		BesuchergruppeId = new IntegerExpression("Besuchergruppe.id", this.getDetachedCriteria());
		Besuchergruppe = new AssociationExpression("Besuchergruppe", this.getDetachedCriteria());
		EventId = new IntegerExpression("Event.id", this.getDetachedCriteria());
		Event = new AssociationExpression("Event", this.getDetachedCriteria());
		preis = new FloatExpression("preis", this.getDetachedCriteria());
		anzahl = new IntegerExpression("anzahl", this.getDetachedCriteria());
		bezahlt = new BooleanExpression("bezahlt", this.getDetachedCriteria());
	}
	
	public TicketDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		veranstaltungId = new IntegerExpression("veranstaltung.id", this.getDetachedCriteria());
		veranstaltung = new AssociationExpression("veranstaltung", this.getDetachedCriteria());
		benutzerId = new IntegerExpression("benutzer.id", this.getDetachedCriteria());
		benutzer = new AssociationExpression("benutzer", this.getDetachedCriteria());
		BesuchergruppeId = new IntegerExpression("Besuchergruppe.id", this.getDetachedCriteria());
		Besuchergruppe = new AssociationExpression("Besuchergruppe", this.getDetachedCriteria());
		EventId = new IntegerExpression("Event.id", this.getDetachedCriteria());
		Event = new AssociationExpression("Event", this.getDetachedCriteria());
		preis = new FloatExpression("preis", this.getDetachedCriteria());
		anzahl = new IntegerExpression("anzahl", this.getDetachedCriteria());
		bezahlt = new BooleanExpression("bezahlt", this.getDetachedCriteria());
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungDetachedCriteria createVeranstaltungCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungDetachedCriteria(createCriteria("veranstaltung"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDetachedCriteria createBenutzerCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDetachedCriteria(createCriteria("benutzer"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDetachedCriteria createBesuchergruppeCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDetachedCriteria(createCriteria("Besuchergruppe"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDetachedCriteria createEventCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDetachedCriteria(createCriteria("Event"));
	}
	
	public Ticket uniqueTicket(PersistentSession session) {
		return (Ticket) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Ticket[] listTicket(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Ticket[]) list.toArray(new Ticket[list.size()]);
	}
}

