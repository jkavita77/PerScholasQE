package com.Perscholas.JavaSBAProject_01;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GradingQuestion9 {

	
			public static void main(String[] args) throws IOException {
				// Create instances of FileWriter & FileReader classes
				FileWriter fw = null;
				FileReader fr = null;

				try
				{
					fr = new FileReader("C:\\Users\\Student\\eclipse-workspace\\QualityEngineeringAssurance\\GradingName");
					fw = new FileWriter("QualityEngineeringAssurance/OutputFile");
					int nextChar;
					while ((nextChar = fr.read()) != -1) {
						System.out.print((char)nextChar);
						fw.write(nextChar);
					}
				}
				catch (IOException e)
				{
					System.out.println(e.getMessage());
				}
				finally
				{
					/* If we don't test the FileReader instance fr for
					 *  null value, then we run the risk of a
					 *  NullPointerException if it doesn't get
					 *  instantiated due to the file "InputFile.txt"
					 *  not being found. This could happen if the file
					 *  doesn't exist or if there is a spelling error.*/
					if (fr != null) {
						fr.close(); /*This will throw a NullPointerException
						if fr is not instantiated as there will be no instance
						and therefore no method to call (i.e., fr will point
						to null and hence the NullPointerException.*/
					}
					//The same applies to the FileWriter instance fw.
					if (fw != null) {
						fw.close();
					}
				}
			}
		}
