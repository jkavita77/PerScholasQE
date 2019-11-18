package com_PerScholas_firstexample;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class InputBufferReader {

	
	
		public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name");
			String Uname = sc.nextLine();
			ArrayList<String> lines = null;
			BufferedReader br = null;
			PrintWriter pw = null;

			try
			{
				br = new BufferedReader(new FileReader("C:\\Users\\Student\\Desktop\\javaInput.txt"));
				pw = new PrintWriter(new FileWriter("C:\\Users\\Student\\Desktop\\javaoutput.txt"));
				String currentLine;
				int lineCount = 1;
				while((currentLine = br.readLine()) != null) {
					System.out.println(currentLine); // Prints currentLine to console
					lines.add(currentLine);
					pw.printf("Line %d: %s\n", lineCount, currentLine); /* Prints "Line #:" plus
					currentLine plus a new line character to "NewOutputFile.txt"*/
					lineCount++;
				}
			}
			catch (IOException e)
			{
				e.getMessage();
			}
			finally
			{
				if (br != null) {
					br.close();
				}
				if (pw != null) {
					pw.close();
				}
			}

}
}