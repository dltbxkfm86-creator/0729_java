package com.kh.chap03.escape;

import java.util.Scanner;

public class A_Break {
	/*
	 * ** ���ǻ��� : switch�� ���ο� �ۼ��ϴ� break������ ������ �ؾ� �� �ʿ䰡 ����!
	 * 				switch�� ���ο� �ִ� break�� switch���� ���������� �뵵�� ���
	 * 
	 * break : break���� ������ ���� "���� ����� �ݺ���"�� ��������
	 * 			break;���� ���� �ִ� �ݺ��� "�� ��"�� ��������
	 * 
	 */
	
	public void method1() {
		
		//System.out.println("�ȳ� ���� �޼��� 1�̾�");
		
		// ���� �ݺ��ϸ鼭 ������ ����(1 ~ 100)�� �����ؼ� ���
		// 50�� �����Ǹ� �ݺ��� �ߴ�!
		int count = 0;
		while(true) {
			int num = (int)(Math.random() * 100) + 1;
			System.out.println(num);
			if(num == 50) {
				System.out.println("���� �ߴ�");
				System.out.println(num);
				break;
			} 
			count++;
		}
		System.out.println("���� Ƚ�� : " + count);
	}
	
	public void method2() {
		
		// ���� �ݺ��ϸ鼭 ����ڿ��� �� �� ���ڿ��� �Է� ���� ��
		// �ش� ���ڿ��� ���̸� ���
		// ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ���ٸ� �ݺ��� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�ƹ��ų� ���� (���Ḧ ���ϽŴٸ� 'exit'�� �Է����ּ���");
			String keyword = sc.nextLine();
			
			System.out.println(keyword + "��(��)" + keyword.length() + "���� �Դϴ�");
			
			if(keyword.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�~");
				break;
			}
			
		}
	}
	
	// �� �� ����ڷκ��� �������� �Է¹ް�
	// ���� �Է��� ���ڰ� 0���� �۴ٸ� "���α׷��� �����մϴ�" ��� ������ ����ϰ� �����Ͻÿ�"
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���ڸ� �Է��ϼ���(�Է��� ���ڰ� 0���� �۴ٸ� ���α׷��� �����մϴ�)");
			int num = sc.nextInt();
			
			System.out.println("�Է��� ���ڴ� " +  num + "�Դϴ�");
			
			if(num < 0 ) {
				System.out.println("���α׷��� �����մϴ�~");
				break;
			}
		}
	}
	
	/*
	 * ����ڷκ��� �� ���� �������� �Է¹޾Ƽ�
	 * �Է¹��� ���ں��� 1������ ��� ���ڸ� ���
	 * 
	 * ��, �Է¹��� ������ 1���� Ŀ����
	 * 
	 * ���� 1�̸��� ���ڸ� �Է¹����� "1�̻��� ���ڸ� �Է��ϼ���"��� ����� ��
	 * �ٽ� ����ڿ��� ���� �Է¹��� �� �ֵ��� �����
	 * 
	 * ��� ���� )
	 * 
	 * 1�̻��� ���ڸ� �Է����ּ��� 4
	 * 4 3 2 1
	 * 
	 * 1�̻��� ���ڸ� �Է����ּ��� -1
	 * 1�̻��� ���ڸ� �Է����ּ���!!!
	 * 1�̻��� ���ڸ� �Է����ּ���  6
	 * 6 5 4 3 2 1
	 */

	public void method4() {
		
		
//		System.out.println("1�̻��� ���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt();
//		
//		if(num > 1) {
//			for(int i = num; i > 0; i--) { 
//				System.out.print(i + " ");
//			}
//		} else {
//			System.out.println("1�̻��� ���ڸ� �Է����ּ���!!!");
//		}
//		
		int num = 0;
		
		do {
			System.out.println("1�̻��� ���ڸ� �Է�");
			num = sc.nextInt();
			if(num < 1) System.out.println("1�̻��� ���ڸ� �Է�");
		} while(num < 1);
		
		for(; num > 0; num--) {
			System.out.println(num + " ");
		}
	}
}
