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
@Table(name="Ticket")
public class Ticket implements Serializable {
	public Ticket() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_TICKET_BENUTZER) {
			this.benutzer = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer) owner;
		}
		
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_TICKET_VERANSTALTUNG) {
			this.veranstaltung = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung) owner;
		}
		
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_TICKET_EVENT) {
			this.Event = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event) owner;
		}
		
		else if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_TICKET_BESUCHERGRUPPE) {
			this.Besuchergruppe = (de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe) owner;
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
	@GeneratedValue(generator="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_TICKET_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_AI_PMT_KUENSTLICHEATTRAKTIONEN_MODEL_TICKET_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(optional=false, targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="VeranstaltungId2", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="hat2"))	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung veranstaltung;
	
	@OneToOne(optional=false, targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="BenutzerId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="besitzt2"))	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer benutzer;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="GruppeId", referencedColumnName="Id") }, foreignKey=@ForeignKey(name="besitzt"))	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe Besuchergruppe;
	
	@ManyToOne(targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns(value={ @JoinColumn(name="VeranstaltungId", referencedColumnName="Id", nullable=false) }, foreignKey=@ForeignKey(name="hat"))	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event Event;
	
	@Column(name="Preis", nullable=true)	
	private Float preis;
	
	@Column(name="Anzahl", nullable=true, length=10)	
	private Integer anzahl;
	
	@Column(name="Bezahlt", nullable=true, length=1)	
	private Boolean bezahlt;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPreis(float value) {
		setPreis(Float.valueOf(value));
	}
	
	public void setPreis(Float value) {
		this.preis = value;
	}
	
	public Float getPreis() {
		return preis;
	}
	
	public void setAnzahl(int value) {
		setAnzahl(Integer.valueOf(value));
	}
	
	public void setAnzahl(Integer value) {
		this.anzahl = value;
	}
	
	public Integer getAnzahl() {
		return anzahl;
	}
	
	public void setBezahlt(boolean value) {
		setBezahlt(Boolean.valueOf(value));
	}
	
	public void setBezahlt(Boolean value) {
		this.bezahlt = value;
	}
	
	public Boolean getBezahlt() {
		return bezahlt;
	}
	
	public void setBenutzer(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer value) {
		if (this.benutzer != value) {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer lbenutzer = this.benutzer;
			this.benutzer = value;
			if (value != null) {
				benutzer.setTicket(this);
			}
			if (lbenutzer != null && lbenutzer.getTicket() == this) {
				lbenutzer.setTicket(null);
			}
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer getBenutzer() {
		return benutzer;
	}
	
	public void setVeranstaltung(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung value) {
		if (this.veranstaltung != value) {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung lveranstaltung = this.veranstaltung;
			this.veranstaltung = value;
			if (value != null) {
				veranstaltung.setTicket(this);
			}
			if (lveranstaltung != null && lveranstaltung.getTicket() == this) {
				lveranstaltung.setTicket(null);
			}
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung getVeranstaltung() {
		return veranstaltung;
	}
	
	public void setEvent(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event value) {
		if (Event != null) {
			Event.tickets.remove(this);
		}
		if (value != null) {
			value.tickets.add(this);
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event getEvent() {
		return Event;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Event(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event value) {
		this.Event = value;
	}
	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event getORM_Event() {
		return Event;
	}
	
	public void setBesuchergruppe(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe value) {
		if (Besuchergruppe != null) {
			Besuchergruppe.gruppenticket.remove(this);
		}
		if (value != null) {
			value.gruppenticket.add(this);
		}
	}
	
	public de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe getBesuchergruppe() {
		return Besuchergruppe;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Besuchergruppe(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe value) {
		this.Besuchergruppe = value;
	}
	
	private de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe getORM_Besuchergruppe() {
		return Besuchergruppe;
	}
	
	public Float getPrize() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public Boolean isBezahlt() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
