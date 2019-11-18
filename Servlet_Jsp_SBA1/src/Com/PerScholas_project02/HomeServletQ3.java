package Com.PerScholas_project02;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet({ "/HomeServletQ3", "/HomeServletQ3/*" })
public class HomeServletQ3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * The action string will be assigned the URL route and determine which servlet
		 * method gets called by using a switch block.
		 */
		String action = null;
		String servletPath = request.getServletPath();
		String pathInfo = request.getPathInfo();
		System.out.println("** My pathInfo :" + pathInfo);

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
		// Verify the action string by printing to the console
		System.out.println("Action :" + action);

		try {
			switch (action) {
			case "/HomeServletQ3":
				showLogin(request, response);
				break;
			case "/HomeServletQ3/loginMember":
				loginMember(request, response);
				break;
			case "/HomeServletQ3/showWelcomePage":
				showWelcomePage(request, response);
				break;
//			case "/HomeServletQ3/showRegistration":
//				showRegistration(request, response);
//				break;
		
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
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/LoginPage.jsp");
		rd.forward(request, response);
	}

	private void loginMember(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();

		System.out.println("name :" + name);
		System.out.println("password :" + password);
		UserDAO u_dao = new UserDAO();
		User u = u_dao.getUserByName(name);
		System.out.println(u);
		
		if (u != null) {
			if (password.equals(u.getPassword())) {
				session.setAttribute("currentMember", u);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/WelcomePage.jsp");
				System.out.println("** Success");
				rd.forward(request, response);
			} else {
				request.setAttribute("errorMessage", "Invalid login-password");
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/LoginPage.jsp");
				System.out.println("** Password Failure");
				rd.forward(request, response);
			}
		} else {
			request.setAttribute("errorMessage", "Invalid login-user name");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/LoginPage.jsp");
			System.out.println("** ID Failure");
			rd.forward(request, response);
		}
	}

	private void showWelcomePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/WelcomePage.jsp");
		rd.forward(request, response);
	}

	

	
}
