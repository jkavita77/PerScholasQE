package com_PerScholas_firstexample;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Test {

	
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Please enter user name at least 8 charachter:  ");
			String uname  = s.nextLine();
			
			System.out.print("enter password at least 6 char and contain letter n num :  ");
			String pass  = s.nextLine();
			
		
			String UseRegex = "[a-zA-Z]{8}";
			String pasRegex = "[a-zA-Z0-9]{6}";
			
			Pattern usePattern = Pattern.compile(UseRegex);
			Pattern pasPattern = Pattern.compile(pasRegex);
			
			Matcher useMatcher = usePattern.matcher(uname);
			Matcher pasMatcher = pasPattern.matcher(pass);

			
			if(useMatcher.matches()) {
				System.out.println("Username Valid");
			}else {
				System.out.println("Username Invalid");
			}
				
				
			if(pasMatcher.matches()) {
				System.out.println("Password Valid");
			}else {
				System.out.println("Password Invalid");
			}
				
			
			s.close();
		}
}