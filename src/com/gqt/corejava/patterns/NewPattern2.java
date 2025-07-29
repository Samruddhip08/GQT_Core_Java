/**
 * 
 */
package com.gqt.corejava.patterns;

import java.util.Scanner;

/*
 * 		#
 * 		#  #
 * 		#  -  #
 * 		#  -  -  #
 * 		#  #  #  #  # 
 */
public class NewPattern2 {

	/**
	 * @param args
	 * @author samruddhi
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size :");
		int n = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			
			for(int j = 0; j<= i; j++) {
				
				if(i==0  || j==0 || i==j || i==n-1) {
					
					System.out.print("#  ");
				}
				else {
					
					System.out.print("-  ");
					
				}
			}
			System.out.println();
		}
	}
	
}
