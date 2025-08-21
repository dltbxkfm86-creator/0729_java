package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * (단일) if문
	 * 
	 * [ 표현법 ]
	 * 
	 * if (조건식) {
	 * 
	 * 		조건식 true일 경우 실행하고자 하는 코드;
	 * 
	 * }
	 * 
	 * => 조건식이 결과가 true일 경우 : if문 Scope({})안의 코드가 수행
	 * => 조건식의 결과가 false일 경우 : if문 Scope({})를 건너뜀!
	 */
	
	public void method1() {
		
		if(0 < 1) {
			System.out.println("0이 1보다 작아용");
		}
		
		
		
		// if문의 조건식자리에는 결론적으로 true 아니면 false값이 들어가도록 만들어야함!
		
		if(false) {
			System.out.println("얘는 죽었더 깨나도 안나옴");
		}
		
		if(true) {
			System.out.println("조건식 자리에는 최종적으로 true가 와야함");
		}
	}
	
	public void method2() {
		
		boolean loginCheck = false; // 로그인 상태를 저장해둔 변수
		
		if(loginCheck == false) {
			System.out.println("네이버를 더 안전하고 편리하게 이용해보세요.");
			System.out.println("NAVER 로그인");
			System.out.println("아이디 찾기 | 비밀번호 찾기 | 회원가입");
		}
		
		if(loginCheck) {
			System.out.println("홍길동님 환영합니다 :)");
			System.out.println("메일 | 카페 | 블로그 | 쇼핑 | 예약");
		}
	}
	
	public void lunchMenu() {
		
		// 오늘의 날씨를 입력받아서
		Scanner sc = new Scanner(System.in);
		
		// 더움 / 맑음 / 비옴
		System.out.println("오늘의 날씨는 어떤가요(더움 / 맑음 / 비옴) ");
		String weather = sc.nextLine();
		// System.out.println(weather);
		// 점심 메뉴를 추천해주는 프로그램
		// 비옴을 입력했다면 김밥천국을 가라고 하자
		
		// 사용자가 입력한 값과 "비옴"이라는 문자열값을 동등비교해서 일치하는지 비교
		// weather 동등비교 "비옴"
		// System.out.println(weather == "비옴");
		// 문자열값 비교
		// 동등비교연산자(==)를 사용할 수 없음
		// .equals()를 호출해야함
		// System.out.println(weather.equals("비옴"));
		//if (weather == equals("비옴")) {
		
		
		// 조건
		// 만약에 사용자가 입력한 문자열		이 "비옴"과	일치한다면
		// if		weather				"비옴"	.equals()
		// 김밥천국
		
		if(weather.equals("비옴")) {
			System.out.println("김밥천국에서 스페셜정식드세요~");
		}
		
		// 만약에 사용자가 입력한 문자열이 "더움"과 일치한다면
		
		if(weather.equals("더움")) {
			System.out.println("김밥일번가에서 냉모밀 드세요~");
		}
		
		// 만약에 사용자가 입력한 문자열이 "맑음"과 일치한다면
		
		if(weather.equals("맑음")) {
			System.out.println("서브웨이가서 아무거나 드세요~");
		}
	}
	
	public void method3() {
		
		// 사용자에게 정수값을 입력받아서 홀 / 짝을 판별 = > 츌력
		// if문을 이용해서 출력!
		// 단, 입력받은 정수가 0보다 클 경우에만 조건문을 실행!
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		
		// if
		
		// 조건식
		//
		// 비교연산
		// 1. 입력받은 정수가 0보다 클경우에만
		//		number > 0
		// 2. 홀/짝
		//		입력받은 정수를 2로 나눈 나머지를 0과 동등비교해서
		//		number  % 	2 	==		0 짝수(true 일 때)
		//		!number %	2	==		0 홀수(true 일 때)
		int num = sc.nextInt();
		
		boolean flag = num > 0;
		
		if(flag && num % 2 == 0) {System.out.println("짝수"); }
		if(flag && num % 2 == 0) System.out.println("홀수");
		
		// if문 중첩
		if(num > 0) {
			if(num % 2 == 0) System.out.println("짝수");
			if(num % 2 == 1) System.out.println("홀수");
		}
		if (num > 0 && num % 2 == 0) {
			System.out.println('짝');
		}
			
		if (num > 0 && num % 2 == 1) {
			System.out.println('홀');
		}
		
		else {
			System.out.println("0보다 큰 정수를 입력해주세요");
		}
		
	}
	
	public void method4() {
		
		// 1. 메뉴판 보여주기
		// 출력문 == System.out.println()
		
		System.out.println("시즌 메뉴판");
		System.out.println("1. 소주(5000)");
		System.out.println("2. 맥주(4000)");
		System.out.println("메뉴 번호를 선택해주세요");
		// 2. 메뉴번호로 메뉴 입력받기
		// Scanner 사용해서 nextInt()
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 3. 수량 입력받기
		// Scanner 사용해서 nextInt()
		System.out.println("수량을 정해주세요");
		int quantity = sc.nextInt();
		
		// 4. 조건문
		// if문을 이용해서 입력한 메뉴번호에 따라 메뉴명 대입하기
		// 혹시 없는 메뉴 번호를 입력했다면 없는 메뉴라고 대입하기
		
		String numName = "";
		if(num == 1) numName = "소주";
		if(num == 2) numName = "맥주";
		if(!(num == 1) && !(num == 2)) numName = "없는 메뉴";
		
		
		if (num == 1) {
			System.out.println("1. 소주(5000)");
		}
		if (num == 2) {
			System.out.println("2. 맥주(4000)");
		}
		
		else {
			System.out.println("없는 메뉴입니다.");
		}
		// 5. XXXX메뉴를 XXX잔 주문하셨습니다. 출력해주기 print()
		System.out.println("--------------주문내역-----------------");
		System.out.println(num + "번 메뉴를 " + quantity + "병 주문하셨습니다" );
		
		// 6. 진짜 주문할건지 물어보기
		// Y / N 입력 받아서 확인하기
		
		System.out.println("진짜 주문하실건가요? (Y/N) ");
		sc.nextLine();
		char answer = sc.nextLine().charAt(0);
		System.out.println(answer);
		// 7. 6번에서 입력받은 단일 문자가 'Y' 또는 'y'와 일치한다면
		// 메뉴명과 수량과 가격 출력하기 if문 + 중첩 if문 + 출력문
				

		if((answer) == 'Y' || (answer =='y')) {
			int price = 0;
			if(num == 1) price = 5000;
			if(num == 2) price = 4000;
			
			System.out.println("총 결제금액은 " + (price * quantity) +"원입니다");
		}
				
		
		

	}
}