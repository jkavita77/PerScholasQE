package com.Package.org;

public class Main {

	public static void main(String[] args) {
		Person de = new Person();
		de.

	}

	public static void main(String[] args) {
		//int[] arr = {1,2,3,4,5};
		
		//for (int i =0; i<arr.length-1; i++) {
		//System.out.println(arr[i]+ arr[i+1]);
		
		int []arr = {1,2,3,4,5};
		int []arr2 = {5,4,3,2,1};
		//int []result = {0,0,0,0,0};
		int []result = new int[5];
	
		//result[0]  = arr[0]+arr2[0];
		//result [1] = arr[1]+arr2[1];
		//result[2]  = arr[2]+arr2[2];
		//result[3]  = arr[3]+arr2[3];
		//result [4] = arr[4]+arr2[4];
		
		//System.out.println(result[0]);
		for (int i = 0, j=4; i<5; i++, j--)
		//for (int i =0 ; i<arr.length; i++) 
		{
			result[i] = arr[i]+ arr2[j];
			System.out.println(result[i] + " ");
		}
	
	}

}
