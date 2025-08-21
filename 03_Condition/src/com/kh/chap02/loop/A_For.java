package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	public void method0() {
		/*
		System.out.println("자 월요일 힘내보아용~~~");
		System.out.println("자 월요일 힘내보아용~~~");
		System.out.println("자 월요일 힘내보아용~~~");
		*/
		//반복해야하는 횟수가 328765번 이라면..?
		
		for(int i = 0; i < 5; i++) {
			System.out.println("돌려돌려~~");
		}
		
	}
	
	/*
	 * for문
	 * 
	 * for() {
	 * 
	 * }
	 * 
	 * 괄호안은 반복의 횟수를 지정하는 부분
	 * 초기식; 조건식; 증감식		세 가지로 이루어짐
	 * ;; 세미콜론으로 구분함
	 * 
	 * [ 표현법 ]
	 * 
	 * for(초기식; 조건식; 증감식) {
	 * 		반복적으로 실행하고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문을 시작할 때 "초기에 단 한번만 실행"될 구문
	 * 			반복을 할 때 필요한 변수를 선언하고 초기화 하는 구문(제어변수) => int i = 0;
	 * 
	 * - 조건식 : "반복문이 실행될 조건"을 작성하는 구문
	 * 			조건식의 결과가 true일 경우 반복을 수행
	 * 			조건식의 결과가 false일 경우 반복문을 멈추고 for문 블럭을 빠져나옴 => i < 5;
	 * 
	 * - 증감식 : "반복문을 제어하는 변수에 대입된 값"을 증감하는 구문
	 * 			보통 초기식에서 선언된 변수를 가지고 증감식 작성
	 * 			이 때, 보편적으로 증감연산자를 사용함 						=> ㅑ++
	 */
	
	public void method1() {
		
		// 
		// 1
		// 2
		// 3
		// 4
		// 5
		//
		
//		for(int i = 1; i <=5; i++) {
//			System.out.println(i + "번 반복");
//		}
		
		// for문을 이용해서 반복을 3번 한다고 가정
		// i, j, k
		for(int i = 0; i < 3; i++ ) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 5; i+=2) {
			System.out.println(i);
		}
		
		for(int i = 100;  i >= 1; i--) {
			System.out.println(i);
		}
		
	}
	
	public void gugudan() {
		
		// 구구단
		
		// 사용자에게 정수를 입력받아서
		// 사용자가 입력한 정수를 이용해서 구구단을 출력해보기
		// 구구단을 외자
		// 몇 단을 출력하시겠습니까
		
		// 8 x 1 = 8
		// 8 x 2 = 16
		// 8 x 3 = 24
		// ...
		// 8 x 9 = 72
		
		System.out.println("구구단을 외자 \n몇 단을 출력하시겠습니까");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num + "단을 출력하겠습니다");
		for(int i = 1; i <=9 ; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
		
	}
	
	public void method2() {
		
		//★★★
		//★★★
		//★★★
		
//		System.out.println("★★★");
//		System.out.println("★★★");
//		System.out.println("★★★");
//		System.out.println();
//		System.out.println("★");
//		System.out.println("★");
//		System.out.println("★");
//		System.out.println();
//		System.out.println("★");
//		System.out.println("★");
//		System.out.println("★");
//		System.out.println();
//		System.out.println("★");
//		System.out.println("★");
//		System.out.println("★");
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j <3; j++) {
				
				System.out.print("★");
				
			}
			
			System.out.println();
		}
		
		// 출력 : X번째 반복
		//		10번째 반복마다 ♥를 하나씩 찍어주기
		for(int i = 0; i < 100; i++) {
			System.out.println((i+1) + "번째 반복");
			
			// (i + 1) == 10 || (i + 1) == 20 ||
			if((i+1) % 10 == 0) {
				System.out.println("♥");
			}
		}
		
	}
	
	public void method3() {
		
		for(;;) {
			System.out.println("구구단 프로그램~~~");
			System.out.println("1. 구구단 프로그램 시작하기");
			System.out.println("2. 구구단 프로그램 설명하기");
			System.out.println("3. 프로그램 종료하기");
			Scanner sc = new Scanner(System.in);
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			if(menuNo == 1) {
				gugudan();
			} else if(menuNo == 2) {
				System.out.println("구구단을 동작시켜줘");
				System.out.println("참 재미있어");
			} else if(menuNo == 3) {
				System.out.println("프로그램을 종료합니다");
				return;
			} else {
				System.out.println("이런 메뉴는 없어요");
			}
			System.out.println();
		}
	}
}
