package com.kh.operator;

import java.util.Scanner;

public class exam {
	
	public void presentToStudent() {
		Scanner num = new Scanner(System.in);
		
		System.out.println("�������� �л��� ���� �Է��ϼ��� : ");
		int student = num.nextInt();
		
		System.out.println("���� ������ �Է��ϼ��� :");
		int candy = num.nextInt();
		
		int people = candy / student;
		int remain = candy % student;
		
		System.out.println("�л� �� ��� ���� �� �ִ� ������ ���� : " + people + "��");
		System.out.println("���� ���� ���� : " + remain + "��");
		
	}
}
