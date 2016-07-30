package com.connexiz.app.service;

import com.connexiz.app.domain.Student;

public class StudentService {
	 
	public Student getstudent(){
		
		Student student =new Student();
		student.setFirstName("Sajib");
		student.setLastName("Alam");
		
		return student;
		
	}


}
