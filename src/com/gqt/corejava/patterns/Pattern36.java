package com.gqt.corejava.patterns;

import java.util.Scanner;

/* output:
 							A
 						  C B A
 						E D C B A
 					  G F E D C B A
 					I H G F E D C B A
 					
 */
public class Pattern36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            char ch = (char) ('A' + (2 * (i - 1)));

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch--;
            }

            System.out.println();
        }

		sc.close();
	}

}
