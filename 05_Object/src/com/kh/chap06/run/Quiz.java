package com.kh.chap06.run;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt1 = 0;
		int cnt2 = 0;
		
		
		while(true) {
			
			System.out.println("���ϱ� ��������(exit �Է½� ����)");
			System.out.println("���̵��� �������ּ���(��/��/��)");
			String level = sc.nextLine();
			
			int bound = 0;
			int quizCount = 1;
			
			if(level.equals("��")) {
				System.out.println("���̵� (��)�� �����ϼ̽��ϴ�. 1 ~ 3000 ������ ������ �����˴ϴ�.");
				bound = 3000;
			} else if(level.equals("��")) {
				System.out.println("���̵� (��)�� �����ϼ̽��ϴ�. 1 ~ 200 ������ ������ �����˴ϴ�.");
				bound = 200;
			} else if(level.equals("��")) {
				System.out.println("���̵� (��)�� �����ϼ̽��ϴ�. 1 ~ 10 ������ ������ �����˴ϴ�.");
				bound = 10;
			} else if(level.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			} else {
				System.out.println("�̻��� ���̵��� �����ϼ̽��ϴ�.");
				System.out.println("ó������ �ٽ� �õ����ּ���");
				continue;
			}
			
			 int firstNumber = (int)(Math.random() * bound) + 1;
			 int secondNumber = (int)(Math.random() * bound) + 1;
			 
			 
			 
			 System.out.println(quizCount + "�� ����");
			 System.out.println(firstNumber + " + " + secondNumber + " = ?");
			 System.out.println("������ �Է����ּ���");
			 int answer = sc.nextInt();
			 sc.nextLine();
			 
			 if(answer == firstNumber + secondNumber) {
				 System.out.println("�����Դϴ�");
				 cnt1++;
			 } else {
				 System.out.println("�����Դϴ�");
				 cnt2++;
			 }
			 
			 System.out.println("�� ���� �� : " + quizCount + "ȸ");
			 System.out.println(" ���� Ƚ�� : " + cnt1 + "�� / ����Ƚ�� : " + cnt2 + "��");
			 System.out.println();
		}
		
	}

}
