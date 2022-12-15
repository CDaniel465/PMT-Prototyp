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

public class BewertungCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression VeranstaltungId;
	public final AssociationExpression Veranstaltung;
	public final IntegerExpression BewerterId;
	public final AssociationExpression Bewerter;
	
	public BewertungCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		VeranstaltungId = new IntegerExpression("Veranstaltung.id", this);
		Veranstaltung = new AssociationExpression("Veranstaltung", this);
		BewerterId = new IntegerExpression("Bewerter.id", this);
		Bewerter = new AssociationExpression("Bewerter", this);
	}
	
	public BewertungCriteria(PersistentSession session) {
		this(session.createCriteria(Bewertung.class));
	}
	
	public BewertungCriteria() throws PersistentException {
		this(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession());
	}
	
	public VeranstaltungCriteria createVeranstaltungCriteria() {
		return new VeranstaltungCriteria(createCriteria("Veranstaltung"));
	}
	
	public BenutzerCriteria createBewerterCriteria() {
		return new BenutzerCriteria(createCriteria("Bewerter"));
	}
	
	public Bewertung uniqueBewertung() {
		return (Bewertung) super.uniqueResult();
	}
	
	public Bewertung[] listBewertung() {
		java.util.List list = super.list();
		return (Bewertung[]) list.toArray(new Bewertung[list.size()]);
	}
}

