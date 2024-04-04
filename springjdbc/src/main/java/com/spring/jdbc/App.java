package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.dao.impl.StudentDAOImpl;
import com.spring.jdbc.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting transactions" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDAO studentDao = context.getBean("studentDao", StudentDAO.class);
        Student student = new Student();
        student.setCity("Phoenix");
        student.setName("Todd");
        int result = studentDao.insert(student);
        Student student1 = new Student();
        student1.setCity("Newyork");
        student1.setName("Perk");
        int result2 = studentDao.update(student1);
        Student student2 = new Student();
        student2.setName("John");
        System.out.println("Number of students added " + result);
        studentDao.delete(student2);
    }
}
