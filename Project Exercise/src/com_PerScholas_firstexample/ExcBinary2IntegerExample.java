package com_PerScholas_firstexample;

public class ExcBinary2IntegerExample {
	public static void main(String[] args) {
		
		String binVal = "00000001";	
	System.out.println(Integer.parseInt(binVal, 2)); // = 1
	
		 binVal = "00000010";	
		 
	System.out.println(Integer.parseInt(binVal, 2)); // = 2
	
	
		 binVal = "00001001";
	System.out.println(Integer.parseInt(binVal, 2)); // = 9
	
	
		 binVal = "00110100";	
	System.out.println(Integer.parseInt(binVal, 2)); // = 52
	
	
		 binVal = "01110010";
	System.out.println(Integer.parseInt(binVal, 2)); // = 144
	
	
	 	binVal = "001000011111";	
	System.out.println(Integer.parseInt(binVal, 2)); // = 543
	
	
	 	binVal = "0010110001100111";	
	System.out.println(Integer.parseInt(binVal, 2)); // = 11367
	
	
	
	}	
		} 
	