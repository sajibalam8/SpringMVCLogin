package com.connexiz.app.reveng;
// Generated Aug 12, 2016 9:43:28 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CourseStudent generated by hbm2java
 */
@Entity
@Table(name = "course_student", catalog = "studentdb")
public class CourseStudent implements java.io.Serializable {

	private CourseStudentId id;

	public CourseStudent() {
	}

	public CourseStudent(CourseStudentId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "courseId", column = @Column(name = "courseID", nullable = false)),
			@AttributeOverride(name = "studentId", column = @Column(name = "studentID", nullable = false)),
			@AttributeOverride(name = "grade", column = @Column(name = "grade", length = 20)) })
	public CourseStudentId getId() {
		return this.id;
	}

	public void setId(CourseStudentId id) {
		this.id = id;
	}

}