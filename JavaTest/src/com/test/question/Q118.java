package com.test.question;

import java.io.File;
import java.util.ArrayList;

public class Q118 {

	public static void main(String[] args) {
		
		/*
			폴더 내의 모든 파일들을 찾아 크기를 비교하고, 크기가 큰 순으로 정렬하시오.
			
			조건..
			자식 폴더내의 파일도 모두 검색하시오.
			부모 자식 폴더에 상관없이 파일을 한번에 비교하시오.
			
			출력..
			[파일명]      [크기]     [파일이 들어있는 폴더]
			aaa.exe    	 57KB    		AAA 
			bbb.exe    	 50KB    		BBB 
			ccc.dat      41KB    		AAA 
			ddd.txt      20KB   		CCC 
		 */
		
		String path = "C:\\Users\\user\\Desktop\\새 폴더\\크기 정렬";
		
		File dir = new File(path);
		
		ArrayList<File> file = new ArrayList<File>();
		
		
		
		
	}
}
