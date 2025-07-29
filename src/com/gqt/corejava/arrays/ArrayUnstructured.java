package com.gqt.corejava.arrays;

import java.util.Scanner;

public class ArrayUnstructured {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student Count : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		// collecting & storing marks of n students 
		
		for(int i =0; i<arr.length; i++) {
			
			System.out.println("Enter marks of student no. : " +(i+1) );
			
			arr[i] = sc.nextInt();
			
		}
		
		System.out.println("----------------");
		
		// display marks stored inside the array
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.println("The marks of student no.  " + (i+1) + " is : " + arr[i]);
		}
		
sc.close();
	}

}
