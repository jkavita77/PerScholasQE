
/**
 * This is my first program in Java
 * It works bby reading the variable n and run into the loop
 * 
 */

package firstprj;

class FizzBuzz 
{ 
    public static void main(String args[]) 
    {  
        int n = 100; 
  
        // loop for 100 times 
        for (int i=1; i<=n; i++)                                  
        { 
            if (i%15==0)                                                  
                
            	System.out.print("FizzBuzz \n");
            // number divisible by 5, print 'Buzz'  
            // in place of the number 
            
            else if (i%5==0)      
                System.out.print("Buzz \n");  
  
            // number divisible by 3, print 'Fizz'  
            // in place of the number 
            
            else if (i%3==0)      
                System.out.print("Fizz \n");  
  
            // number divisible by 15(divisible by 
            // both 3 & 5), print 'FizzBuzz' in  
            // place of the number 
                  
            else // print the numbers 
                System.out.print(i+"\n");                          
        } 
    } 
}
