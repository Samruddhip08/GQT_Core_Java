package com.gqt.corejava.patterns;

import java.util.Scanner;

/* Output:
 		1
 		1 2 
 		1 2 3 
 		1 2 3 4 
 		1 2 3 4 5 
 */

public class Pattern16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			
			for(int j=1 ; j<=i; j++) {
				
				System.out.print(j +" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
