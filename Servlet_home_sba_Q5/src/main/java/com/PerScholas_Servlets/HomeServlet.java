package com.PerScholas_Servlets;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.PerScholas_HI_Class.User;
import com.PerScholas_HI_DAO.UserDAO;

@WebServlet({ "/HomeServlet", "/HomeServlet/*" })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = null;
		String servletPath = request.getServletPath();
		String pathInfo = request.getPathInfo();

		/*
		 * If there are no characters after the servlet path (pathInfo will be null) or
		 * if the servlet path is followed by a single "/" then the action string will
		 * be assigned only the servlet path. If there is a slash followed by any
		 * characters, then the action string will be assigned the servlet path plus the
		 * additional path information.
		 */
		if (pathInfo == null || pathInfo.equals("/")) {
			action = servletPath;
		} else {
			action = servletPath + pathInfo;
		}

		try {
			switch (action) {
			case "/HomeServlet":
				showLogin(request, response);
				break;
			case "/HomeServlet/loginUser":
				loginUser(request, response);
				break;
			case "/HomeServlet/showRegistration":
				showRegistration(request, response);
				break;
			case "/HomeServlet/registerUser":
				registerUser(request, response);
				break;
			default:
				showLogin(request, response);
				break;
			}
		} catch (IOException | SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void showLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Login.jsp");
		rd.forward(request, response);
	}

	private void loginUser(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String name = request.getParameter("fname");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();

		System.out.println("name :" + name);
		System.out.println("password :" + password);
		UserDAO u_dao = new UserDAO();
		User u = u_dao.getUserByName(name);

		if (u != null) {
			if (password.equals(u.getPassword())) {
				session.setAttribute("currentMember", u);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Welcome.jsp");
				System.out.println("** Success");
				rd.forward(request, response);
			} else {
				request.setAttribute("errorMessage", "Invalid login-password");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Login.jsp");
				System.out.println("** Password Failure");
				rd.forward(request, response);
			}
		} else {
			request.setAttribute("errorMessage", "Invalid login-user name");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Login.jsp");
			System.out.println("** ID Failure");
			rd.forward(request, response);
		}
	}
	private void showRegistration(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Registration.jsp");
		rd.forward(request, response);
	}
	private void registerUser(HttpServletRequest request, HttpServletResponse response) 
			throws ClassNotFoundException, SQLException, IOException, ServletException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println("fname :"+fname);
		System.out.println("lname :"+lname);
		System.out.println("email :"+email);
		System.out.println("password :"+password);
		
		
		User u = new User();
		u.setUFirstname(fname);
		u.setULastname(lname);
		u.setEmail(email);
		u.setPassword(password);
		
		
		UserDAO u_dao = new UserDAO();
		Integer i = u_dao.registerUser(u);
		System.out.println("****: i ="+i);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/Login.jsp");
		rd.forward(request, response);
	}
}
