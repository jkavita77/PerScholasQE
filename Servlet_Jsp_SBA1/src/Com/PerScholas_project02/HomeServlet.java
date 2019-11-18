package Com.PerScholas_project02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/Login.jsp");
        rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String UserName=request.getParameter("userName");
        System.out.println(UserName);
        String PassWord=request.getParameter("password");
        System.out.println(PassWord);
//        String storedpaasowrd="pass111";
//        if(storedpaasowrd.equals(PassWord)) {
//            System.out.println("login succesful");
//        }
//        else
//            System.out.println("Invalid Login");
//    
        
    }
		
}
