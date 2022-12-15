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

public class VeranstalterDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nachname;
	public final StringExpression vorname;
	public final StringExpression password;
	public final CollectionExpression Veranstaltungen;
	
	public VeranstalterDetachedCriteria() {
		super(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter.class, de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterCriteria.class);
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		Veranstaltungen = new CollectionExpression("ORM_veranstaltungen", this.getDetachedCriteria());
	}
	
	public VeranstalterDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstalterCriteria.class);
		nachname = new StringExpression("nachname", this.getDetachedCriteria());
		vorname = new StringExpression("vorname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		Veranstaltungen = new CollectionExpression("ORM_veranstaltungen", this.getDetachedCriteria());
	}
	
	public VeranstaltungDetachedCriteria createVeranstaltungenCriteria() {
		return new VeranstaltungDetachedCriteria(createCriteria("ORM_veranstaltungen"));
	}
	
	public Veranstalter uniqueVeranstalter(PersistentSession session) {
		return (Veranstalter) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Veranstalter[] listVeranstalter(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Veranstalter[]) list.toArray(new Veranstalter[list.size()]);
	}
}

