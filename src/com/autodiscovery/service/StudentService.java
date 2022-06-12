package com.autodiscovery.service;

import com.autodiscovery.dto.Student;

public interface StudentService {
	public void addStudent(Student student);
	public void removeStudent(Student student);
	public void updateStudent(Student student);
}
