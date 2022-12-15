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
@Table(name="Gruppe")
public class Gruppe implements Serializable {
	public Gruppe() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_GRUPPE_GRUPPENTICKET) {
			return ORM_gruppenticket;
		}
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_GRUPPE_MITGLIEDER) {
			return ORM_mitglieder;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_GRUPPE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_GRUPPE_ID_GENERATOR", strategy="native")	
	private Integer id;
	
	@ElementCollection	
	@CollectionTable(name="Gruppe_benutzer", joinColumns={ @JoinColumn(name="GruppeId") })	
	@org.hibernate.annotations.IndexColumn(name="GruppeIndex")	
	@Column(name="Benutzer", nullable=true, length=255)	
	private String[] benutzer;
	
	@OneToMany(mappedBy="Besuchergruppe", targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gruppenticket = new java.util.HashSet();
	
	@OneToMany(mappedBy="Gruppe", targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_mitglieder = new java.util.HashSet();
	
	private void setId(int value) {
		setId(Integer.valueOf(value));
	}
	
	private void setId(Integer value) {
		this.id = value;
	}
	
	public Integer getId() {
		return id;
	}
	
	public Integer getORMID() {
		return getId();
	}
	
	public void setBenutzer(String[] value) {
		this.benutzer = value;
	}
	
	public String[] getBenutzer() {
		return benutzer;
	}
	
	private void setORM_Gruppenticket(java.util.Set value) {
		this.ORM_gruppenticket = value;
	}
	
	private java.util.Set getORM_Gruppenticket() {
		return ORM_gruppenticket;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketSetCollection gruppenticket = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketSetCollection(this, _ormAdapter, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_GRUPPE_GRUPPENTICKET, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_TICKET_BESUCHERGRUPPE, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Mitglieder(java.util.Set value) {
		this.ORM_mitglieder = value;
	}
	
	private java.util.Set getORM_Mitglieder() {
		return ORM_mitglieder;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerSetCollection mitglieder = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerSetCollection(this, _ormAdapter, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_GRUPPE_MITGLIEDER, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BENUTZER_GRUPPE, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Integer[] getBenutzerIDs() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String[] getNames() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Integer getAnzahl() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Integer getGruppenID() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
