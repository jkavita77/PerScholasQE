package com_PerScholas_firstexample;

public class ExcStringExamples {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello ");
		System.out.println(sb);
		sb.append("World "); // append word world
		System.out.println(sb);
		sb.append(" World "); //append word world
		System.out.println(sb);
		sb.insert(12, "New "); // new test is added on the 12th index
		System.out.println(sb);
		sb.replace(12, 16,  "Old " );//replacing the new word with old 
		System.out.println(sb);
		sb.reverse(); ///reverse the string
		System.out.println(sb);
	
	//Write a program that uses a loop to reverse the characters of a String 
	//object (e.g., “hello” becomes “olleh”.
	StringBuilder sbuilber = new StringBuilder(" KAVITA ");
	System.out.println(sbuilber);
	sbuilber.reverse(); ///reverse the string
	System.out.println(sbuilber);
	
	//Write a program that uses loops without the reverse( ) method to take a multi-word 
	//string and reverse each word but keep the same word order in the string 
	//(e.g., “Hello world!” would become “olleH !dlrow”).
	
	String str = "Hello World";
	int length = str.length(); 
	int last = length - 1;
    char[] chars = str.toCharArray();
    for ( int i = 0; i < length/2; i++ ) {
        char temp = chars[i];
        chars[i] = chars[last - i];
        chars[last - i] = temp;
    }
    
    String reverseStr = new String(chars);
    System.out.println("Reverse Sr: "+reverseStr);
}	

}
