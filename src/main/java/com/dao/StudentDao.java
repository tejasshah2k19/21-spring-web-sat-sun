package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.ProductBean;
import com.bean.StudentBean;

@Repository
public class StudentDao {

	@Autowired // this will ask ioc container for jdbcTempalte instance -- [singleton]
	JdbcTemplate stmt;

	public void insertStudent(StudentBean student) {
		// insert update delete

		stmt.update("insert into student (firstName,email,password) values (?,?,?)", student.getFirstName(),
				student.getEmail(), student.getPassword());

	}

	public void updateProfilePath(int studentId, String path) {

		stmt.update("update student set profilePicPath = ? where studentId = ?",path,studentId);
	}

}
