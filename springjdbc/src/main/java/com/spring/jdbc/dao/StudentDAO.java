package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.model.Student;

public interface StudentDAO {
	public Student getStudnet(int id);
	public List<Student> getAllStudents();
}
