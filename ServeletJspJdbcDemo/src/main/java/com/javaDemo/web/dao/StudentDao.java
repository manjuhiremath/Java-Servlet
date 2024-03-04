package com.javaDemo.web.dao;

import java.sql.*;

import com.javaDemo.web.model.Student;

public class StudentDao{
	public Student getStudent(int sid){
		Student s = new Student();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaDemo","root","");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from students where s_id="+sid);
			if(rs.next()) {
				s.setSid(rs.getInt("s_id"));
				s.setName(rs.getString("name"));
				s.setGender(rs.getString("gender"));
				s.setLocation(rs.getString("location"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}	
		return s;
	}

}