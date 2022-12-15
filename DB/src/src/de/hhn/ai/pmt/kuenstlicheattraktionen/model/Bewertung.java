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
@Table(name="Bewertung")
public class Bewertung implements Serializable {
	public Bewertung() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BEWERTUNG_BEWERTER) {
			this.Bewerter = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer) owner;
		}
		
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BEWERTUNG_VERANSTALTUNG) {
			this.Veranstaltung = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_BEWERTUNG_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_BEWERTUNG_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="VeranstaltungId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="bewertet"))	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung Veranstaltung;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="BenutzerId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="erstellt"))	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer Bewerter;
	
	@ElementCollection	
	@CollectionTable(name="Bewertung_bewertungen", joinColumns={ @JoinColumn(name="BewertungID") })	
	@org.hibernate.annotations.IndexColumn(name="BewertungIndex")	
	@Column(name="Bewertungen", nullable=true, length=11)	
	private Integer[] bewertungen;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setBewertungen(Integer[] value) {
		this.bewertungen = value;
	}
	
	public Integer[] getBewertungen() {
		return bewertungen;
	}
	
	public void setBewerter(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer value) {
		if (Bewerter != null) {
			Bewerter.bewertungen.remove(this);
		}
		if (value != null) {
			value.bewertungen.add(this);
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer getBewerter() {
		return Bewerter;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Bewerter(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer value) {
		this.Bewerter = value;
	}
	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer getORM_Bewerter() {
		return Bewerter;
	}
	
	public void setVeranstaltung(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung value) {
		if (Veranstaltung != null) {
			Veranstaltung.bewertungen.remove(this);
		}
		if (value != null) {
			value.bewertungen.add(this);
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung getVeranstaltung() {
		return Veranstaltung;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Veranstaltung(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung value) {
		this.Veranstaltung = value;
	}
	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung getORM_Veranstaltung() {
		return Veranstaltung;
	}
	
	public Integer getBewertung() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void addBewertung(Integer bewertung) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
