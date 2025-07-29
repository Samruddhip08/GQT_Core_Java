package com.gqt.corejava.patterns;

import java.util.Scanner;

/* 		output:
 									1
 								2		2
 							3				3
 						4						4
 					5								5
 						4						4
 							3 				3
 								2		2
 									1
 									
 */
public class Pattern30 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size: ");
	        int n = sc.nextInt();

	        int rows = 2 * n - 1;

	        for (int i = 1; i <= rows; i++) {
	        	int rowNum;
	        	if (i <= n) {
	        	    rowNum = i;
	        	} else {
	        	    rowNum = 2 * n - i;
	        	}
	        
	            for (int s = 1; s <= n - rowNum; s++) {
	                System.out.print("\t");
	            }
	            
	            System.out.print(rowNum);

	            if (rowNum > 1) {
	                for (int s = 1; s <= (2 * rowNum - 3); s++) {
	                    System.out.print("\t");
	                }
	               
	                System.out.print("\t" + rowNum);
	            }

	            System.out.println();
	        }


	}

}
