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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class EventDAO {
	public static Event loadEventByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadEventByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event getEventByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getEventByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadEventByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event getEventByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getEventByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Event) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event getEventByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Event) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Event) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event getEventByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Event) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvent(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryEvent(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvent(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryEvent(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event[] listEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event[] listEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvent(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event as Event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEvent(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event as Event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Event", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event[] listEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEvent(session, condition, orderBy);
			return (Event[]) list.toArray(new Event[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event[] listEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEvent(session, condition, orderBy, lockMode);
			return (Event[]) list.toArray(new Event[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Event[] events = listEventByQuery(session, condition, orderBy);
		if (events != null && events.length > 0)
			return events[0];
		else
			return null;
	}
	
	public static Event loadEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Event[] events = listEventByQuery(session, condition, orderBy, lockMode);
		if (events != null && events.length > 0)
			return events[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEventByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateEventByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateEventByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event as Event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event as Event");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Event", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event createEvent() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event();
	}
	
	public static boolean save(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event event) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().saveObject(event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event event) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().deleteObject(event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event event)throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket[] lTicketss = event.tickets.toArray();
			for(int i = 0; i < lTicketss.length; i++) {
				lTicketss[i].setEvent(null);
			}
			if (event.getVeranstalter() != null) {
				event.getVeranstalter().veranstaltungen.remove(event);
			}
			
			if (event.getManager() != null) {
				event.getManager().veranstaltungen.remove(event);
			}
			
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung[] lBewertungens = event.bewertungen.toArray();
			for(int i = 0; i < lBewertungens.length; i++) {
				lBewertungens[i].setVeranstaltung(null);
			}
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer[] lBesuchers = event.besucher.toArray();
			for(int i = 0; i < lBesuchers.length; i++) {
				lBesuchers[i].veranstaltung.remove(event);
			}
			if (event.getTicket() != null) {
				event.getTicket().setVeranstaltung(null);
			}
			
			return delete(event);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event event, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket[] lTicketss = event.tickets.toArray();
			for(int i = 0; i < lTicketss.length; i++) {
				lTicketss[i].setEvent(null);
			}
			if (event.getVeranstalter() != null) {
				event.getVeranstalter().veranstaltungen.remove(event);
			}
			
			if (event.getManager() != null) {
				event.getManager().veranstaltungen.remove(event);
			}
			
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung[] lBewertungens = event.bewertungen.toArray();
			for(int i = 0; i < lBewertungens.length; i++) {
				lBewertungens[i].setVeranstaltung(null);
			}
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer[] lBesuchers = event.besucher.toArray();
			for(int i = 0; i < lBesuchers.length; i++) {
				lBesuchers[i].veranstaltung.remove(event);
			}
			if (event.getTicket() != null) {
				event.getTicket().setVeranstaltung(null);
			}
			
			try {
				session.delete(event);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event event) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().refresh(event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event event) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().evict(event);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Event loadEventByCriteria(EventCriteria eventCriteria) {
		Event[] events = listEventByCriteria(eventCriteria);
		if(events == null || events.length == 0) {
			return null;
		}
		return events[0];
	}
	
	public static Event[] listEventByCriteria(EventCriteria eventCriteria) {
		return eventCriteria.listEvent();
	}
}
