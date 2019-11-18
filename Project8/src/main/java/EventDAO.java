


import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;


public class EventDAO {
	private ArrayList<Event> studentlist = new ArrayList<Eventt>();
	
	public void testconnection() {
		MariadbConnection mariadbconnection = new MariadbConnection();
		try
		{
			mariadbconnection.getConnection();
			System.out.println( "connection to Mariadb");
		}
			catch(Exception e)
		
		{ System.out.println("database connection failed");
		}
		
		}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		EventDAO s_dao = new EventDAO();
		s_dao.testconnection();
	//each time we run we have to add values to the new 	
//		Student enter = new Student("Tom", "Tom@yahoo.com","sql", "Plano");
//		s_dao.registerStudent( enter);
		
	
	//create list to hold user objects
	courseList = new ArrayList<Course>();
	
	/*read the result set */
	while(rs.next())
	{
		Event = new Event();
		
		Event.setEvent1(rs.getString(2));
		Event.setEvent2(rs.getString(3));
		Event.setEvent3(rs.getString(4));
		
		
								
		EventList.add(Event);
		
	}
	
}	catch(ClassNotFoundException | IOException |SQLException e)
		{
	System.out.println("ERROR :    " +e.getMessage());
	e.getStackTrace();
}
{
	if(rs!= null)
		rs.close();
	if(stmt!= null)
		stmt.close();
	if(conn!= null)
		conn.close();
	
}
return EventList;
	
}
	
	}
	}

	