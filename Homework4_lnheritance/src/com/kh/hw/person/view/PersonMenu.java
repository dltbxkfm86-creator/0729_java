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
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�");
			System.out.println("���� ����� �л���" + s + "���Դϴ�");
			System.out.println("����� �ִ� 10���� ������ �� �ֽ��ϴ�");
			System.out.println("���� ����� �����" + e + "���Դϴ�");
			
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			
			System.out.println("�޴� ��ȣ : ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("�����մϴ�"); return;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ� �ٽ� �Է����ּ���");
			}
		}
		
		
		
	}
	
	public void studentMenu() {
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1 : insertStudent(); break;
		case 2 : printStudent(); break;
		case 9 : System.out.println("�������� ���ư��ϴ�");
				 mainMenu();
		}
		
		if(s.length == 3) {
			System.out.println("�л��� ���� �� �ִ� ������ �� á�� "
					+ "������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
			if (menuNo == 1) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
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
		case 9 : System.out.println("�������� ���ư��ϴ�");
				 mainMenu();
		}
	}
	
	public void insertStudent() {
		System.out.println("�л� �̸� : ");
		System.out.println("�л� �̸� : ");
		System.out.println("�л� �̸� : ");
		System.out.println("�л� �̸� : ");
		System.out.println("�л� �̸� : ");
		
	}
	
	public void printStudent() {
		
	}
	
	public void insertEmployee() {
		
	}
	
	public void printEmployee() {
		
	}
}
