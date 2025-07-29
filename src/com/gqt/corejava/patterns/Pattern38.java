package com.gqt.corejava.patterns;

import java.util.Scanner;

/* 		output:
 								A
 							  B A B
 							C B A B C
 						  D C B A B C D
 						E D C B A B C D E
 						
 */
public class Pattern38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

        	for (int j = 1; j <= n - i; j++) {
        		
                System.out.print("  ");
                
            }

            char ch = (char) ('A' + i - 1);

            for (char c = ch; c >= 'A'; c--) {
            	
                System.out.print(c + " ");
                
            }

            for (char c = 'B'; c <= ch; c++) {
            	
                System.out.print(c + " ");
                
            }

            System.out.println();
        }

        sc.close();
    
	}

}
