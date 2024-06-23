package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entities.Student1;

public class RowMapperImpl implements RowMapper<Student1> {

	@Override
	public Student1 mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student1 student1 = new Student1();
		student1.setId(rs.getInt(1));
		student1.setName(rs.getString(2));
		student1.setCity(rs.getString(3));
		return student1;
	}

}
