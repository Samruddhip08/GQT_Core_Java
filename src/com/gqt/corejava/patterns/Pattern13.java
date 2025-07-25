package com.gqt.corejava.patterns;

import java.util.Scanner;

/* output:
	1 6 11 16 21
	2 7 12 17 22
	3 8 13 18 23
	4 9 14 19 24
	5 10 15 20 25
*/

public class Pattern13 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		int num = n;
		
		for(int i = 1; i<=n ; i++) {
			
			num =i;
			for(int j = 1; j<=n; j++) {
				
				System.out.print(num +"  ");
				num = num + n;
			}
			System.out.println();
		}
		sc.close();
		

	}

}
