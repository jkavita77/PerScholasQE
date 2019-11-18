package Com.PerScholas_project04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.PerScholas_project02.User;
import Com.PerScholas_project02.UserDAO;



/**
 * Servlet implementation class UpdateUser
 */
@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String user_id;
	private Object user_name;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("user_id",request.getParameter("user_id"));
		request.getRequestDispatcher("WEB-INF/views/UpdateProfile.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String uid = request.getParameter("uid");
		System.out.println("uID: "+uid+" Usename: "+username+" password: "+password);
		User user = new User(Integer.parseInt(uid), username, password);
		UserDAO u_dao = new UserDAO();
		
		
		try {
			u_dao.updateUser(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.setAttribute("username", user.getUser_name());
		request.setAttribute("password", user.getPassword());
		request.setAttribute("uid", user.getUser_id());
		request.getRequestDispatcher("WEB-INF/views/UserProfile.jsp").forward(request, response);
	}

}
