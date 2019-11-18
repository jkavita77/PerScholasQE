package com.PerScholas_Exc_10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Coursesservlet")
public class Coursesservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       RequestDispatcher rd = null;
       
 	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <Course> courselist = new ArrayList<>();
		Course course = null;
		Object[][] dataArr = {{1, "QEA", "QualityEnginnering"}, {2, "DE", "ApplicationEngg"}};
		for (Object[] O : dataArr) {
		course = new Course((Integer)O[0], (String)O[1], (String)O[2] );
		courselist.add(course);
		}
	request.setAttribute("Schoolname", "PerScholas");
	request.setAttribute("courselist", "courselist");
	rd = request.getRequestDispatcher("WEB-INF/Views/CoursePage.jsp");
	rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
