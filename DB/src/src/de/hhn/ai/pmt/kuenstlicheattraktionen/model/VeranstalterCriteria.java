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

public class VeranstalterCriteria extends AbstractORMCriteria {
	public final StringExpression nachname;
	public final StringExpression vorname;
	public final StringExpression password;
	public final CollectionExpression Veranstaltungen;
	
	public VeranstalterCriteria(Criteria criteria) {
		super(criteria);
		nachname = new StringExpression("nachname", this);
		vorname = new StringExpression("vorname", this);
		password = new StringExpression("password", this);
		Veranstaltungen = new CollectionExpression("ORM_veranstaltungen", this);
	}
	
	public VeranstalterCriteria(PersistentSession session) {
		this(session.createCriteria(Veranstalter.class));
	}
	
	public VeranstalterCriteria() throws PersistentException {
		this(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession());
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungCriteria createVeranstaltungenCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungCriteria(createCriteria("ORM_veranstaltungen"));
	}
	
	public Veranstalter uniqueVeranstalter() {
		return (Veranstalter) super.uniqueResult();
	}
	
	public Veranstalter[] listVeranstalter() {
		java.util.List list = super.list();
		return (Veranstalter[]) list.toArray(new Veranstalter[list.size()]);
	}
}

