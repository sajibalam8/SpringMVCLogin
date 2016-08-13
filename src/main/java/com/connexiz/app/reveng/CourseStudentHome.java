package com.connexiz.app.reveng;
// Generated Aug 12, 2016 9:43:28 PM by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CourseStudent.
 * @see com.connexiz.app.reveng.CourseStudent
 * @author Hibernate Tools
 */
@Stateless
public class CourseStudentHome {

	private static final Log log = LogFactory.getLog(CourseStudentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CourseStudent transientInstance) {
		log.debug("persisting CourseStudent instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CourseStudent persistentInstance) {
		log.debug("removing CourseStudent instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CourseStudent merge(CourseStudent detachedInstance) {
		log.debug("merging CourseStudent instance");
		try {
			CourseStudent result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CourseStudent findById(CourseStudentId id) {
		log.debug("getting CourseStudent instance with id: " + id);
		try {
			CourseStudent instance = entityManager.find(CourseStudent.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
