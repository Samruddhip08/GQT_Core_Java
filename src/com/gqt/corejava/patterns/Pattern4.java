package com.gqt.corejava.patterns;

import java.util.Scanner;

//  output:
//	1
//	1
//	1
//	1
//	1
	
public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("1");
		}
		
		sc.close();
	}

}
