package com.autodiscovery.dao;

import com.autodiscovery.dto.Student;

public interface StudentDAO {
public void addStudent(Student student);
public void removeStudent(Student student);
public void updateStudent(Student student);
}
