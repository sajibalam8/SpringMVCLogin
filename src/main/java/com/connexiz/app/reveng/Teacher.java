package com.connexiz.app.reveng;
// Generated Aug 12, 2016 9:43:28 PM by Hibernate Tools 5.1.0.Beta1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Teacher generated by hbm2java
 */
@Entity
@Table(name = "teacher", catalog = "studentdb")
public class Teacher implements java.io.Serializable {

	private Integer teacherId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String email;
	private String username;
	private String password;
	private Set<StudentTeacher> studentTeachers = new HashSet<StudentTeacher>(0);

	public Teacher() {
	}

	public Teacher(String firstName, String lastName, String address, String city, String state, String zipcode,
			String email, String username, String password, Set<StudentTeacher> studentTeachers) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.email = email;
		this.username = username;
		this.password = password;
		this.studentTeachers = studentTeachers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "teacherID", unique = true, nullable = false)
	public Integer getTeacherId() {
		return this.teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	@Column(name = "firstName", length = 20)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName", length = 20)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "address", length = 20)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "city", length = 20)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", length = 20)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "zipcode", length = 20)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "email", length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "username", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", length = 20)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "teacher")
	public Set<StudentTeacher> getStudentTeachers() {
		return this.studentTeachers;
	}

	public void setStudentTeachers(Set<StudentTeacher> studentTeachers) {
		this.studentTeachers = studentTeachers;
	}

}
