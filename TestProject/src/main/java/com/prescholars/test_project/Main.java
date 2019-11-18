package com.prescholars.test_project;

import java.io.*;
public class Main {
	public static void main(String args[]) throws IOException {
		FileReader f = new FileReader("src\\test\\Main.java\\");
		BufferedReader b = new BufferedReader(f);
		System.out.println(b.readLine() + " " + b.readLine() + " " + b.readLine());
	}
}