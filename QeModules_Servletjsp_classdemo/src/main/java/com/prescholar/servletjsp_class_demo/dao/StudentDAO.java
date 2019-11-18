
package com.prescholar.servletjsp_class_demo.dao;



import com.prescholar.servletjsp_class_demo.models.Student;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;


public class StudentDAO {
	private ArrayList<Student> studentlist = new ArrayList<Student>();
	
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
		StudentDAO s_dao = new StudentDAO();
		s_dao.testconnection();
	//each time we run we have to add values to the new 	
//		Student enter = new Student("Tom", "Tom@yahoo.com","sql", "Plano");
//		s_dao.registerStudent( enter);
		
		s_dao.printStudents();
	}
	//****************registerUser() method*****************
		public Integer registerStudent(Student user) throws SQLException, ClassNotFoundException, IOException {
			// Declare variables
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			// Assign insert statement string to variable
			String insertString = "insert into student (name, email,courseSelected,hometown) values (?,?,?,?)";
			
		    int ID = -1;
		    String[] COL = {"student_id"};
		    
		    MariadbConnection mysql = new MariadbConnection();
		    
		    try
		    {
		        conn = mysql.getConnection();
		        stmt = conn.prepareStatement(insertString, COL);
		        
		        stmt.setString(1, user.getName());
		        stmt.setString(2, user.getEmail());
		        stmt.setString(3, user.getHometown());
		        stmt.setString(4, user.getCourseSelected());
		        
		        stmt.executeUpdate();
		        
		        rs = stmt.getGeneratedKeys();
		        if(rs != null && rs.next()) {
		            ID = rs.getInt(1);
		        }
		        System.out.println(ID);
		    }
		    catch (SQLException e)
			{
				System.out.println("Error: " + e.getMessage());
			}
			finally
			{
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		    
			return ID;
		} // End of registerUser() method
	
		public void displayStudent() {
			for (Student s: studentlist)
				System.out.println(s);
		}
		 public void printStudents() throws SQLException, IOException, ClassNotFoundException {
//		      Create connection object using properties in the MariaDBConnection class
		        Connection conn = new MariadbConnection().getConnection();
		        Statement statement = conn.createStatement();
		        
//		      String that contains the SQL statement for the query
		        String query = "SELECT * FROM student";
		        
//		      ResultSet object created. The object is a set of data
//		      that contains the information from the executed query.
//		      In this case, the result set will contain the rows
//		      the SQL query returns. 
		        ResultSet rs = statement.executeQuery(query);
		        
//		      iterate through the ResultSet object.
		        while(rs.next()) {
//		          assign variables accordingly
		            int studentId = rs.getInt("student_id");
		            String name = rs.getString("name");
		            String email = rs.getString("email");
		            String courseSelected = rs.getString("courseSelected");
		            String hometown = rs.getString("hometown");
		            
//		            adding new Student objects to ArrayList
		            studentlist.add(new Student(studentId,name, email, courseSelected, hometown));
		            System.out.println("" + studentId + ": " + name + " "+ email + " "+ courseSelected + " "+ hometown);
		        }
		        
//		      close the objects
		        rs.close();
		        conn.close();
		        statement.close();
		    }

}

