package com.gqt.corejava.patterns;

import java.util.Scanner;

//	 output:
	/*
		1
		2
		3
		4
		5 
	*/
		
public class Pattern5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.println(i);
		}
		sc.close();

	}

}
