package com.kavita.my_first_Package;

import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // communicate the required input from the user
        System.out.println("How many student marks will be entered:\n ");
        // n to store total count of stundents whose marks to be scored
        int n = scan.nextInt();
        // initialzing the marks variable which will be later used to store user input
        int marks = 0;
        // initializing the array to be used to store all the marks in array
        int arr[] = new int[n];
        System.out.println("Enter the marks: \n");
        for (int i = 0; i < n; i++) {
            marks = scan.nextInt();
            arr[i] = marks;
        }
        
        // Calling bubble sort loop/ logic to sort all marks stored in the array
        int j = 0;
        int temp = 0;
        // loop from first element to last - i.e. n-1
        for (int i = 0; i < n; i++) {
            for (j = 1; j < (n - i); j++) {
                if (arr[j] < arr[j - 1]) {
                    // swap elements
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        // Prnting the minumum value after the sort. It will be the fisrt element
        System.out.println("Minimum Value \n" + arr[0]);
        // printing the maximum value after the sort. It will be last value in the array
        System.out.println("Maximum Value \n" + arr[arr.length - 1]);
        /**
         * System.out.println("Array After Bubble Sort \n"); for (int i = 0; i <
         * arr.length; i++) { System.out.print(arr[i] + " "); } }
         **/
        scan.close();
    }
}