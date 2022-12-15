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

public class GruppeDAO {
	public static Gruppe loadGruppeByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadGruppeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe getGruppeByORMID(Integer id) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getGruppeByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe loadGruppeByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadGruppeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe getGruppeByORMID(Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getGruppeByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe loadGruppeByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Gruppe) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe getGruppeByORMID(PersistentSession session, Integer id) throws PersistentException {
		try {
			return (Gruppe) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe.class, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe loadGruppeByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Gruppe) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe getGruppeByORMID(PersistentSession session, Integer id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Gruppe) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe.class, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGruppe(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryGruppe(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGruppe(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryGruppe(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe[] listGruppeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listGruppeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe[] listGruppeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listGruppeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGruppe(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe as Gruppe");
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
	
	public static List queryGruppe(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe as Gruppe");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Gruppe", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe[] listGruppeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGruppe(session, condition, orderBy);
			return (Gruppe[]) list.toArray(new Gruppe[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe[] listGruppeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryGruppe(session, condition, orderBy, lockMode);
			return (Gruppe[]) list.toArray(new Gruppe[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe loadGruppeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadGruppeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe loadGruppeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadGruppeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe loadGruppeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Gruppe[] gruppes = listGruppeByQuery(session, condition, orderBy);
		if (gruppes != null && gruppes.length > 0)
			return gruppes[0];
		else
			return null;
	}
	
	public static Gruppe loadGruppeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Gruppe[] gruppes = listGruppeByQuery(session, condition, orderBy, lockMode);
		if (gruppes != null && gruppes.length > 0)
			return gruppes[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGruppeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateGruppeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGruppeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateGruppeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGruppeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe as Gruppe");
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
	
	public static java.util.Iterator iterateGruppeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe as Gruppe");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Gruppe", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe createGruppe() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe();
	}
	
	public static boolean save(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe gruppe) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().saveObject(gruppe);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe gruppe) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().deleteObject(gruppe);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe gruppe)throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket[] lGruppentickets = gruppe.gruppenticket.toArray();
			for(int i = 0; i < lGruppentickets.length; i++) {
				lGruppentickets[i].setBesuchergruppe(null);
			}
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer[] lMitglieders = gruppe.mitglieder.toArray();
			for(int i = 0; i < lMitglieders.length; i++) {
				lMitglieders[i].setGruppe(null);
			}
			return delete(gruppe);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe gruppe, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Ticket[] lGruppentickets = gruppe.gruppenticket.toArray();
			for(int i = 0; i < lGruppentickets.length; i++) {
				lGruppentickets[i].setBesuchergruppe(null);
			}
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Benutzer[] lMitglieders = gruppe.mitglieder.toArray();
			for(int i = 0; i < lMitglieders.length; i++) {
				lMitglieders[i].setGruppe(null);
			}
			try {
				session.delete(gruppe);
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
	
	public static boolean refresh(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe gruppe) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().refresh(gruppe);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Gruppe gruppe) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().evict(gruppe);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Gruppe loadGruppeByCriteria(GruppeCriteria gruppeCriteria) {
		Gruppe[] gruppes = listGruppeByCriteria(gruppeCriteria);
		if(gruppes == null || gruppes.length == 0) {
			return null;
		}
		return gruppes[0];
	}
	
	public static Gruppe[] listGruppeByCriteria(GruppeCriteria gruppeCriteria) {
		return gruppeCriteria.listGruppe();
	}
}
