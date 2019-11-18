package com.PerScholas_App_HW;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MyApp {
	private Connection dbConnection = null;
	private DBActions dbActions = new DBActions();
	private FileIO fileIO = new FileIO();

	public void getConnection() throws SQLException {
		try {
			dbConnection = dbActions.getConnection();
		} catch (Exception e) {
			System.out.println("Connection unsuccessful");
		} finally {
			if (dbConnection != null)
				dbConnection.close();
		}

	}

	public ArrayList getAllItems() throws Exception {

		return dbActions.getAllItems();

	}

	public HashMap loadFile() throws Exception {
		return fileIO.loadFile();
	}

	public void printConsole(HashMap fileMap, ArrayList list) throws Exception {
		Item item = null;
		double price = 0;
		int quantity = 0;

		for (int i = 0; i < list.size(); i++) {

			item = (Item) list.get(i);
			if (fileMap.containsKey(item.getName())) {
//			System.out.print("fileMap.get(item.getName() :"+ i + " "+ fileMap.get(item.getName()));

				quantity = Integer.parseInt((String) fileMap.get(item.getName()));
				price = item.getPrice().doubleValue();

				System.out.println("Item Name : " + item.getName());
				System.out.println("Item Quantity : " + quantity);
				System.out.println("Item Price : " + price);
				System.out.println("Quantity By Price - Calculation :" + quantity * price);

				System.out.println("____________________________");

			}
		}

	}

	public static void main(String[] args) throws Exception {

		MyApp myAppObject = new MyApp();

		// validate Connection
		myAppObject.getConnection();

		// Load text file. This map contains the name and value of all the entries in
		// text file
		HashMap fileMap = myAppObject.loadFile();

		// Get data from db. This list contain all the value received from database
		ArrayList list = myAppObject.getAllItems();

		// print output to console
		myAppObject.printConsole(fileMap, list);

	}
}
