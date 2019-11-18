package com.kavita.my_first_Package;
public class BubbleSortExample {
    public static void main(String[] args) {
        int arr[] = { 9, 7, 3, 6, 2 };
        int j =0;
        int n = arr.length;
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
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
