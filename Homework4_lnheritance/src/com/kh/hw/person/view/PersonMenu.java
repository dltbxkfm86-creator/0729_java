package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	public void mainMenu() {
		while(true) {
			int[] s = pc.personCount();
			int[] e = pc.personCount();
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다");
			System.out.println("현재 저장된 학생은" + s + "명입니다");
			System.out.println("사원은 최대 10까지 저장할 수 있습니다");
			System.out.println("현재 저장된 사원은" + e + "명입니다");
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			
			System.out.println("메뉴 번호 : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("종료합니다"); return;
			default : System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
			}
		}
		
		
		
	}
	
	public void studentMenu() {
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : insertStudent(); break;
		case 2 : printStudent(); break;
		case 9 : System.out.println("메인으로 돌아갑니다");
				 mainMenu();
		}
		
		if(s.length == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 "
					+ "때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			if (menuNo == 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		} else {
			
		}
	}
	
	public void employeeMenu() {
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : insertEmployee(); break;
		case 2 : printEmployee(); break;
		case 9 : System.out.println("메인으로 돌아갑니다");
				 mainMenu();
		}
	}
	
	public void insertStudent() {
		System.out.println("학생 이름 : ");
		System.out.println("학생 이름 : ");
		System.out.println("학생 이름 : ");
		System.out.println("학생 이름 : ");
		System.out.println("학생 이름 : ");
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
