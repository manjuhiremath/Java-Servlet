package com.javaDemo.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaDemo.web.dao.StudentDao;
import com.javaDemo.web.model.Student;


/**
 * Servlet implementation class GetAlienController
 */
@SuppressWarnings("serial")
public class GetStudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sid = Integer.parseInt(request.getParameter("sid"));
		StudentDao dao  = new StudentDao();
		Student s = dao.getStudent(sid);
		
		HttpSession session = request.getSession();
		session.setAttribute("student", s);
		
		response.sendRedirect("index.jsp");
	}

	

}

