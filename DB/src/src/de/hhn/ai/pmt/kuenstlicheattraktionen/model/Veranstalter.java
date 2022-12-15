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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Veranstalter")
public class Veranstalter implements Serializable {
	public Veranstalter() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Veranstalter))
			return false;
		Veranstalter veranstalter = (Veranstalter)aObj;
		if ((getNachname() != null && !getNachname().equals(veranstalter.getNachname())) || (getNachname() == null && veranstalter.getNachname() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNachname() == null ? 0 : getNachname().hashCode());
		return hashcode;
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTER_VERANSTALTUNGEN) {
			return ORM_veranstaltungen;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Nachname", nullable=false, length=255)	
	@Id	
	private String nachname;
	
	@Column(name="Vorname", nullable=true, length=255)	
	private String vorname;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@OneToMany(mappedBy="Veranstalter", targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_veranstaltungen = new java.util.HashSet();
	
	public void setVorname(String value) {
		this.vorname = value;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setNachname(String value) {
		this.nachname = value;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public String getORMID() {
		return getNachname();
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setORM_Veranstaltungen(java.util.Set value) {
		this.ORM_veranstaltungen = value;
	}
	
	private java.util.Set getORM_Veranstaltungen() {
		return ORM_veranstaltungen;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungSetCollection veranstaltungen = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungSetCollection(this, _ormAdapter, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTER_VERANSTALTUNGEN, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTUNG_VERANSTALTER, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getNachname());
	}
	
}
