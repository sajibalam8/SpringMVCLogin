package com.connexiz.app.reveng;
// Generated Aug 12, 2016 9:43:28 PM by Hibernate Tools 5.1.0.Beta1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * StudentTeacher generated by hbm2java
 */
@Entity
@Table(name = "student_teacher", catalog = "studentdb")
public class StudentTeacher implements java.io.Serializable {

	private StudentTeacherId id;
	private Student student;
	private Teacher teacher;
	private String comments;

	public StudentTeacher() {
	}

	public StudentTeacher(StudentTeacherId id, Student student, Teacher teacher) {
		this.id = id;
		this.student = student;
		this.teacher = teacher;
	}

	public StudentTeacher(StudentTeacherId id, Student student, Teacher teacher, String comments) {
		this.id = id;
		this.student = student;
		this.teacher = teacher;
		this.comments = comments;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "studentId", column = @Column(name = "studentID", nullable = false)),
			@AttributeOverride(name = "teacherId", column = @Column(name = "teacherID", nullable = false)) })
	public StudentTeacherId getId() {
		return this.id;
	}

	public void setId(StudentTeacherId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "studentID", nullable = false, insertable = false, updatable = false)
	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "teacherID", nullable = false, insertable = false, updatable = false)
	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Column(name = "comments", length = 11)
	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}