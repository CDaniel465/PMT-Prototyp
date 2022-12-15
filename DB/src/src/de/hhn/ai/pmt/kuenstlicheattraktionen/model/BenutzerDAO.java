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

public class BenutzerDAO {
	public static Benutzer loadBenutzerByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadBenutzerByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer getBenutzerByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getBenutzerByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadBenutzerByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer getBenutzerByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getBenutzerByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Benutzer) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer getBenutzerByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Benutzer) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Benutzer) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer getBenutzerByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Benutzer) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBenutzer(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryBenutzer(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBenutzer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryBenutzer(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer[] listBenutzerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listBenutzerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer[] listBenutzerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listBenutzerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryBenutzer(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer as Benutzer");
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
	
	public static List queryBenutzer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer as Benutzer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Benutzer", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer[] listBenutzerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBenutzer(session, condition, orderBy);
			return (Benutzer[]) list.toArray(new Benutzer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer[] listBenutzerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBenutzer(session, condition, orderBy, lockMode);
			return (Benutzer[]) list.toArray(new Benutzer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadBenutzerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadBenutzerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Benutzer[] benutzers = listBenutzerByQuery(session, condition, orderBy);
		if (benutzers != null && benutzers.length > 0)
			return benutzers[0];
		else
			return null;
	}
	
	public static Benutzer loadBenutzerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Benutzer[] benutzers = listBenutzerByQuery(session, condition, orderBy, lockMode);
		if (benutzers != null && benutzers.length > 0)
			return benutzers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateBenutzerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateBenutzerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBenutzerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateBenutzerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateBenutzerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer as Benutzer");
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
	
	public static java.util.Iterator iterateBenutzerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer as Benutzer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Benutzer", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer createBenutzer() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer();
	}
	
	public static boolean save(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer benutzer) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().saveObject(benutzer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer benutzer) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().deleteObject(benutzer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer benutzer)throws PersistentException {
		try {
			if (benutzer.getGruppe() != null) {
				benutzer.getGruppe().mitglieder.remove(benutzer);
			}
			
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung[] lBewertungens = benutzer.bewertungen.toArray();
			for(int i = 0; i < lBewertungens.length; i++) {
				lBewertungens[i].setBewerter(null);
			}
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung[] lVeranstaltungs = benutzer.veranstaltung.toArray();
			for(int i = 0; i < lVeranstaltungs.length; i++) {
				lVeranstaltungs[i].besucher.remove(benutzer);
			}
			if (benutzer.getTicket() != null) {
				benutzer.getTicket().setBenutzer(null);
			}
			
			return delete(benutzer);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer benutzer, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (benutzer.getGruppe() != null) {
				benutzer.getGruppe().mitglieder.remove(benutzer);
			}
			
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Bewertung[] lBewertungens = benutzer.bewertungen.toArray();
			for(int i = 0; i < lBewertungens.length; i++) {
				lBewertungens[i].setBewerter(null);
			}
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung[] lVeranstaltungs = benutzer.veranstaltung.toArray();
			for(int i = 0; i < lVeranstaltungs.length; i++) {
				lVeranstaltungs[i].besucher.remove(benutzer);
			}
			if (benutzer.getTicket() != null) {
				benutzer.getTicket().setBenutzer(null);
			}
			
			try {
				session.delete(benutzer);
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
	
	public static boolean refresh(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer benutzer) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().refresh(benutzer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer benutzer) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().evict(benutzer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Benutzer loadBenutzerByCriteria(BenutzerCriteria benutzerCriteria) {
		Benutzer[] benutzers = listBenutzerByCriteria(benutzerCriteria);
		if(benutzers == null || benutzers.length == 0) {
			return null;
		}
		return benutzers[0];
	}
	
	public static Benutzer[] listBenutzerByCriteria(BenutzerCriteria benutzerCriteria) {
		return benutzerCriteria.listBenutzer();
	}
}
