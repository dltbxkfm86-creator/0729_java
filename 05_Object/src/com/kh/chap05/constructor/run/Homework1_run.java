package com.kh.chap05.constructor.run;

import java.util.Scanner;

import com.kh.chap05.constructor.mode.vo.Homework1;

public class Homework1_run {
	public static void main(String[] args) {
		System.out.println("휴대폰 변경하기");
		
		Homework1 homework = new Homework1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("휴대폰 이름을 해주세요");
		homework.name = sc.nextLine();
		
		System.out.println("휴대폰 색깔을 입력해주세요");
		homework.color = sc.nextLine();
		
		System.out.println("휴대폰 무게를 입력하세요");
		homework.weight = sc.nextInt();
		sc.nextLine();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("===========================");
			System.out.println(homework.name + "의 정보!");
			System.out.println("색 : " + homework.color);
			System.out.println("무게 : " + homework.weight);
			System.out.println("===========================");
			
			System.out.println("1.색 변경하기 / 2. 무게 변경하기 / 3. 프로그램 종료");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1: homework.colorChange(); break;
			case 2: homework.weightChange(); break;
			case 3: exit = true; break;
			}
		}
		
		
		
		
	}
}
