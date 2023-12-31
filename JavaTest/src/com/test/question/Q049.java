package com.test.question;

import java.util.Scanner;

public class Q049 {

	public static void main(String[] args) {
		
		/*
			요구사항
			아래와 같이 출력하시오.
			
			조건..
			행의 갯수를 입력받으시오.
			
			입력..
			행: 5 
			
			출력..
			*****
			 ****
			  ***
			   **
			    * 
		 */
		int input = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행: ");
		input = scan.nextInt();
		//방법1
		for(int i=input; i>0; i--) {
			
			for(int j=0; j < input - i; j++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//방법2
		for (int i=0; i<input; i++) {
			
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			} 
			
			for (int j=input; j>i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
