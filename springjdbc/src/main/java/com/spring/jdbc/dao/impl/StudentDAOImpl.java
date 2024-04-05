package com.spring.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.model.Student;

@Component("studentDao")
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Student getStudnet(int id) {
		String query = "select * from student where id=?";
		RowMapper rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, id);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		RowMapper rowMapper = new RowMapperImpl();
		List<Student> students = this.jdbcTemplate.query(query, rowMapper);
		return students;
	}
}
