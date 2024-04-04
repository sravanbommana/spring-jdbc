package com.spring.jdbc.dao;

import com.spring.jdbc.model.Student;

public interface StudentDAO {
	public int insert(Student student);
	public int update(Student student);
	public int delete(Student student);
}
