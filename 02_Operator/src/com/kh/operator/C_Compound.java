package com.kh.operator;

import java.util.Scanner;

public class C_Compound {
	/*
	 * ���� ���� ������ : "=" ���Կ�����
	 * 
	 * �ٸ� ��������ڿ� ���Կ����ڰ� ������ ��
	 * => �ڱ� �ڽ��� ���� �ش� ��������� �� �� �� ����� �ڱ��ڽſ��� �ٽ� �����ϴ� �뵵 
	 */
	
	// +=
	// -=
	// *=
	// /=
	// %=
	
	/*
	 * ����
	 * 
	 * int endDays = 129;
	 * 
	 * ���� 23�� 59�� 59�ʿ� ������ �ڵ� : 
	 * 
	 * endDays = endDays - 1;
	 * 
	 * -------------------------
	 * 
	 * endDays -= 1
	 * System.out.println("�����ϱ��� " + endDays + "�� ���ҽ��ϴ�.")
	 * 
	 * 
	 * long veryBigNumberCount = 10000000000;
	 * 
	 * veryBigNumberCount = veryBigNumberCount - 1000;
	 * 
	 * veryBigNumberCount -= 1000;
	 * 
	 * 
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� �ϳ��� �Է����ּ��� ");
		int number = sc.nextInt();
		System.out.println(number);
		
		// ����ڰ� �Է��� ���� ���� �� �� ����
		// ����ڰ� �Է��� ������ 10�� �� ���� ���
		number = number - 10;
		System.out.println("10�� ���ҽ�Ų ���� �� :" + number);
		
		// ���� ���� �����ڸ� �̿��ϸ�
		number -= 10;
		System.out.println("20�� ���ҽ�Ų ���� �� :" + number);
	}
}
