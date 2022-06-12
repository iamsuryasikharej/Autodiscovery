package com.autodiscovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.autodiscovery.dto.Student;
import com.autodiscovery.service.StudentService;

@Controller("studentcontroller")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	public void addStudent()
	{
		System.out.println(studentService);
	}
	public void removeStudent()
	{
		
	}
	public void updateStudent()
	{
		
	}
}
