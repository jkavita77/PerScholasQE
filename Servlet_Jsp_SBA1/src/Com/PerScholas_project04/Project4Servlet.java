package Com.PerScholas_project04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.PerScholas_project02.User;
import Com.PerScholas_project02.UserDAO;



/**
 * Servlet implementation class Project4Servlet
 */
@WebServlet("/Project4Servlet")
public class Project4Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Project4Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/index4.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDAO udao = new UserDAO();
		User user = null;

		try {
			user= u_dao.getUserByName(user_name);
			System.out.println(user);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}

		if (user.getPassword().equals(password)) {
			request.setAttribute("uid", user.getUser_id());
			request.setAttribute("username", user.getUser_name());
			request.setAttribute("password", user.getPassword());
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/UserProfile.jsp");
			rd.forward(request, response);
		} else {
			doGet(request, response);
		}
	}

}
