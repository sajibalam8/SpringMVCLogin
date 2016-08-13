package com.connexiz.app.reveng;
// Generated Aug 12, 2016 9:43:28 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CourseTeacher generated by hbm2java
 */
@Entity
@Table(name = "course_teacher", catalog = "studentdb")
public class CourseTeacher implements java.io.Serializable {

	private CourseTeacherId id;

	public CourseTeacher() {
	}

	public CourseTeacher(CourseTeacherId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "courseId", column = @Column(name = "courseID")),
			@AttributeOverride(name = "teacherId", column = @Column(name = "teacherID")),
			@AttributeOverride(name = "rating", column = @Column(name = "rating", length = 20)) })
	public CourseTeacherId getId() {
		return this.id;
	}

	public void setId(CourseTeacherId id) {
		this.id = id;
	}

}
