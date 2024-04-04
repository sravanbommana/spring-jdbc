package com.spring.jdbc.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.model.Student;

public class StudentDAOImpl implements StudentDAO{

	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
        String query = "insert into student (name, city) values (?,?)";
        int result = this.jdbcTemplate.update(query, student.getName(), student.getCity());
        return result;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int update(Student student) {
		String query = "update student set name=?, city=? where id=?";
        int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), 2);
        return result;
	}
	public int delete(Student student) {
		String query = "delete from  student where name=?";
        int result = this.jdbcTemplate.update(query, student.getName());
        return result;
	}

}
