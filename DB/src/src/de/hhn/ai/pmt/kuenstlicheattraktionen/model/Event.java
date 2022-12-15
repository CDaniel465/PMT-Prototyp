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
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Event")
public class Event extends de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung implements Serializable {
	public Event() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_EVENT_TICKETS) {
			return ORM_tickets;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="Datum", nullable=true)	
	private java.sql.Timestamp datum;
	
	@Column(name="Plaetze", nullable=true, length=10)	
	private Integer plaetze;
	
	@Column(name="Ausgebucht", nullable=true, length=1)	
	private Boolean ausgebucht;
	
	@OneToMany(mappedBy="Event", targetEntity=de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_tickets = new java.util.HashSet();
	
	public void setDatum(java.sql.Timestamp value) {
		this.datum = value;
	}
	
	public java.sql.Timestamp getDatum() {
		return datum;
	}
	
	public void setPlaetze(int value) {
		setPlaetze(Integer.valueOf(value));
	}
	
	public void setPlaetze(Integer value) {
		this.plaetze = value;
	}
	
	public Integer getPlaetze() {
		return plaetze;
	}
	
	public void setAusgebucht(boolean value) {
		setAusgebucht(Boolean.valueOf(value));
	}
	
	public void setAusgebucht(Boolean value) {
		this.ausgebucht = value;
	}
	
	public Boolean getAusgebucht() {
		return ausgebucht;
	}
	
	private void setORM_Tickets(java.util.Set value) {
		this.ORM_tickets = value;
	}
	
	private java.util.Set getORM_Tickets() {
		return ORM_tickets;
	}
	
	@Transient	
	public final de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketSetCollection tickets = new de.hhn.ai.pmt.kuenstlicheattraktionen.model.TicketSetCollection(this, _ormAdapter, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_EVENT_TICKETS, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_TICKET_EVENT, de.hhn.ai.pmt.kuenstlicheattraktionen.model.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Boolean isAusgebucht() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	

	
	public String toString() {
		return super.toString();
	}
	
}
