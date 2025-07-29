package com.gqt.corejava.patterns;

import java.util.Scanner;

/* output :
				1
				1 0
				1 0 1
				1 0 1 0
				1 0 1 0 1

 */
public class Pattern25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			
			for(int j = 1; j<=i; j++) {
				
				if(j%2 != 0) {
					System.out.print("1 ");
				}
				
				if(j%2 == 0) {
				System.out.print("0 ");
			}
				
		}
			System.out.println();
	}
	}
}
