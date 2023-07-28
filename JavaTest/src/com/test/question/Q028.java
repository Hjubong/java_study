package com.test.question;

import java.util.Scanner;

public class Q028 {

	public static void main(String[] args) {
		
		/*
		 	요구사항
			근무 년수를 입력받아 아래와 같이 출력하시오.
			
			조건..
			1 ~ 4년차: 초급 개발자
			5 ~ 9년차: 중급 개발자
			10년차 이상: 고급 개발자
			유효성 검사를 하시오.(1 미만 입력 예외 처리) 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("근무 년수: ");
		int year = scan.nextInt();
		
		String name = "";
		
		//if절 year >= 1 로 크게 묶고 나머지 다 이하로 깔끔하게 else 절 두번쓰기
		if (year >= 1 && year <=4) {
			
			name = "초급 개발자";
			
			System.out.printf("%d년차 초급 개발자입니다."
					
					+ "앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.\n"
					
					, year, 5 - year);
			
		} else if (year >= 5 && year <= 9) {
			
			name = "중급 개발자";
			
			System.out.printf("%d년차 중급 개발자입니다.\r\n"
					
					+ "당신은 %d년전까지 초급 개발자였습니다.\r\n"
					
					+ "앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다."
					
					, year, year - 4, 10 - year );
			
		} else if (year >= 10) {
			
			name = "고급 개발자";
			
			System.out.printf("%d년차 고급 개발자입니다.\r\n"
					
					+ "당신은 %d년전까지 중급 개발자였습니다."
					
					, year, year - 9);
			
		} else {
			
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		}
		
		
	}//main
}