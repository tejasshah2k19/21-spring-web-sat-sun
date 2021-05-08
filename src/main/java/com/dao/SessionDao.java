package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.StudentBean;

//@Controller
//@Repository
//@Service
//@Component

@Repository
public class SessionDao {

	@Autowired
	JdbcTemplate stmt;

	public StudentBean authenticate(String email, String password) {
		StudentBean student = null;
		try {

			student = stmt.queryForObject("select * from student where email = ? and password = ?",
					new Object[] { email, password }, new BeanPropertyRowMapper<StudentBean>(StudentBean.class));

		} catch (Exception e) {
			System.out.println("no student found...");
			e.printStackTrace();
		}
		return student;
	}

}
