package com.autodiscovery.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autodiscovery.bean.Employee;
import com.autodiscovery.controller.StudentController;

public class Test {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("./applicationContext.xml");
//		Employee employee=(Employee)applicationContext.getBean("employee");
		StudentController studentController=(StudentController)applicationContext.getBean("studentcontroller");
		studentController.addStudent();
	}
}
