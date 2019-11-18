package com.PerScholas_Servlet_Excercise;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/XmlMappedServlet")
public class XmlMappedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		response.getWriter().append("My first xml servlet!");
	}

}
