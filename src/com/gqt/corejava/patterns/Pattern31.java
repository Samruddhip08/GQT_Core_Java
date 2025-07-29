package com.gqt.corejava.patterns;

import java.util.Scanner;

/*	output:
 						5 5 5 5 5 5 5 5 5 
 						  4 4 4 4 4 4 4
 						    3 3 3 3 3 
 						      2 2 2
 						        1
 						      2 2 2
 						    3 3 3 3 3
 						  4 4 4 4 4 4 4
 						5 5 5 5 5 5 5 5 5
 						      
 
 */
public class Pattern31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

		
		for(int i = 1; i<=n; i++) {
			
			for(int j =1; j<=n - i; j++) {
				
				System.out.print("  ");
			}
			
			for(int j =1; j <= 2 * i - 1; j++) {
				
				System.out.print(i + " ");
			}
			
			System.out.println();
		}

	}

}
