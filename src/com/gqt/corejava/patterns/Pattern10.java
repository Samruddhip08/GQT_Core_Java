package com.gqt.corejava.patterns;

import java.util.Scanner;

/* output:
 * 	
 * 	1 2 3 4 5
 * 	1 2 3 4 5
 * 	1 2 3 4 5
 * 	1 2 3 4 5
 * 	1 2 3 4 5
 */
public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {
			
			for(int j = 1; j<=n; j++) {
				
				System.out.print(j +" ");
				
			}
			System.out.println();
			
		}

		sc.close();
	}

}
