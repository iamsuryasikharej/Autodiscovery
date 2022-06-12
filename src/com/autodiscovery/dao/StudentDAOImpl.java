package com.autodiscovery.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.autodiscovery.db.Database;
import com.autodiscovery.dto.Student;
@Repository
public class StudentDAOImpl implements StudentDAO{

	@Override
	public void addStudent(Student student) {
		ArrayList<Student> al=Database.db;
		if(al.contains(student))
		{
			System.out.println("Already in db");
		}
		else
		{
			al.add(student);
		}
		
	}

	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

}
