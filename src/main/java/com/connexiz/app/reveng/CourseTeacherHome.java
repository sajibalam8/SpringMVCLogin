package com.connexiz.app.reveng;
// Generated Aug 12, 2016 9:43:28 PM by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CourseTeacher.
 * @see com.connexiz.app.reveng.CourseTeacher
 * @author Hibernate Tools
 */
@Stateless
public class CourseTeacherHome {

	private static final Log log = LogFactory.getLog(CourseTeacherHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CourseTeacher transientInstance) {
		log.debug("persisting CourseTeacher instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CourseTeacher persistentInstance) {
		log.debug("removing CourseTeacher instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CourseTeacher merge(CourseTeacher detachedInstance) {
		log.debug("merging CourseTeacher instance");
		try {
			CourseTeacher result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CourseTeacher findById(CourseTeacherId id) {
		log.debug("getting CourseTeacher instance with id: " + id);
		try {
			CourseTeacher instance = entityManager.find(CourseTeacher.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
