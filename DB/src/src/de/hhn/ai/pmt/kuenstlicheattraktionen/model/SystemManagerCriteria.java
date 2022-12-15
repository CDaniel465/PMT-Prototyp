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

public class SystemManagerCriteria extends AbstractORMCriteria {
	public final StringExpression nachname;
	public final StringExpression vorname;
	public final StringExpression password;
	public final CollectionExpression Veranstaltungen;
	
	public SystemManagerCriteria(Criteria criteria) {
		super(criteria);
		nachname = new StringExpression("nachname", this);
		vorname = new StringExpression("vorname", this);
		password = new StringExpression("password", this);
		Veranstaltungen = new CollectionExpression("ORM_veranstaltungen", this);
	}
	
	public SystemManagerCriteria(PersistentSession session) {
		this(session.createCriteria(SystemManager.class));
	}
	
	public SystemManagerCriteria() throws PersistentException {
		this(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession());
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungCriteria createVeranstaltungenCriteria() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungCriteria(createCriteria("ORM_veranstaltungen"));
	}
	
	public SystemManager uniqueSystemManager() {
		return (SystemManager) super.uniqueResult();
	}
	
	public SystemManager[] listSystemManager() {
		java.util.List list = super.list();
		return (SystemManager[]) list.toArray(new SystemManager[list.size()]);
	}
}

