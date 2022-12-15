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
@Table(name="Veranstaltung")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Veranstaltung")
public abstract class Veranstaltung implements Serializable {
	public Veranstaltung() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTUNG_BEWERTUNGEN) {
			return ORM_bewertungen;
		}
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTUNG_BESUCHER) {
			return ORM_besucher;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTUNG_VERANSTALTER) {
			this.Veranstalter = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter) owner;
		}
		
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTUNG_MANAGER) {
			this.Manager = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager) owner;
		}
		
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTUNG_TICKET) {
			this.ticket = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_VERANSTALTUNG_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_VERANSTALTUNG_ID_GENERATOR", strategy="native")	
	protected Integer id;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="VeranstalterNachname", referencedColumnName="Nachname", nullable=false) }, foreignKey=@ForeignKey(name="organisiert"))	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter Veranstalter;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="SystemManagerNachname", referencedColumnName="Nachname", nullable=false) }, foreignKey=@ForeignKey(name="verwaltet"))	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager Manager;
	
	@Column(name="Name", nullable=true, length=255)	
	protected String name;
	
	@Column(name="Ort", nullable=true, length=255)	
	protected String ort;
	
	@Column(name="Info", nullable=true, length=255)	
	protected String info;
	
	@OneToMany(mappedBy="Veranstaltung", targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_bewertungen = new java.util.HashSet();
	
	@ManyToMany(targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Benutzer_Veranstaltung", joinColumns={ @JoinColumn(name="VeranstaltungId") }, inverseJoinColumns={ @JoinColumn(name="BenutzerId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_besucher = new java.util.HashSet();
	
	@OneToOne(mappedBy="veranstaltung", targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ticket;
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
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
	
	public void setOrt(String value) {
		this.ort = value;
	}
	
	public String getOrt() {
		return ort;
	}
	
	public void setInfo(String value) {
		this.info = value;
	}
	
	public String getInfo() {
		return info;
	}
	
	private void setORM_Bewertungen(java.util.Set value) {
		this.ORM_bewertungen = value;
	}
	
	private java.util.Set getORM_Bewertungen() {
		return ORM_bewertungen;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungSetCollection bewertungen = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungSetCollection(this, _ormAdapter, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTUNG_BEWERTUNGEN, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BEWERTUNG_VERANSTALTUNG, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setVeranstalter(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter value) {
		if (Veranstalter != null) {
			Veranstalter.veranstaltungen.remove(this);
		}
		if (value != null) {
			value.veranstaltungen.add(this);
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter getVeranstalter() {
		return Veranstalter;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Veranstalter(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter value) {
		this.Veranstalter = value;
	}
	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter getORM_Veranstalter() {
		return Veranstalter;
	}
	
	private void setORM_Besucher(java.util.Set value) {
		this.ORM_besucher = value;
	}
	
	private java.util.Set getORM_Besucher() {
		return ORM_besucher;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerSetCollection besucher = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BenutzerSetCollection(this, _ormAdapter, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTUNG_BESUCHER, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BENUTZER_VERANSTALTUNG, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setManager(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager value) {
		if (Manager != null) {
			Manager.veranstaltungen.remove(this);
		}
		if (value != null) {
			value.veranstaltungen.add(this);
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager getManager() {
		return Manager;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Manager(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager value) {
		this.Manager = value;
	}
	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager getORM_Manager() {
		return Manager;
	}
	
	public void setTicket(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket value) {
		if (this.ticket != value) {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket lticket = this.ticket;
			this.ticket = value;
			if (value != null) {
				ticket.setVeranstaltung(this);
			}
			if (lticket != null && lticket.getVeranstaltung() == this) {
				lticket.setVeranstaltung(null);
			}
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket getTicket() {
		return ticket;
	}
	
	public Integer getID() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
