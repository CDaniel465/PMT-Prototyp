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

public class TicketDAO {
	public static Ticket loadTicketByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadTicketByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket getTicketByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getTicketByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadTicketByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket getTicketByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getTicketByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Ticket) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket getTicketByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Ticket) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ticket) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket getTicketByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Ticket) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTicket(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryTicket(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTicket(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryTicket(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket[] listTicketByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listTicketByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket[] listTicketByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listTicketByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTicket(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket as Ticket");
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
	
	public static List queryTicket(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket as Ticket");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ticket", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket[] listTicketByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTicket(session, condition, orderBy);
			return (Ticket[]) list.toArray(new Ticket[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket[] listTicketByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTicket(session, condition, orderBy, lockMode);
			return (Ticket[]) list.toArray(new Ticket[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadTicketByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadTicketByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Ticket[] tickets = listTicketByQuery(session, condition, orderBy);
		if (tickets != null && tickets.length > 0)
			return tickets[0];
		else
			return null;
	}
	
	public static Ticket loadTicketByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Ticket[] tickets = listTicketByQuery(session, condition, orderBy, lockMode);
		if (tickets != null && tickets.length > 0)
			return tickets[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTicketByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateTicketByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTicketByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateTicketByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTicketByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket as Ticket");
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
	
	public static java.util.Iterator iterateTicketByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket as Ticket");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Ticket", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket createTicket() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket();
	}
	
	public static boolean save(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ticket) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().saveObject(ticket);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ticket) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().deleteObject(ticket);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ticket)throws PersistentException {
		try {
			if (ticket.getVeranstaltung() != null) {
				ticket.getVeranstaltung().setTicket(null);
			}
			
			if (ticket.getBenutzer() != null) {
				ticket.getBenutzer().setTicket(null);
			}
			
			if (ticket.getBesuchergruppe() != null) {
				ticket.getBesuchergruppe().gruppenticket.remove(ticket);
			}
			
			if (ticket.getEvent() != null) {
				ticket.getEvent().tickets.remove(ticket);
			}
			
			return delete(ticket);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ticket, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (ticket.getVeranstaltung() != null) {
				ticket.getVeranstaltung().setTicket(null);
			}
			
			if (ticket.getBenutzer() != null) {
				ticket.getBenutzer().setTicket(null);
			}
			
			if (ticket.getBesuchergruppe() != null) {
				ticket.getBesuchergruppe().gruppenticket.remove(ticket);
			}
			
			if (ticket.getEvent() != null) {
				ticket.getEvent().tickets.remove(ticket);
			}
			
			try {
				session.delete(ticket);
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
	
	public static boolean refresh(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ticket) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().refresh(ticket);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket ticket) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().evict(ticket);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Ticket loadTicketByCriteria(TicketCriteria ticketCriteria) {
		Ticket[] tickets = listTicketByCriteria(ticketCriteria);
		if(tickets == null || tickets.length == 0) {
			return null;
		}
		return tickets[0];
	}
	
	public static Ticket[] listTicketByCriteria(TicketCriteria ticketCriteria) {
		return ticketCriteria.listTicket();
	}
}
