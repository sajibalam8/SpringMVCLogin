package com.connexiz.app.reveng;
// Generated Aug 12, 2016 9:43:28 PM by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class StudentTeacher.
 * @see com.connexiz.app.reveng.StudentTeacher
 * @author Hibernate Tools
 */
@Stateless
public class StudentTeacherHome {

	private static final Log log = LogFactory.getLog(StudentTeacherHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(StudentTeacher transientInstance) {
		log.debug("persisting StudentTeacher instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(StudentTeacher persistentInstance) {
		log.debug("removing StudentTeacher instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public StudentTeacher merge(StudentTeacher detachedInstance) {
		log.debug("merging StudentTeacher instance");
		try {
			StudentTeacher result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public StudentTeacher findById(StudentTeacherId id) {
		log.debug("getting StudentTeacher instance with id: " + id);
		try {
			StudentTeacher instance = entityManager.find(StudentTeacher.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
