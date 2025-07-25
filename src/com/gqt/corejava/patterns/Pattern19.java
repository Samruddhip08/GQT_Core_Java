package com.gqt.corejava.patterns;

import java.util.Scanner;

/* 	output:
 			1 2 3 4 5
 			6 7 8 9
 			10 11 12
 			13 14
 			15
 */

public class Pattern19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			for(int j = 1; j<=n; j++) {
				
				System.out.println(j +" ");
				j++;
			}
		}

	}

}
