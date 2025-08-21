package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	/*
	 * ���α׷� ���� �� �߻��ϴ� ���ܵ�
	 * RuntimeException
	 * 
	 * 
	 * - NullPointerException : �ּҰ� ��ü�� �����ߴ��� null���� ������� ��� �߻��ϴ� ����
	 * - ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� �������� �� �߻��ϴ� ����
	 * - ClassCastException : ����� �� ���� ����ȯ�� ������ ��� �߻��ϴ� ����
	 * - ArithmeticException : ������ ������ 0���� ������ �߻��ϴ� ����
	 * - NegativeArraySizeException : �迭�� �Ҵ��� �� ũ�⸦ ������ �����ϸ� �߻��ϴ� ����
	 * ...
	 * 
	 * RuntimeException�� ���õ� ���ܵ��� �������� ����
	 * �����ڰ� ������ ������
	 * 
	 * 
	 * 
	 */
	
	// ArithmeticException
	public void method1() {
		// ����ڿ��� �� ���� �������� �Է¹޾Ƽ� �������� �� �� ����� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù ��° ������ �Է����ּ��� ");
		int num1 = sc.nextInt();
		
		System.out.println("�� ��° ������ �Է����ּ���(0�� �Է����� ������)");
		int num2 = sc.nextInt();
		
		// ��� 1. ���ܹ߻� ��ü�� ��õ �����ع���
		/*
		if(num2 !=0 ) {
			System.out.println("���� ��� : " + (num1 / num2 ));
		} else {
			System.out.println("0�� �Է�����������");
		}
		*/
		
		// ��� 2. ����ó���� ����
		
		// ����ó�� :
		// ���� ��Ȳ�� �����ϰ� ���ܻ�Ȳ �߻� ��
		// ���α׷��� ���������� ���ᰡ �Ǵ� ���� �����ϰ� ������ ���� ���븦 ���ϴ� ��
	
		
//		System.out.println(num1 / num2);
//		System.out.println("����ȣȣ");
		
		/*
		 * try ~ catch��
		 * 
		 * [ ǥ���� ]
		 * 
		 * try {
		 * 
		 * 		(num1 / num2) // ���ܰ� �߻��� �� �� �ִ� ����
		 * 
		 * } catch(�߻��� ����Ŭ������ ������) { => �Ű�����
		 * 		
		 * 		�ش� ���ܰ� �߻����� �� ������ ����
		 * 
		 * }
		 * 
		 */
		try {
			
			System.out.println(num1 / num2);
			
			System.out.println("�ùٸ� ���� �Է�");
			
		} catch(ArithmeticException e) {
			
			System.out.println("�� ��° ������ 0�� �Է��Ͻø� ���� ���� �����ϴ�");
			
		}
		
		System.out.println("���α׷� ����");
	}
	
	public void homeWork() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("�޴��� �������ּ���");
			System.out.println("1. �߰��ϱ�");
			System.out.println("2. �˻��ϱ�");
			int menuNo = 0;
			try {
				
				menuNo = sc.nextInt();				
				
			} catch(InputMismatchException e) {
				System.out.println("�������� �Է����ּ���");
				
				// ����ó�� �� catch���� ������ϴ� ������ ��¹��� �ƴ�
			}
			
			sc.nextLine();
			
			System.out.println(menuNo + "�� �޴��� �����ϼ̽��ϴ�");
			
		}
		
	}
	
	public void method2() {
		
		//System.out.println("����");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ��� (0�� ����)");
		
		try {
			int num = sc.nextInt();
			// InputMismatchException
			
			System.out.println("100�� �Է°����� ���� ��� : " + (100 / num));
			// ArithmeticException
			
		} catch(InputMismatchException e) { // 1. ���� �Է¹��� ���� �������� �Ǵ�
			System.out.println("���ڷ� �� �������� �ƴմϴ�.");
		} catch(ArithmeticException e) { // 2. ������ �´ٸ� 0���� �Ǻ� 
			System.out.println("0�� �ȵſ�");
		}
		
		System.out.println("���α׷� ����");
		
	}
	
	public void method3() {
		// �迭
		
		// ����ڿ��� �������� �Է¹޾Ƽ�
		// �Է¹��� ��ŭ�� ũ�⸦ ���� �迭�� ���� �� �Ҵ��ϰ�
		// 100��° �ε��� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���");
		
		// InputMismatchException : ��ĳ�� �޼ҵ��� �ڷ����� ��ġ���� ����
		// NegativeArraySizeException : �迭�� ũ�⸦ ������ �����ϸ� �ľ�
		// ArrayIndexOutOfBoundsException : �迭�� ũ�⺸�� ū �ε����� �����ϸ� �ľ�
		
		try {
			int num = sc.nextInt();
			int[] arr = new int[num];
			//Array[] arr = new Array[num];
			System.out.println(arr[100]);			
		} catch(NegativeArraySizeException e) {
			e.printStackTrace(); // ��� �� ���ߴܰ迡����
			System.out.println("������������");
		} catch(RuntimeException e) {
			System.out.println("�Ƹ��� ������ �Է��߰ų� 100���� ũ�� �ʾƼ�");
		}
		
//		catch(NegativeArraySizeException e) {
//			System.out.println("������������");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("101���� ū��");
	}
		
}
