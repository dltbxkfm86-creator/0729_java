package com.kh.chap05.constructor.run;

import java.util.Scanner;

import com.kh.chap05.constructor.mode.vo.Homework1;

public class Homework1_run {
	public static void main(String[] args) {
		System.out.println("�޴��� �����ϱ�");
		
		Homework1 homework = new Homework1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޴��� �̸��� ���ּ���");
		homework.name = sc.nextLine();
		
		System.out.println("�޴��� ������ �Է����ּ���");
		homework.color = sc.nextLine();
		
		System.out.println("�޴��� ���Ը� �Է��ϼ���");
		homework.weight = sc.nextInt();
		sc.nextLine();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("===========================");
			System.out.println(homework.name + "�� ����!");
			System.out.println("�� : " + homework.color);
			System.out.println("���� : " + homework.weight);
			System.out.println("===========================");
			
			System.out.println("1.�� �����ϱ� / 2. ���� �����ϱ� / 3. ���α׷� ����");
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
