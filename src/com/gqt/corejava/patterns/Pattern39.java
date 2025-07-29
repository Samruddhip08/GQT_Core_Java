package com.gqt.corejava.patterns;

import java.util.Scanner;

/*	output:
 							A
 						  A B A
 						A B C A B
 					  A B C D A B C
 					A B C D E A B C D
 					
 */
public class Pattern39 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter size: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {

	        	for (int s = 1; s <= n - i; s++) {
	                System.out.print("  ");
	                
	            }

	            for (char ch = 'A'; ch < 'A' + i; ch++) {
	            	
	                System.out.print(ch + " ");
	                
	            }

	            for (char ch = 'A'; ch < 'A' + i - 1; ch++) {
	            	
	                System.out.print(ch + " ");
	                
	            }

	            System.out.println();
	        }

	        sc.close();
	    }

	}

