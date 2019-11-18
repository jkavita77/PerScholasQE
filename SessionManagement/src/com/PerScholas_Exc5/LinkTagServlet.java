package com.PerScholas_Exc5;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LinkTagServlet")
public class LinkTagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LinkTagServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Morning = request.getParameter("param");
		String Evening = request.getParameter("param1");
		
		if (Morning != null)  {
			System.out.println("Morning");
			
		}
		if(Evening != null)
		{
			System.out.println("Evening");
		}
		//String greeting = request.getParameter("param");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/UrlRewrite.jsp");
        rd.forward(request, response);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
