package com.connexiz.app.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.connexiz.app.service.StudentService;

@Controller

public class StudentController {

	@Autowired(required = true)
	@Qualifier(value = "studentService")
	StudentService studentService;

	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String student(Locale locale, Model model) {

		model.addAttribute("student", this.studentService.getstudent());

		return "student";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login (Locale locale, Model model) {


		return "login";
	}
	
	@RequestMapping(value = "/loginSubmit", method = RequestMethod.GET)
	public String loginSubmit (Locale locale, Model model) {


		return "profile";
	}

}
