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

public class SystemManagerDAO {
	public static SystemManager loadSystemManagerByORMID(String nachname) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadSystemManagerByORMID(session, nachname);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager getSystemManagerByORMID(String nachname) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getSystemManagerByORMID(session, nachname);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager loadSystemManagerByORMID(String nachname, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadSystemManagerByORMID(session, nachname, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager getSystemManagerByORMID(String nachname, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return getSystemManagerByORMID(session, nachname, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager loadSystemManagerByORMID(PersistentSession session, String nachname) throws PersistentException {
		try {
			return (SystemManager) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager.class, nachname);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager getSystemManagerByORMID(PersistentSession session, String nachname) throws PersistentException {
		try {
			return (SystemManager) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager.class, nachname);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager loadSystemManagerByORMID(PersistentSession session, String nachname, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SystemManager) session.load(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager.class, nachname, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager getSystemManagerByORMID(PersistentSession session, String nachname, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SystemManager) session.get(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager.class, nachname, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySystemManager(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return querySystemManager(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySystemManager(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return querySystemManager(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager[] listSystemManagerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listSystemManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager[] listSystemManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return listSystemManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySystemManager(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager as SystemManager");
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
	
	public static List querySystemManager(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager as SystemManager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SystemManager", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager[] listSystemManagerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySystemManager(session, condition, orderBy);
			return (SystemManager[]) list.toArray(new SystemManager[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager[] listSystemManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySystemManager(session, condition, orderBy, lockMode);
			return (SystemManager[]) list.toArray(new SystemManager[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager loadSystemManagerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadSystemManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager loadSystemManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return loadSystemManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager loadSystemManagerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SystemManager[] systemManagers = listSystemManagerByQuery(session, condition, orderBy);
		if (systemManagers != null && systemManagers.length > 0)
			return systemManagers[0];
		else
			return null;
	}
	
	public static SystemManager loadSystemManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SystemManager[] systemManagers = listSystemManagerByQuery(session, condition, orderBy, lockMode);
		if (systemManagers != null && systemManagers.length > 0)
			return systemManagers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSystemManagerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateSystemManagerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSystemManagerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession();
			return iterateSystemManagerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSystemManagerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager as SystemManager");
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
	
	public static java.util.Iterator iterateSystemManagerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager as SystemManager");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SystemManager", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager createSystemManager() {
		return new de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager();
	}
	
	public static boolean save(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager systemManager) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().saveObject(systemManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager systemManager) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().deleteObject(systemManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager systemManager)throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung[] lVeranstaltungens = systemManager.veranstaltungen.toArray();
			for(int i = 0; i < lVeranstaltungens.length; i++) {
				lVeranstaltungens[i].setManager(null);
			}
			return delete(systemManager);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager systemManager, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Veranstaltung[] lVeranstaltungens = systemManager.veranstaltungen.toArray();
			for(int i = 0; i < lVeranstaltungens.length; i++) {
				lVeranstaltungens[i].setManager(null);
			}
			try {
				session.delete(systemManager);
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
	
	public static boolean refresh(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager systemManager) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().refresh(systemManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(de.hhn.ai.pmt.kuenstlicheattraktionen.model.SystemManager systemManager) throws PersistentException {
		try {
			de.hhn.ai.pmt.kuenstlicheattraktionen.model.Buga23PersistentManager.instance().getSession().evict(systemManager);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SystemManager loadSystemManagerByCriteria(SystemManagerCriteria systemManagerCriteria) {
		SystemManager[] systemManagers = listSystemManagerByCriteria(systemManagerCriteria);
		if(systemManagers == null || systemManagers.length == 0) {
			return null;
		}
		return systemManagers[0];
	}
	
	public static SystemManager[] listSystemManagerByCriteria(SystemManagerCriteria systemManagerCriteria) {
		return systemManagerCriteria.listSystemManager();
	}
}
