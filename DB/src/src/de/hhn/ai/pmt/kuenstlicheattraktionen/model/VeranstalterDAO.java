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

public class VeranstalterDAO {
	public static Veranstalter loadVeranstalterByORMID(String nachname) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadVeranstalterByORMID(session, nachname);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter getVeranstalterByORMID(String nachname) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getVeranstalterByORMID(session, nachname);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter loadVeranstalterByORMID(String nachname, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadVeranstalterByORMID(session, nachname, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter getVeranstalterByORMID(String nachname, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getVeranstalterByORMID(session, nachname, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter loadVeranstalterByORMID(PersistentSession session, String nachname) throws PersistentException {
		try {
			return (Veranstalter) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter.class, nachname);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter getVeranstalterByORMID(PersistentSession session, String nachname) throws PersistentException {
		try {
			return (Veranstalter) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter.class, nachname);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter loadVeranstalterByORMID(PersistentSession session, String nachname, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Veranstalter) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter.class, nachname, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter getVeranstalterByORMID(PersistentSession session, String nachname, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Veranstalter) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter.class, nachname, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVeranstalter(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryVeranstalter(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVeranstalter(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return queryVeranstalter(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter[] listVeranstalterByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listVeranstalterByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter[] listVeranstalterByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listVeranstalterByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVeranstalter(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter as Veranstalter");
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
	
	public static List queryVeranstalter(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter as Veranstalter");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Veranstalter", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter[] listVeranstalterByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVeranstalter(session, condition, orderBy);
			return (Veranstalter[]) list.toArray(new Veranstalter[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter[] listVeranstalterByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVeranstalter(session, condition, orderBy, lockMode);
			return (Veranstalter[]) list.toArray(new Veranstalter[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter loadVeranstalterByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadVeranstalterByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter loadVeranstalterByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadVeranstalterByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter loadVeranstalterByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Veranstalter[] veranstalters = listVeranstalterByQuery(session, condition, orderBy);
		if (veranstalters != null && veranstalters.length > 0)
			return veranstalters[0];
		else
			return null;
	}
	
	public static Veranstalter loadVeranstalterByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Veranstalter[] veranstalters = listVeranstalterByQuery(session, condition, orderBy, lockMode);
		if (veranstalters != null && veranstalters.length > 0)
			return veranstalters[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVeranstalterByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateVeranstalterByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVeranstalterByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateVeranstalterByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVeranstalterByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter as Veranstalter");
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
	
	public static java.util.Iterator iterateVeranstalterByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter as Veranstalter");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Veranstalter", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter createVeranstalter() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter();
	}
	
	public static boolean save(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter veranstalter) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().saveObject(veranstalter);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter veranstalter) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().deleteObject(veranstalter);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter veranstalter)throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung[] lVeranstaltungens = veranstalter.veranstaltungen.toArray();
			for(int i = 0; i < lVeranstaltungens.length; i++) {
				lVeranstaltungens[i].setVeranstalter(null);
			}
			return delete(veranstalter);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter veranstalter, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung[] lVeranstaltungens = veranstalter.veranstaltungen.toArray();
			for(int i = 0; i < lVeranstaltungens.length; i++) {
				lVeranstaltungens[i].setVeranstalter(null);
			}
			try {
				session.delete(veranstalter);
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
	
	public static boolean refresh(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter veranstalter) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().refresh(veranstalter);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstalter veranstalter) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().evict(veranstalter);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Veranstalter loadVeranstalterByCriteria(VeranstalterCriteria veranstalterCriteria) {
		Veranstalter[] veranstalters = listVeranstalterByCriteria(veranstalterCriteria);
		if(veranstalters == null || veranstalters.length == 0) {
			return null;
		}
		return veranstalters[0];
	}
	
	public static Veranstalter[] listVeranstalterByCriteria(VeranstalterCriteria veranstalterCriteria) {
		return veranstalterCriteria.listVeranstalter();
	}
}
