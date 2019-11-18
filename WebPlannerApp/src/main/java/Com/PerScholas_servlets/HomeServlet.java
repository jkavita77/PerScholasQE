package Com.PerScholas_servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.PerScholars_DatabaseConnection.*;

import Com.PerScholars_JavaClassModels.*;
import Com.PerScholas_Dao.*;

@WebServlet({ "/HomeServlet", "/HomeServlet/*" })
public class HomeServlet extends HttpServlet {
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
			case "/HomeServlet":
				showLogin(request, response);
				break;
			case "/HomeServlet/loginMember":
				loginMember(request, response);
				break;
			case "/HomeServlet/showWelcomePage":
				showWelcomePage(request, response);
				break;
			case "/HomeServlet/showRegistration":
				showRegistration(request, response);
				break;
			case "/HomeServlet/registerMember":
				registerMember(request, response);
				break;
			case "/HomeServlet/showNotes":
				showAllNotes(request, response);
				break;
			case "/HomeServlet/addNotes":
				addNotes(request, response);
				break;
			case "/HomeServlet/removeNote":
				removeNote(request, response);
				break;

			case "/HomeServlet/showReminders":
				showAllReminders(request, response);
				break;
			case "/HomeServlet/addReminder":
				addReminder(request, response);
				break;
			case "/HomeServlet/removeReminder":
				removeReminder(request, response);
				break;

			case "/HomeServlet/logout":
				logout(request, response);
				break;
			default:
				showLogin(request, response);
				break;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void showLogin(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/LoginPage.jsp");
		rd.forward(request, response);
	}

	private void loginMember(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		HttpSession session = request.getSession();

		System.out.println("name :" + name);
		System.out.println("password :" + password);
		UsersClassDao m_dao = new UsersClassDao();
		UsersClass m = m_dao.getUsersByName(name);

		if (m != null) {
			if (password.equals(m.getPassword())) {
				session.setAttribute("currentMember", m);
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Welcome.jsp");
				System.out.println("** Success");
				rd.forward(request, response);
			} else {
				request.setAttribute("errorMessage", "Invalid login-password");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/LoginPage.jsp");
				System.out.println("** Password Failure");
				rd.forward(request, response);
			}
		} else {
			request.setAttribute("errorMessage", "Invalid login-user name");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/LoginPage.jsp");
			System.out.println("** ID Failure");
			rd.forward(request, response);
		}
	}
/////

	private void showAllReminders(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		RemindersClassDao b_dao = new RemindersClassDao();
		UsersClass currentMember = (UsersClass) session.getAttribute("currentMember");
		if (currentMember != null) {
		List<RemindersClass> allReminder = b_dao.getAllReminders(currentMember.getUserid());

		request.setAttribute("allReminder", allReminder);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Reminders.jsp");
		rd.forward(request, response);
		} else {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/LoginPage.jsp");
		rd.forward(request, response);
		}

	}

	private void addReminder(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		UsersClass currentMember = (UsersClass) session.getAttribute("currentMember");

		if (currentMember != null) {

			RemindersClassDao b_dao = new RemindersClassDao();
			int userid = currentMember.getUserid();
			String reminderType = request.getParameter("reminderType");
			String frequency = request.getParameter("frequency");
			String remarks = request.getParameter("remarks");

			RemindersClass q = new RemindersClass();

			q.setUserId(userid);
			q.setReminderType(reminderType);
			q.setFrequency(frequency);
			q.setRemarks(remarks);
			q.setIsActive("Yes");
			b_dao.addReminder(q);

			System.out.println("Note " + reminderType + "Succesfully Added");

			List<RemindersClass> allReminder = b_dao.getAllReminders(userid);
			request.setAttribute("allReminder", allReminder);

			request.setAttribute("successMessage", "Reminder Succesfully Added");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Reminders.jsp");
			rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/LoginPage.jsp");
			rd.forward(request, response);
			}


	}

	private void removeReminder(HttpServletRequest request, HttpServletResponse response) throws Exception {

		int reminderId = Integer.valueOf(request.getParameter("reminderId"));

		System.out.println("reminderId :" + reminderId);

		int userId = Integer.valueOf(request.getParameter("userId"));

		System.out.println("userId :" + userId);

		RemindersClassDao b_dao = new RemindersClassDao();
		b_dao.removeReminders(reminderId);

		List<RemindersClass> allReminder = b_dao.getAllReminders(userId);
		request.setAttribute("allReminder", allReminder);

		request.setAttribute("successMessage", "Reminder Succesfully Deleted");
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Reminders.jsp");
		rd.forward(request, response);
	}
	////

