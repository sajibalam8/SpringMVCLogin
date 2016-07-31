package com.connexiz.app.service;

import com.connexiz.app.domain.Student;

public class StudentService {
	 
	public Student getStudent(){
		
		Student student =new Student();
		student.setFirstName("Sajib");
		student.setLastName("Alam");
		
		return student;
		
	}
	
	 
		public void setStudent(Student student){
			
			student.setFirstName("Sajib");
			student.setLastName("Alam");
			
			//return student;
			
		}


}
