package com.gqt.corejava.universalpatterns;

import java.util.Scanner;

public class PatternName {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			
		// S
			
			for(int j = 0; j<n; j++) {
				
				if(i==0 && j<=(n/2) || i==(n-1) && j<=(n/2) || (j==(n/2)&&i>=n/2) || j==0&&i<=n/2 || i==n/2 && j<=(n/2)) {					
					System.out.print("*  ");
				}
				
				else {
					
					System.out.print("   ");
				}
				
			}
			
		// A
			for(int j = 0; j<n; j++) {
				
				if(j==0 || j==(n/2) || i==0 && j<=(n/2) || i==(n/2) && j<=(n/2)) {
					
					System.out.print("*  ");
				}
				
				else {
					
					System.out.print("   ");
				}
			
			}
			
			// M
			
			for(int j = 0; j<n; j++) {
				
				if(j==0 || i==j && j<=(n/2) || i+j==(n-1) && j>=(n/2) || j==(n-1)) {
					
					System.out.print("*  ");
				}
				
				else {
					
					System.out.print("   ");
				}
				
				
			}

		  	// R
			for(int j = 0; j<n; j++) {
				
				if(j==0 || i==0 && j<=(n/2) || j==(n/2) && i<=(n/2) || i==(n/2) && j<=(n/2) || i-j==(n/2) && j<=(n/2)) {
					
					System.out.print("*  ");
				}
				
				else {
					
					System.out.print("   ");
				}
				
				
			}

			// U

			for(int j = 0; j<n; j++) {
				
				if(j==0 || i==(n-1) || j==(n-1) ) 
				{
				
					System.out.print("*  ");
				}
				
				else {
					
					System.out.print("   ");
				}
				
				
			}

			// D
			
			for(int j = 0; j<n; j++) {
				
				if(j==0 || j==(n/2) || i==0 && j<=(n/2) || i==(n-1) && j<=(n/2) || j==(n/2)) {
					
					System.out.print("*  ");
				}
				
				else {
					
					System.out.print("   ");
				}
				
				
			}

			// D
			
			for(int j = 0; j<n; j++) {
				
				if(j==0 || j==(n/2) || i==0 && j<=(n/2) || i==(n-1) && j<=(n/2) || j==(n/2)) {
					
					System.out.print("*  ");
				}
				
				else {
					
					System.out.print("   ");
				}
				
				
			}
			
			// H
			
			for(int j = 0; j<n; j++) {
				
				if(j==0 || j==(n-1) || i==(n/2)) {
					
					System.out.print("*  ");
				}
				
				else {
					
					System.out.print("   ");
				}
				
				
			}
			
			// I
			
			for(int j = 0; j<n; j++) {
				
				if(i==0 || i==(n-1) || j==(n/2)) {
					
					System.out.print("*  ");
				}
				
				else {
					
					System.out.print("   ");
				}
				
				
			}
			System.out.println();
		}
	}

}
