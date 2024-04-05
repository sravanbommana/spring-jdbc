package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.dao.impl.StudentDAOImpl;
import com.spring.jdbc.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting transactions" );
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDAO studentDao = context.getBean("studentDao", StudentDAOImpl.class);
        Student student = studentDao.getStudnet(2);
        List<Student> students = studentDao.getAllStudents();
        System.out.println(students);
    }
}
