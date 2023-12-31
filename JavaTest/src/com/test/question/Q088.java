package com.test.question;

import java.util.Scanner;

public class Q088 {

	public static void main(String[] args) {
		
		/*
			요구사항
			금지어를 마스킹 처리 하시오.
			
			조건..
			금지어
			바보
			멍청이
			
			입력..
			입력: 너랑 안놀아 바보야!! 
			
			출력..
			너랑 안놀아 **야!!
			금지어를 1회 마스킹했습니다. 
		 */
		
		String txt = "";
		String []word = {"바보" , "멍청이"};
		int count = 0;
		int index = -1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력: ");
		txt = scan.nextLine();
		
		for(int i=0; i<word.length; i++) {
			
			while((index = txt.indexOf(word[i], index)) > -1) {
				
				count++;
				index = index + word[i].length();
			}
		}
		
		for(int i=0; i<word.length; i++) {
			
			txt= txt.replace(word[i], masking(word[i]));
		}
		
		System.out.println(txt);
		System.out.printf("금지어를 %d회 마스킹했습니다.\n", count);
	}

	private static String masking(String word) {

		String temp = "";
		
		for(int i=0; i<word.length(); i++) {
			temp += "*";
		}
		
		return temp;
	}
}
