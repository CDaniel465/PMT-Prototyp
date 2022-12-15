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

public class BewertungDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression VeranstaltungId;
	public final AssociationExpression Veranstaltung;
	public final IntegerExpression BewerterId;
	public final AssociationExpression Bewerter;
	
	public BewertungDetachedCriteria() {
		super(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung.class, de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		VeranstaltungId = new IntegerExpression("Veranstaltung.id", this.getDetachedCriteria());
		Veranstaltung = new AssociationExpression("Veranstaltung", this.getDetachedCriteria());
		BewerterId = new IntegerExpression("Bewerter.id", this.getDetachedCriteria());
		Bewerter = new AssociationExpression("Bewerter", this.getDetachedCriteria());
	}
	
	public BewertungDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		VeranstaltungId = new IntegerExpression("Veranstaltung.id", this.getDetachedCriteria());
		Veranstaltung = new AssociationExpression("Veranstaltung", this.getDetachedCriteria());
		BewerterId = new IntegerExpression("Bewerter.id", this.getDetachedCriteria());
		Bewerter = new AssociationExpression("Bewerter", this.getDetachedCriteria());
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungDetachedCriteria createVeranstaltungCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungDetachedCriteria(createCriteria("Veranstaltung"));
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDetachedCriteria createBewerterCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerDetachedCriteria(createCriteria("Bewerter"));
	}
	
	public Bewertung uniqueBewertung(PersistentSession session) {
		return (Bewertung) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Bewertung[] listBewertung(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Bewertung[]) list.toArray(new Bewertung[list.size()]);
	}
}

