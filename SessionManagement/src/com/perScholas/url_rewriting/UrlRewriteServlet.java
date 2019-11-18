package com.perScholas.url_rewriting;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UrlRewriteServlet")
public class UrlRewriteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UrlRewriteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String greeting = request.getParameter("greeting");
		
		if (name != null && greeting != null) {
			System.out.println(greeting + " "+name);
		}
		
	
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/UrlRewrite.jsp");
        rd.forward(request, response);
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
