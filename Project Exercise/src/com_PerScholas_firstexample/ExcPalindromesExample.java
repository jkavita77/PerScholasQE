package com_PerScholas_firstexample;
import java.util.*;   
public class ExcPalindromesExample {
 //Write a program that returns all the available palindromes within 10 and 200.
	   public static void main(String args[])  
	   {  
		   int n, b, rev = 0;
			int limit=200;
			System.out.print("Palindrome numbers from 1 to N:");
			for (int i = 10; i <= limit; i++)
			{
				n = i;
				while (n > 0)
				{
					b = n % 10;
					rev = rev * 10 + b;
					n = n / 10;
				}
				if (rev == i)
				{
					System.out.print(i + " ");
				}
				rev = 0;
	   }  
		

	   }}

