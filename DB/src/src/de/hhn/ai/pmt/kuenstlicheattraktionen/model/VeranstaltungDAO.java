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

public class VeranstaltungDAO {
	public static Veranstaltung loadVeranstaltungByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadVeranstaltungByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung getVeranstaltungByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getVeranstaltungByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadVeranstaltungByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung getVeranstaltungByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getVeranstaltungByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Veranstaltung) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung getVeranstaltungByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Veranstaltung) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Veranstaltung) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung getVeranstaltungByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Veranstaltung) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVeranstaltung(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryVeranstaltung(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVeranstaltung(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryVeranstaltung(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung[] listVeranstaltungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listVeranstaltungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung[] listVeranstaltungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listVeranstaltungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVeranstaltung(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung as Veranstaltung");
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
	
	public static List queryVeranstaltung(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung as Veranstaltung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Veranstaltung", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung[] listVeranstaltungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVeranstaltung(session, condition, orderBy);
			return (Veranstaltung[]) list.toArray(new Veranstaltung[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung[] listVeranstaltungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVeranstaltung(session, condition, orderBy, lockMode);
			return (Veranstaltung[]) list.toArray(new Veranstaltung[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadVeranstaltungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadVeranstaltungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Veranstaltung[] veranstaltungs = listVeranstaltungByQuery(session, condition, orderBy);
		if (veranstaltungs != null && veranstaltungs.length > 0)
			return veranstaltungs[0];
		else
			return null;
	}
	
	public static Veranstaltung loadVeranstaltungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Veranstaltung[] veranstaltungs = listVeranstaltungByQuery(session, condition, orderBy, lockMode);
		if (veranstaltungs != null && veranstaltungs.length > 0)
			return veranstaltungs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVeranstaltungByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateVeranstaltungByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVeranstaltungByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateVeranstaltungByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVeranstaltungByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung as Veranstaltung");
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
	
	public static java.util.Iterator iterateVeranstaltungByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung as Veranstaltung");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Veranstaltung", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean save(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung veranstaltung) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().saveObject(veranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung veranstaltung) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().deleteObject(veranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Veranstaltung veranstaltung)throws PersistentException {
		if (veranstaltung instanceof de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event) {
			return de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDAO.deleteAndDissociate((de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event) veranstaltung);
		}
		
		if (veranstaltung instanceof de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion) {
			return de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionDAO.deleteAndDissociate((de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion) veranstaltung);
		}
		
		try {
			if (veranstaltung.getVeranstalter() != null) {
				veranstaltung.getVeranstalter().veranstaltungen.remove(veranstaltung);
			}
			
			if (veranstaltung.getManager() != null) {
				veranstaltung.getManager().veranstaltungen.remove(veranstaltung);
			}
			
			Bewertung[] lBewertungens = veranstaltung.bewertungen.toArray();
			for(int i = 0; i < lBewertungens.length; i++) {
				lBewertungens[i].setVeranstaltung(null);
			}
			Benutzer[] lBesuchers = veranstaltung.besucher.toArray();
			for(int i = 0; i < lBesuchers.length; i++) {
				lBesuchers[i].veranstaltung.remove(veranstaltung);
			}
			if (veranstaltung.getTicket() != null) {
				veranstaltung.getTicket().setVeranstaltung(null);
			}
			
			return delete(veranstaltung);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung veranstaltung, org.orm.PersistentSession session)throws PersistentException {
		if (veranstaltung instanceof de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event) {
			return de.hhn.ai.pmt.kuenstlicheattraktionen.model.EventDAO.deleteAndDissociate((de.hhn.ai.pmt.kuenstlicheattraktionen.model.Event) veranstaltung, session);
		}
		
		if (veranstaltung instanceof de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion) {
			return de.hhn.ai.pmt.kuenstlicheattraktionen.model.AttraktionDAO.deleteAndDissociate((de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion) veranstaltung, session);
		}
		
		try {
			if (veranstaltung.getVeranstalter() != null) {
				veranstaltung.getVeranstalter().veranstaltungen.remove(veranstaltung);
			}
			
			if (veranstaltung.getManager() != null) {
				veranstaltung.getManager().veranstaltungen.remove(veranstaltung);
			}
			
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung[] lBewertungens = veranstaltung.bewertungen.toArray();
			for(int i = 0; i < lBewertungens.length; i++) {
				lBewertungens[i].setVeranstaltung(null);
			}
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer[] lBesuchers = veranstaltung.besucher.toArray();
			for(int i = 0; i < lBesuchers.length; i++) {
				lBesuchers[i].veranstaltung.remove(veranstaltung);
			}
			if (veranstaltung.getTicket() != null) {
				veranstaltung.getTicket().setVeranstaltung(null);
			}
			
			try {
				session.delete(veranstaltung);
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
	
	public static boolean refresh(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung veranstaltung) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().refresh(veranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung veranstaltung) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().evict(veranstaltung);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstaltung loadVeranstaltungByCriteria(VeranstaltungCriteria veranstaltungCriteria) {
		Veranstaltung[] veranstaltungs = listVeranstaltungByCriteria(veranstaltungCriteria);
		if(veranstaltungs == null || veranstaltungs.length == 0) {
			return null;
		}
		return veranstaltungs[0];
	}
	
	public static Veranstaltung[] listVeranstaltungByCriteria(VeranstaltungCriteria veranstaltungCriteria) {
		return veranstaltungCriteria.listVeranstaltung();
	}
}
