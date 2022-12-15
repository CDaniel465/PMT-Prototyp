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

public class VeranstaltungDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public VeranstaltungDetachedCriteria() {
		super(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung.class, de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		VeranstalterId = new StringExpression("Veranstalter.nachname", this.getDetachedCriteria());
		Veranstalter = new AssociationExpression("Veranstalter", this.getDetachedCriteria());
		ManagerId = new StringExpression("Manager.nachname", this.getDetachedCriteria());
		Manager = new AssociationExpression("Manager", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		ort = new StringExpression("ort", this.getDetachedCriteria());
		info = new StringExpression("info", this.getDetachedCriteria());
		Bewertungen = new CollectionExpression("ORM_bewertungen", this.getDetachedCriteria());
		Besucher = new CollectionExpression("ORM_besucher", this.getDetachedCriteria());
		ticketId = new IntegerExpression("ticket.id", this.getDetachedCriteria());
		ticket = new AssociationExpression("ticket", this.getDetachedCriteria());
	}
	
	public VeranstaltungDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		VeranstalterId = new StringExpression("Veranstalter.nachname", this.getDetachedCriteria());
		Veranstalter = new AssociationExpression("Veranstalter", this.getDetachedCriteria());
		ManagerId = new StringExpression("Manager.nachname", this.getDetachedCriteria());
		Manager = new AssociationExpression("Manager", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		ort = new StringExpression("ort", this.getDetachedCriteria());
		info = new StringExpression("info", this.getDetachedCriteria());
		Bewertungen = new CollectionExpression("ORM_bewertungen", this.getDetachedCriteria());
		Besucher = new CollectionExpression("ORM_besucher", this.getDetachedCriteria());
		ticketId = new IntegerExpression("ticket.id", this.getDetachedCriteria());
		ticket = new AssociationExpression("ticket", this.getDetachedCriteria());
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterDetachedCriteria createVeranstalterCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterDetachedCriteria(createCriteria("Veranstalter"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerDetachedCriteria createManagerCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManagerDetachedCriteria(createCriteria("Manager"));
	}
	
	public BewertungDetachedCriteria createBewertungenCriteria() {
		return new BewertungDetachedCriteria(createCriteria("ORM_bewertungen"));
	}
	
	public BenutzerDetachedCriteria createBesucherCriteria() {
		return new BenutzerDetachedCriteria(createCriteria("ORM_besucher"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDetachedCriteria createTicketCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDetachedCriteria(createCriteria("ticket"));
	}
	
	public Veranstaltung uniqueVeranstaltung(PersistentSession session) {
		return (Veranstaltung) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Veranstaltung[] listVeranstaltung(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Veranstaltung[]) list.toArray(new Veranstaltung[list.size()]);
	}
}

