package Com.PerScholas_Test;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import Com.PerScholas_Dao.UsersClassDao;
import Com.PerScholars_JavaClassModels.UsersClass;

public class UserClassDaoTest {
	public static UsersClassDao testObject;
	public static Boolean connectedDB;

	// Fill the database with the test data used for the test cases
	// Test data used for these test cases can be found here!
	@BeforeClass
	public static void setUpTestObject() {

		System.out.println("SetUp: Entering setUpTestObject \n");
		testObject = new UsersClassDao();

		// If the object returned by testConnection() is not null then connection
		// successful

		if (Objects.nonNull(testObject.testConnection())) {

			connectedDB = true;

			// Test data inserted into the database used to test DAO methods
			try {

				testObject.registerUser(new UsersClass(1, "Davis", "password", 0));
				testObject.registerUser(new UsersClass(2, "John", "password", 0));
				testObject.registerUser(new UsersClass(3, "Kim", "password", 0));
				testObject.registerUser(new UsersClass(4, "Joel", "password", 0));
			} catch (Exception e) {

				System.out.println("Unable to insert test data into DB");
				e.getStackTrace();

			}

		} else {

			connectedDB = false;

		}
		

	}

	// Testcase to test the registeruser function in Usersdao class
	// Inserts the data and later checks if the inersed values are same
	@Test
	public void testregisterUser() {

		System.out.println("Test 1: Entering testregisterUser \n");
		assumeTrue(connectedDB);
		UsersClass testUser = new UsersClass(101, "RJ", "password", 0);

		try {
			Integer testID = testObject.registerUser(testUser);
			assertThat(testID, equalTo(101));
			assertNotNull(testObject.getUsersByID(101));

			
			  UsersClass actualUser = testObject.getUsersByID(101);
			  
			  assertEquals(testUser.getUsername(), actualUser.getUsername());
			  assertEquals(testUser.getRole(), actualUser.getRole());
			 
		} catch (Exception e) {
			System.out.println("Unable to insert User into DB");
			e.getStackTrace();
		}
	}

	// Testcase to test the getAllusers function in Usersdao class
	@Test
	public void testgetAllUsers() {
		System.out.println("Test 2: Entering testgetAllUsers \n");

		assumeTrue(connectedDB);

		try {
			List<UsersClass> actualList = testObject.getAllUsers();

			// Makes sure the Users have the right names
			assertThat(actualList.get(0).getUsername(), is("Davis"));
			assertThat(actualList.get(1).getUsername(), is("John"));
			assertThat(actualList.get(2).getUsername(), is("Kim"));
			assertThat(actualList.get(2).getUsername(), is("Joel"));

		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}

	// Test the removeBrand() method
	@Test
	public void testRemoveUsers() {
		
		System.out.println("Test 3: Entering testRemoveUsers \n");

		try {

			// Test whether the Brand is removed correctly
			Boolean removeUsers = testObject.removeUser(4);

			assertTrue(removeUsers);

			// Test that the object is no longer in the DB
			assertNull(testObject.getUsersByID(4));

			// Test that you cannot update a removed object
			assertFalse(testObject.updateUsers(new UsersClass(4, "Bobby", "Password", 1)));

		} catch (Exception e) {

			System.out.println("Unable to use Remove method");
			e.getStackTrace();

		}
		System.out.println("Exiting testRemoveUsers \n");
	}

	// Test the updateBrand() method
	@Test
	public void testupdateUsers() {

		System.out.println("Test 4: Entering testupdateUsers \n");
		UsersClass testUser = new UsersClass(2, "Alex", "password", 0);

		try {
			// Make sure you are able to update the given Brand
			Boolean updateUsers = testObject.updateUsers(testUser);

			// Make sure the user was actually updated
			assertTrue(updateUsers);

			// Make sure the updated Brand has the correct variables
			assertEquals(testObject.getUsersByID(2).getUsername(), "Alex");
			assertEquals(testObject.getUsersByID(2).getRole(), 0);

		} catch (Exception e) {

			e.getStackTrace();

		}
	}

	// Clears database of all test data
	@AfterClass
	public static void clearTable() {
		System.out.println("Clear Up: Entering clearTable \n");

		try {
			for (UsersClass out : testObject.getAllUsers()) {

				testObject.removeUser(out.getUserid());

			}
		} catch (Exception e) {
			System.out.println("Unable to clear DB of test data");
			e.getStackTrace();
		}

	}

}
