package com.test.question;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		
		/*
		 	요구사항
			- 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.

			조건
			- ℉ = ℃ × 1.8 + 32
			- 소수 입력 가능
			- 소수 이하 1자리까지 출력하시오. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("섭씨℃: ");
		
		double Celsius = scan.nextDouble(); 
		
		System.out.printf("섭씨 %.1f ℃는 화씨 %.1f ℉입니다.",
							Celsius, Celsius * 1.8 + 32);//화씨 계산식 ℉ = ℃ × 1.8 + 32
		
	
		
		
		
	}
	
}
