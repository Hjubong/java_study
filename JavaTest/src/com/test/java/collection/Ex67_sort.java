package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {

	public static void main(String[] args) {

		// Ex67_sort.java

		// 배열 or 컬렉션
		// - 오름차순 정렬, 내림차순 정렬
		// 1. 직접 알고리즘 구현
		// 2. JDK 제공 기능

		// 2 + 1 > JDK 제공 + 커스터마이징 + 익명 클래스 사용(선택)

		
		
		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
	}//main

	private static void m5() {
		
		//컬렉션의 정렬
		//1. ArrayList > O
		//2. HashMap > X
		//3. Queue > X
		//4. Stack > X
		//5. HashSet > X
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<10; i++) {
			list.add((int)(Math.random() * 100)); //0~99
		}
		
		System.out.println(list);
		
//		Collections.sort(list, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o2 - o1;
//			}
//		});
		
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		
		System.out.println(list);
	}

	private static void m4() {

		//객체 정렬
		Score[] list = new Score[5];
		
		list[0] = new Score("홍길동", 100, 90, 80);
		list[1] = new Score("아무개", 98, 78, 88);
		list[2] = new Score("유재석", 78, 95, 79);
		list[3] = new Score("박명수", 56, 78, 76);
		list[4] = new Score("이순신", 99, 67, 79);
		
		System.out.println(Arrays.toString(list));
		
		//이름순으로
		Arrays.sort(list, new Comparator<Score>() {
			@Override
			public int compare(Score o1, Score o2) {
				
				//return o1.getName().compareTo(o2.getName());
				//return o2.getKor() - o1.getKor();
				return (o2.getKor() + o2.getEng() + o2.getMath())
						- (o1.getKor() + o1.getEng() + o1.getMath());
			}
		});
		
		System.out.println(Arrays.toString(list));
		
	}

	private static void m3() {

		Calendar[] dates = new Calendar[5];
		
		for(int i=0; i<dates.length; i++) {
			dates[i] = Calendar.getInstance();
		}
		
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 1);
		dates[3].add(Calendar.DATE, 0);
		dates[4].add(Calendar.DATE, 3);
		
		for(int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		Arrays.sort(dates);
		
		for(int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		
		Arrays.sort(dates, new Comparator<Calendar>() {
			@Override
			public int compare(Calendar o1, Calendar o2) {
				
				//return (int)(o2.getTimeInMillis() - o1.getTimeInMillis());
				//return o2.compareTo(o1);
				
				//일(1) ~ 토(7)
				return o1.get(Calendar.DAY_OF_WEEK) - o2.get(Calendar.DAY_OF_WEEK);
			}
		});
		
		
		for(int i=0; i<dates.length; i++) {
			System.out.printf("%tF %tA\n", dates[i], dates[i]);
		}
		System.out.println();
	}

	private static void m2() {

		//자료형별 정렬
		//1. 숫자
		//2. 문자(열) > 문자코드값 > 숫자
		//3. 날짜시간 > 숫자
		//4. 객체 ****
		
		String txt1 = "홍길동";
		String txt2 = "아무개";
		
		//System.out.println(txt1 > txt2); //참조형이라 오류 > 주소값은 연산의 대상이 되지않음
		//문자열 > 문자열 : 불가능(참조값)
		//문자 > 문자 : 가능(값)
		
		//System.out.println('A' > 'B');
		
		int n = 0;
		
		for(int i=0; i<3; i++) {
			char c1 = txt1.charAt(i);
			char c2 = txt2.charAt(i);
			
			if(c1 > c2) {
				n = 1;
				break;
			} else if( c1 < c2) {
				n = -1;
				break;
			}
		}
		
		System.out.println(n);
		
		System.out.println(txt1.compareTo(txt2));
		//System.out.println(txt1.compareToIgnoreCase(txt2))); //대소문자 구분없이 비교하는 명령어
		
		String[] names = {"홍길동", "아무개", "유재석", "박명수", "이순신", "훈", "김철"};
		
		//가나다순으로 정렬
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				//문자 코드값 비교 > 가나다
				//return o1.compareTo(o2); //오름차순
				//return o2.compareTo(o1); //내림차순
				
				//글자 수 비교
				//return o1.length() - o2.length();
				
				if(o1.length() > o2.length()) {
					return 1;
				} else if(o1.length() < o2.length()) {
					return -1;
				} else {
					
					//2차 정렬 기준
					return o2.compareTo(o1);
				}
			}
			
		});
		
		System.out.println(Arrays.toString(names));
		
		
		
	}

	private static void m1() {
		// int[] nums
		Integer[] nums = { 1, 5, 2, 4, 3 };

		System.out.println(Arrays.toString(nums));

		// 오름차순 정렬
		//Arrays.sort(nums); //Quick Sort

		//System.out.println(Arrays.toString(nums));

		// 내림차순 정렬 > 지원 안함 > 직접 구현
		// Arrays.sort(배열, Comparator);
		Arrays.sort(nums, new MyComparator());
		
		System.out.println(Arrays.toString(nums));
		
		
		
		//쓸모 없음..
		MyComparator mc1 = new MyComparator();
		System.out.println(mc1.compare(10, 20));
		
		
		Double[] nums2 = { 2.5, 7.1, 3.8, 9.2, 8.9};
		
		Arrays.sort(nums2, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				
//				if(o1 < o2) {
//					return 1;
//				} else if(o1 > o2) {
//					return -1;
//				} else {
//					return 0;
//				}
				
				return (int)((o2 - o1) * 10);
				//return o2 - o1;
			}
			
		});
		
		System.out.println(Arrays.toString(nums2));
	}

}

//정렬때문에 선언한 클래스
class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		// o1 vs o2
		// 1. 오름 차순
		// a. o1이 더 크면 > 양수 반환 > 1
		// b. o2가 더 크면 > 음수 반환 > -1
		// c. 같으면 > 0 반환

		// 2. 내림 차순
		// a. o1이 더 크면 > 음수 반환 > -1
		// b. o2가 더 크면 > 양수 반환 > 1
		// c. 같으면 > 0 반환

		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return 1;
		} else {
			return 0;
		}

	}

}



class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]\n";
	}
	
	
	
	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
}
