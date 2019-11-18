package Com.PerScholas_project04;


	import java.io.IOException;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

import Com.PerScholas_project02.User;
import Com.PerScholas_project02.UserDAO;

	import java.io.IOException;
	import java.sql.SQLException;



	public class UpdateTest {
		public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException
		{
			User user = new User(2,"kavi","kav11");
			UserDAO udao = new UserDAO();
			boolean flag = u_dao.updateUser(user);
			System.out.println(flag);
		}
	}

