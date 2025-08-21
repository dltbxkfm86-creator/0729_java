package com.kh.operator;

import java.util.Scanner;

public class exam {
	
	public void presentToStudent() {
		Scanner num = new Scanner(System.in);
		
		System.out.println("나누어줄 학생의 수를 입력하세요 : ");
		int student = num.nextInt();
		
		System.out.println("사탕 개수를 입력하세요 :");
		int candy = num.nextInt();
		
		int people = candy / student;
		int remain = candy % student;
		
		System.out.println("학생 한 명당 받을 수 있는 사탕의 개수 : " + people + "개");
		System.out.println("남은 사탕 개수 : " + remain + "개");
		
	}
}
