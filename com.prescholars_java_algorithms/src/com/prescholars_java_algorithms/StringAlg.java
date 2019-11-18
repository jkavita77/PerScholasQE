package com.prescholars_java_algorithms;

public class StringAlg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAlg sa = new StringAlg();
		String demo = "Hello 2019 QE2!";
		String[] strArr = demo.split(" ");
		for (String x : strArr) {
			System.out.println(x);
		}
		

		
		
	//	String demo2 = demo.concat("qwert");
	//	System.out.println(demo2);
	//	System.out.println(demo.contains("Hello"));
		
  //System.out.println(demo.subSequence(2, 9));
	}
	
	public String[] returnWord() 
	{
		String demo = "Hello 2019 QE02!";
		String[] strArr = demo.split(" ");
		return strArr;
	}

}
