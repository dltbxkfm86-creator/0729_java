package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * if ~ else
	 * 
	 * [ ǥ���� ]
	 * 
	 * if(���ǽ�) {
	 * 
	 * 		���ǽ��� ����� true���� �� ������ �ڵ� 		- a
	 * 
	 * } else {
	 * 
	 * 		���ǽ��� ����� false���� �� ������ �ڵ� 		- b
	 * 
	 * }
	 * 
	 * -> ���ǽ��� ����� true�� ��� a�� ����
	 * -> ���ǽ��� ����� false�� ��� b�� ���� 
	 */
	
	public void method1() {
		
		// ����ڿ��� ������ �Է¹޾Ƽ� 0���� ū�� �ƴ��� �Ǻ� �� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�Է°��� 0���� Ů�ϴ�!");
		} else {
			System.out.println("�Է°��� 0���� ũ�� �ʽ��ϴ�!");
		}
		
		/*
		if(!(num > 0)) {
			System.out.println("0���� ũ�� �ʾƿ�");
		}
		*/
		
		// if���� ���ǽ��� ����� true�� ��� => else���� �ǳ� ��
		// ���ʿ��� ������ �پ�� => ó���ӵ��� ���
		
		/*
		 * if ~ else if��
		 * 
		 * [ ǥ���� ]
		 * 
		 * if(���ǽ�1) {
		 * 		���ǽ� 1�� true�� ��� ������ �ڵ�
		 * } else if (���ǽ�2) {
		 * 		���ǽ� 2�� true�� ��� ������ �ڵ�
		 * } else if (���ǽ�3) {
		 * 		���ǽ� 3�� true�� ��� ������ �ڵ�
		 * } else if (���ǽ�4) {
		 * 		���ǽ� 4�� true�� ��� ������ �ڵ�
		 * } else {
		 * 		�տ��� ����ߴ� ��� ���ǵ��� false�� ��� ������ �ڵ�
		 * }
		 */
		
	}
	
	public void method2() {
		
		// ������ �Է��� �޾Ƽ� 0���� ū��/ 0���� / 0���� ������ ���
		
		System.out.println("������ �Է��� �޾Ƽ� 0���� ū��/ 0���� / 0���� ������ ����ϴ� ���α׷�");
		System.out.println("������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("0���� Ů�ϴ�");
		} else if(num < 0) {
			System.out.println("0���� �۽��ϴ�");
		} else {
			System.out.println("0�Դϴ�");
		}
		
	}
	
	public void ageCheck() {
		
		// ����ڿ��� ���̸� �Է¹ް�
		// �з¹��� ���̿� ���� ���� �ٸ� ������ ����ּ���.
		// 1 ~ 12 : ���
		// 13 ~ 17 : û�ҳ�
		// 18 ~ : �����Դϴ�.
		// 0, -n : �ܰ���
		
		System.out.println("���� üũ ���α׷�");
		System.out.println("���̸� �Է��ϼ���");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num < 13 && num > 0) {
			System.out.println("���");
		} else if(num < 18 && num >= 13) {
			System.out.println("û�ҳ�");
		} else if (num >= 18) {
			System.out.println("����");
		} else {
			System.out.println("�ܰ���");
		}
		
		if(num < 0) {
			System.out.println("�ùٸ� ���̸� �Է����ּ���");
		} else if(num >= 18) {
			System.out.println("�����Դϴ�.");
		} else if(num <= 12) {
			System.out.println("����Դϴ�");
		} else {
			System.out.println("û�ҳ��Դϴ�");
		}
		
	}

}
