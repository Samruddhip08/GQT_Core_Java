package com.gqt.corejava.patterns;

import java.util.Scanner;

/* output:
 		25 24 23 22 21
 		20 19 18 17 16
 		15 14 13 12 11
 		10 9 8 7 6 
 		5 4 3 2 1
 		
 */
public class Pattern12 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int num = n*n;
		
		for(int i = 1; i<=n; i++) {
			
			for(int j = 1; j<=n; j++) {
				
				System.out.print(num +" ");
				num--;
				
			}
			System.out.println();
		}
		sc.close();
	}

}
