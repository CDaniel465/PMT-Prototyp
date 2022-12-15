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
@Table(name="Benutzer")
public class Benutzer implements Serializable {
	public Benutzer() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BENUTZER_BEWERTUNGEN) {
			return ORM_bewertungen;
		}
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BENUTZER_VERANSTALTUNG) {
			return ORM_veranstaltung;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BENUTZER_GRUPPE) {
			this.Gruppe = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe) owner;
		}
		
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BENUTZER_TICKET) {
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
	@GeneratedValue(generator="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_BENUTZER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_BENUTZER_ID_GENERATOR", strategy="native")	
	private Integer id;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="GruppeId", referencedColumnName="Id") }, foreignKey=@ForeignKey(name="hat "))	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe Gruppe;
	
	@Column(name="Vorname", nullable=true, length=255)	
	private String vorname;
	
	@Column(name="Nachname", nullable=true, length=255)	
	private String nachname;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@OneToMany(mappedBy="Bewerter", targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_bewertungen = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_besucher", targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_veranstaltung = new java.util.HashSet();
	
	@OneToOne(mappedBy="benutzer", targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ticket;
	
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
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
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
	
	private void setORM_Bewertungen(java.util.Set value) {
		this.ORM_bewertungen = value;
	}
	
	private java.util.Set getORM_Bewertungen() {
		return ORM_bewertungen;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungSetCollection bewertungen = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.BewertungSetCollection(this, _ormAdapter, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BENUTZER_BEWERTUNGEN, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BEWERTUNG_BEWERTER, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Veranstaltung(java.util.Set value) {
		this.ORM_veranstaltung = value;
	}
	
	private java.util.Set getORM_Veranstaltung() {
		return ORM_veranstaltung;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungSetCollection veranstaltung = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.VeranstaltungSetCollection(this, _ormAdapter, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_BENUTZER_VERANSTALTUNG, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_VERANSTALTUNG_BESUCHER, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setGruppe(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe value) {
		if (Gruppe != null) {
			Gruppe.mitglieder.remove(this);
		}
		if (value != null) {
			value.mitglieder.add(this);
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe getGruppe() {
		return Gruppe;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Gruppe(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe value) {
		this.Gruppe = value;
	}
	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe getORM_Gruppe() {
		return Gruppe;
	}
	
	public void setTicket(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket value) {
		if (this.ticket != value) {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket lticket = this.ticket;
			this.ticket = value;
			if (value != null) {
				ticket.setBenutzer(this);
			}
			if (lticket != null && lticket.getBenutzer() == this) {
				lticket.setBenutzer(null);
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