	private void showAllNotes(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		NotesClassDao b_dao = new NotesClassDao();
		UsersClass currentMember = (UsersClass) session.getAttribute("currentMember");
		
		if (currentMember != null) {
		List<NotesClass> allNotes = b_dao.getAllNotes(currentMember.getUserid());

		request.setAttribute("allNotes", allNotes);

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Notes.jsp");
		rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/LoginPage.jsp");
			rd.forward(request, response);
		}
	}

	private void addNotes(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		UsersClass currentMember = (UsersClass) session.getAttribute("currentMember");

		if (currentMember != null) {

			NotesClassDao b_dao = new NotesClassDao();
			int userid = currentMember.getUserid();
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String notecol = request.getParameter("notecol");

			NotesClass q = new NotesClass();

			q.setUserId(userid);
			q.setContent(content);
			q.setNotecol(notecol);
			q.setTitle(title);
			b_dao.registerNote(q);

			System.out.println("Note " + title + "Succesfully Added");

			List<NotesClass> allNotes = b_dao.getAllNotes(currentMember.getUserid());
			request.setAttribute("allNotes", allNotes);

			request.setAttribute("successMessage", "Note Succesfully Added");
		}

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Notes.jsp");
		rd.forward(request, response);
	}

	private void removeNote(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		String noteId = request.getParameter("noteId");

		System.out.println("noteId :" + noteId);

		String userId = request.getParameter("userId");

		System.out.println("userId :" + userId);

		if (noteId != null) {

			// fix this
			NotesClassDao b_dao = new NotesClassDao();
			b_dao.removeNote(Integer.valueOf(noteId));

			List<NotesClass> allNotes = b_dao.getAllNotes(Integer.valueOf(userId));
			request.setAttribute("allNotes", allNotes);

			request.setAttribute("successMessage", "Note Succesfully Deleted");
		}

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Notes.jsp");
		rd.forward(request, response);
	}

	private void showWelcomePage(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Welcome.jsp");
		rd.forward(request, response);
	}

	private void showRegistration(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/RegistrationPage.jsp");
		rd.forward(request, response);
	}

	private void registerMember(HttpServletRequest request, HttpServletResponse response)
			throws ClassNotFoundException, SQLException, IOException, ServletException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		UsersClass m = new UsersClass();
		m.setUsername(name);
		m.setPassword(password);
		m.setEmail(email);
		m.setRole(1);

		UsersClassDao m_dao = new UsersClassDao();
		Integer i = m_dao.registerUser(m);
		System.out.println("User " + name + "Succesfully Registered");

		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/LoginPage.jsp");
		rd.forward(request, response);
	}

//	private void showReminders(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException, SQLException, ClassNotFoundException {
//		BookDAO b_dao = new BookDAO();
//		Book allEvents = b_dao.getBookByTitle("Pinky Girl");
//		request.setAttribute("allEvents", allEvents);
//
//		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Books.jsp");
//		rd.forward(request, response);
//	}
//
//	private void addReminders(HttpServletRequest request, HttpServletResponse response)
//			throws ClassNotFoundException, SQLException, IOException, ServletException {
//		HttpSession session = request.getSession();
//
//		String title = request.getParameter("title");
//		String description = request.getParameter("description");
//		String location = request.getParameter("location");
//		String dateTimeString = request.getParameter("dateTime");
//		LocalDateTime ldt = (LocalDateTime.parse(dateTimeString));

	// Todo
//		Event event = new Event();
//		event.setTitle(title);
//		event.setDescription(description);
//		event.setLocation(location);
//		event.setDateTime(ldt);
//		Member currentMember = (Member)session.getAttribute("currentMember");
//		event.setMemberId(currentMember.getMemberId());
//		
//		EventDAO e_dao = new EventDAO();
//		e_dao.createEvent(event);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("/HomeServlet/showEventsPage");
//		rd.forward(request, response);
//	}

	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		RequestDispatcher rd = request.getRequestDispatcher("/HomeServlet");
		rd.forward(request, response);
	}
}
