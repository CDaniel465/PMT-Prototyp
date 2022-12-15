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

public class GruppeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final CollectionExpression Gruppenticket;
	public final CollectionExpression Mitglieder;
	
	public GruppeDetachedCriteria() {
		super(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe.class, de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		Gruppenticket = new CollectionExpression("ORM_gruppenticket", this.getDetachedCriteria());
		Mitglieder = new CollectionExpression("ORM_mitglieder", this.getDetachedCriteria());
	}
	
	public GruppeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.kuenstlicheattraktionen.model.GruppeCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		Gruppenticket = new CollectionExpression("ORM_gruppenticket", this.getDetachedCriteria());
		Mitglieder = new CollectionExpression("ORM_mitglieder", this.getDetachedCriteria());
	}
	
	public TicketDetachedCriteria createGruppenticketCriteria() {
		return new TicketDetachedCriteria(createCriteria("ORM_gruppenticket"));
	}
	
	public BenutzerDetachedCriteria createMitgliederCriteria() {
		return new BenutzerDetachedCriteria(createCriteria("ORM_mitglieder"));
	}
	
	public Gruppe uniqueGruppe(PersistentSession session) {
		return (Gruppe) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Gruppe[] listGruppe(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Gruppe[]) list.toArray(new Gruppe[list.size()]);
	}
}

