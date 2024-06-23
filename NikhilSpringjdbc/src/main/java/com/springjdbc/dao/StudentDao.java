package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entities.Student1;

public interface StudentDao {
	
	public int create(Student1 student1);
	
	public int insert(Student1 student1);
	
	public int update(Student1 student1);
	
	public int delete(int studentid);
	
	public Student1 getStudent(int studentid);
	
	public List<Student1> getAllStudent();
	
	

}
