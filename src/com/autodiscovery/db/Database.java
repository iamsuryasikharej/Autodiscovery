package com.autodiscovery.db;

import java.util.ArrayList;

import com.autodiscovery.dto.Student;

public class Database {
	public static ArrayList<Student> db=new ArrayList<Student>();
	static
	{
		Student student1=new Student();
		student1.setName("surya");
		student1.setId("112");
		Student student2=new Student();
		student2.setName("shreya");
		student1.setId("117");
		db.add(student1);
		db.add(student2);
		
		
	}
	

}
