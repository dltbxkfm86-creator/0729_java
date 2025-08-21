package com.kh.chap02.loop;

public class B_While {
	/*
	 * while문
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식;				// 필수는 아님
	 * 
	 * while(조건식) {
	 *
	 *		반복적으로 실행하고자 하는 코드;
	 * 		증감식;			// 필수는 아님
	 * 
	 * }
	 * 
	 * while문의 조건식의 결과값이 true일 경우 반복적으로 실행하고자하는 코드가 실행
	 * 
	 * for			=> 개발자가 반복의 횟수를 명확하게 알고 있다
	 * while		=> 개발자가 반복의 횟수를 가늠할 수 없음 
	 * 
	 * 무한반복
	 * 
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		while(true) { // 무한 반복의 의미
			System.out.println("무한 반복");
		}
	}
	
	public void method2() {
		
		
		int i = 0;
		
		while(i < 3) {
			System.out.println(i);
			i++;
		}
	}
	
	public void method3() {
		
		// 1 ~ 10까지의 정수 중 짝수의 합 출력
		// 55
		// 2550
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			if(i % 2 == 0) {
				sum += i;
			}
			i++;
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void method4() {
		
		// 1부터 시작해서
		// 1~10 사이의 랜덤한 정수까지를 모두 더한 합계를 출력
		// random : 무작위
		// Random이라는 클래스가 존재
		// Math라는 클래스가 가지고 있는 random()을 호출해서 만들어 볼 예정
		// Math.random();
		// System.out.println(Math.random());
		// 0.6734157610266371
		
		// random()의 결과값 : 0.0 ~~~ 0.99999999999999 사이
		
		// 1단계. random() 호출 결과 체크
		double num = Math.random();
		// System.out.println(num);
		// 1 ~ 10
		
		// 2_1. num에 10을 곱하면?
		// 		0.0 ~~~ 9.9999999999
		// System.out.println(num * 10);
		// 2_2. int형으로 강제형변환
		// 			0 ~~~~ 9
		//System.out.println((int)(num * 10));
		// 2_3. + 1
		//		1 ~~~ 10
		
		int randomNum = (int)(Math.random()*10) + 1;
		System.out.println("가공이 끝난 무작위 정수 : " + randomNum);
		// (int)(Math.random() * 몇 개의 랜덤값) + 시작값;
		int sum = 0;
		for(int i = 1; i<=randomNum; i++) {
			sum += i;
		}
		
		System.out.println("합계 :" + sum);
		
		// -------------------------------------------------
		
		int i = 1;
		while(i <= randomNum) {
			sum += i;
			i++;
		}
//		int i = (int(Math.random() * 10)
//		int sum = 0;
//		while(1 < i) {
//			}
//		}
//		System.out.println(sum);
	}
	
	public void lotto() {
		
		// 로또 번호 생성기 ver_0.1
		// 범위 : 1 ~ 45
		// 6개 선택
		// (Math.random() * 45)
		// 0.0 ~ 44.999999
		//
		int num1 = (int)(Math.random() * 45) + 1;
		int num2 = (int)(Math.random() * 45) + 1;
		int num3 = (int)(Math.random() * 45) + 1;
		int num4 = (int)(Math.random() * 45) + 1;
		int num5 = (int)(Math.random() * 45) + 1;
		int num6 = (int)(Math.random() * 45) + 1;
		
		System.out.println("이번 주 로또 번호");
		System.out.printf("%d,%d,%d,%d,%d,%d", num1,num2,num3,num4,num5,num6);
		
	}
	
	/*
	 * do-while
	 * 
	 * 별도의 조건검사 없이 무조건 한 번은 실행!!!!!
	 * 조건이 true값이 아니더라도 한 번은 꼭 수행!!!!
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식; // 필수 X
	 * 
	 * do {
	 * 		실행할 코드;
	 * 		증감식;	// 필수 X
	 * } while(조건식);
	 * 
	 */
	
	public void method5() {
		/*
		while(false) {
			System.out.println("먼데 이거");
		}
		*/
		
		do {
			System.out.println("1번은 수행");
		} while(false);
	}
	
	
}
