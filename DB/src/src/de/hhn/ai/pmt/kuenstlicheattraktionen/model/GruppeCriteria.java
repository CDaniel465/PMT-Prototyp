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

public class GruppeCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final CollectionExpression Gruppenticket;
	public final CollectionExpression Mitglieder;
	
	public GruppeCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		Gruppenticket = new CollectionExpression("ORM_gruppenticket", this);
		Mitglieder = new CollectionExpression("ORM_mitglieder", this);
	}
	
	public GruppeCriteria(PersistentSession session) {
		this(session.createCriteria(Gruppe.class));
	}
	
	public GruppeCriteria() throws PersistentException {
		this(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession());
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria createGruppenticketCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketCriteria(createCriteria("ORM_gruppenticket"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria createMitgliederCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerCriteria(createCriteria("ORM_mitglieder"));
	}
	
	public Gruppe uniqueGruppe() {
		return (Gruppe) super.uniqueResult();
	}
	
	public Gruppe[] listGruppe() {
		java.util.List list = super.list();
		return (Gruppe[]) list.toArray(new Gruppe[list.size()]);
	}
}

