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

public class BenutzerDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public BenutzerDetachedCriteria() {
		super(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer.class, de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		GruppeId = new IntegerExpression("Gruppe.id", this.getDetachedCriteria());
		Gruppe = new AssociationExpression("Gruppe", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		Bewertungen = new CollectionExpression("ORM_bewertungen", this.getDetachedCriteria());
		Veranstaltung = new CollectionExpression("ORM_veranstaltung", this.getDetachedCriteria());
		ticketId = new IntegerExpression("ticket.id", this.getDetachedCriteria());
		ticket = new AssociationExpression("ticket", this.getDetachedCriteria());
	}
	
	public BenutzerDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		GruppeId = new IntegerExpression("Gruppe.id", this.getDetachedCriteria());
		Gruppe = new AssociationExpression("Gruppe", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		Bewertungen = new CollectionExpression("ORM_bewertungen", this.getDetachedCriteria());
		Veranstaltung = new CollectionExpression("ORM_veranstaltung", this.getDetachedCriteria());
		ticketId = new IntegerExpression("ticket.id", this.getDetachedCriteria());
		ticket = new AssociationExpression("ticket", this.getDetachedCriteria());
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDetachedCriteria createGruppeCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeDetachedCriteria(createCriteria("Gruppe"));
	}
	
	public BewertungDetachedCriteria createBewertungenCriteria() {
		return new BewertungDetachedCriteria(createCriteria("ORM_bewertungen"));
	}
	
	public VeranstaltungDetachedCriteria createVeranstaltungCriteria() {
		return new VeranstaltungDetachedCriteria(createCriteria("ORM_veranstaltung"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDetachedCriteria createTicketCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketDetachedCriteria(createCriteria("ticket"));
	}
	
	public Benutzer uniqueBenutzer(PersistentSession session) {
		return (Benutzer) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Benutzer[] listBenutzer(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Benutzer[]) list.toArray(new Benutzer[list.size()]);
	}
}

