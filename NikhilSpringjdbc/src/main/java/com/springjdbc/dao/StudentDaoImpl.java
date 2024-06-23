package com.springjdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student1;


public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Student1 student1) {
		String query="create table student1(id int primary key,name varchar(100) not null, city varchar(50) not null)";
		int create = this.jdbcTemplate.update(query);
		return create;
	}

	@Override
	public int insert(Student1 student1) {
		String query="insert into student1(id,name,city) values(?,?,?)";
		int insert = this.jdbcTemplate.update(query,student1.getId(),student1.getName(),student1.getCity());
		return insert;
	}

	@Override
	public int update(Student1 student1) {
		String query="update student1 set name=?, city=? where id=?";
		int update = this.jdbcTemplate.update(query,student1.getName(),student1.getCity(),student1.getId());
		return update;
	}

	@Override
	public int delete(int studentid) {
		String query="delete from student1 where id=?";
		int delete = this.jdbcTemplate.update(query,studentid);
		return delete;
	}

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Student1 getStudent(int studentid) {
		String query = "select * from student1 where id=?";
		RowMapper<Student1> rowMapper = new RowMapperImpl();
		Student1 student = this.jdbcTemplate.queryForObject(query, rowMapper,studentid);
		return student;
	}

	@Override
	public List<Student1> getAllStudent() {
		String query="select * from student1";
		List<Student1> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}
	
	

}
