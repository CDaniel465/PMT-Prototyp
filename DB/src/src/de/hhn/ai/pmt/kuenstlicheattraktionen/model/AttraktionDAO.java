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

public class AttraktionDAO {
	public static Attraktion loadAttraktionByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadAttraktionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion getAttraktionByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getAttraktionByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion loadAttraktionByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadAttraktionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion getAttraktionByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getAttraktionByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion loadAttraktionByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Attraktion) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion getAttraktionByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Attraktion) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion loadAttraktionByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Attraktion) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion getAttraktionByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Attraktion) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAttraktion(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryAttraktion(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAttraktion(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryAttraktion(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion[] listAttraktionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listAttraktionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion[] listAttraktionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listAttraktionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAttraktion(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion as Attraktion");
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
	
	public static List queryAttraktion(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion as Attraktion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Attraktion", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion[] listAttraktionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAttraktion(session, condition, orderBy);
			return (Attraktion[]) list.toArray(new Attraktion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion[] listAttraktionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAttraktion(session, condition, orderBy, lockMode);
			return (Attraktion[]) list.toArray(new Attraktion[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion loadAttraktionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadAttraktionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion loadAttraktionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadAttraktionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion loadAttraktionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Attraktion[] attraktions = listAttraktionByQuery(session, condition, orderBy);
		if (attraktions != null && attraktions.length > 0)
			return attraktions[0];
		else
			return null;
	}
	
	public static Attraktion loadAttraktionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Attraktion[] attraktions = listAttraktionByQuery(session, condition, orderBy, lockMode);
		if (attraktions != null && attraktions.length > 0)
			return attraktions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAttraktionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateAttraktionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAttraktionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateAttraktionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAttraktionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion as Attraktion");
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
	
	public static java.util.Iterator iterateAttraktionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion as Attraktion");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Attraktion", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion createAttraktion() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion();
	}
	
	public static boolean save(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion attraktion) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().saveObject(attraktion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion attraktion) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().deleteObject(attraktion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion attraktion)throws PersistentException {
		try {
			if (attraktion.getVeranstalter() != null) {
				attraktion.getVeranstalter().veranstaltungen.remove(attraktion);
			}
			
			if (attraktion.getManager() != null) {
				attraktion.getManager().veranstaltungen.remove(attraktion);
			}
			
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung[] lBewertungens = attraktion.bewertungen.toArray();
			for(int i = 0; i < lBewertungens.length; i++) {
				lBewertungens[i].setVeranstaltung(null);
			}
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer[] lBesuchers = attraktion.besucher.toArray();
			for(int i = 0; i < lBesuchers.length; i++) {
				lBesuchers[i].veranstaltung.remove(attraktion);
			}
			if (attraktion.getTicket() != null) {
				attraktion.getTicket().setVeranstaltung(null);
			}
			
			return delete(attraktion);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion attraktion, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (attraktion.getVeranstalter() != null) {
				attraktion.getVeranstalter().veranstaltungen.remove(attraktion);
			}
			
			if (attraktion.getManager() != null) {
				attraktion.getManager().veranstaltungen.remove(attraktion);
			}
			
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung[] lBewertungens = attraktion.bewertungen.toArray();
			for(int i = 0; i < lBewertungens.length; i++) {
				lBewertungens[i].setVeranstaltung(null);
			}
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer[] lBesuchers = attraktion.besucher.toArray();
			for(int i = 0; i < lBesuchers.length; i++) {
				lBesuchers[i].veranstaltung.remove(attraktion);
			}
			if (attraktion.getTicket() != null) {
				attraktion.getTicket().setVeranstaltung(null);
			}
			
			try {
				session.delete(attraktion);
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
	
	public static boolean refresh(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion attraktion) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().refresh(attraktion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Attraktion attraktion) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().evict(attraktion);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Attraktion loadAttraktionByCriteria(AttraktionCriteria attraktionCriteria) {
		Attraktion[] attraktions = listAttraktionByCriteria(attraktionCriteria);
		if(attraktions == null || attraktions.length == 0) {
			return null;
		}
		return attraktions[0];
	}
	
	public static Attraktion[] listAttraktionByCriteria(AttraktionCriteria attraktionCriteria) {
		return attraktionCriteria.listAttraktion();
	}
}
