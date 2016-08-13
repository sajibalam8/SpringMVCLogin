package com.connexiz.app.reveng;
// Generated Aug 12, 2016 9:43:28 PM by Hibernate Tools 5.1.0.Beta1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Course generated by hbm2java
 */
@Entity
@Table(name = "course", catalog = "studentdb")
public class Course implements java.io.Serializable {

	private Integer courseId;
	private String courseName;
	private String courseSection;
	private String courseSession;
	private Date courseTime;

	public Course() {
	}

	public Course(String courseName, String courseSection, String courseSession, Date courseTime) {
		this.courseName = courseName;
		this.courseSection = courseSection;
		this.courseSession = courseSession;
		this.courseTime = courseTime;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "courseID", unique = true, nullable = false)
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	@Column(name = "courseName", length = 20)
	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Column(name = "courseSection", length = 20)
	public String getCourseSection() {
		return this.courseSection;
	}

	public void setCourseSection(String courseSection) {
		this.courseSection = courseSection;
	}

	@Column(name = "courseSession", length = 20)
	public String getCourseSession() {
		return this.courseSession;
	}

	public void setCourseSession(String courseSession) {
		this.courseSession = courseSession;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "courseTime", length = 8)
	public Date getCourseTime() {
		return this.courseTime;
	}

	public void setCourseTime(Date courseTime) {
		this.courseTime = courseTime;
	}

}