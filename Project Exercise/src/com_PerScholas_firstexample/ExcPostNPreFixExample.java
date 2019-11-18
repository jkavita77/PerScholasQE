package com_PerScholas_firstexample;
 //PostFix and Prefix Operator
public class ExcPostNPreFixExample {

	public static void main(String[] args) {
		
		
		   int x = 5, y;
	        
		     // Demonstrating prefix increment
		     // first x will be incremented then
		     // updated value of x will be assigned to y
		     y = ++x;
		     System.out.println("y : " + y); //will print y : 6
		     System.out.println("x : " + x); //will print x : 6
		      
		     // Demonstrating postfix increment
		     // first value of x will be assigned to y
		     // then x will be incremented
		     y = x++;
		     System.out.println("y : " + y); //will print y : 6
		     System.out.println("x : " + x); //will print x : 7
	
        
        //Three ways to increment the variable by 1
		 	
				int a = 3;
				System.out.println("The value of a=  " + a);   // "3"
		        a++;
		        System.out.println(" The value of a after increment " + a);    // "4"
		        
		        
		        // second method
		        System.out.println("The value of a=  " + a);//4
		        a = a + 1;
		        System.out.println(" The value of a after increment " + a); //5
		        
		        // Third method
		  		System.out.println("The value of a= " + a); //5
		  		 a +=1;
		  		System.out.println(" The value of a after increment " + a);    // 6
      
		  		// assigning two variable and their sum
		  		
		  		 int z = 5;
		  		int k = 8;
		  		int sum = ++z + k;
		  		
		  		
	}

}
