package com.connexiz.app.reveng;
// Generated Aug 12, 2016 9:43:28 PM by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Teacher.
 * @see com.connexiz.app.reveng.Teacher
 * @author Hibernate Tools
 */
@Stateless
public class TeacherHome {

	private static final Log log = LogFactory.getLog(TeacherHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Teacher transientInstance) {
		log.debug("persisting Teacher instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Teacher persistentInstance) {
		log.debug("removing Teacher instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Teacher merge(Teacher detachedInstance) {
		log.debug("merging Teacher instance");
		try {
			Teacher result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Teacher findById(Integer id) {
		log.debug("getting Teacher instance with id: " + id);
		try {
			Teacher instance = entityManager.find(Teacher.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
