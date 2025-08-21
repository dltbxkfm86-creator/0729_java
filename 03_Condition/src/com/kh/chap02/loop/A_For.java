package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	public void method0() {
		/*
		System.out.println("�� ������ �������ƿ�~~~");
		System.out.println("�� ������ �������ƿ�~~~");
		System.out.println("�� ������ �������ƿ�~~~");
		*/
		//�ݺ��ؾ��ϴ� Ƚ���� 328765�� �̶��..?
		
		for(int i = 0; i < 5; i++) {
			System.out.println("��������~~");
		}
		
	}
	
	/*
	 * for��
	 * 
	 * for() {
	 * 
	 * }
	 * 
	 * ��ȣ���� �ݺ��� Ƚ���� �����ϴ� �κ�
	 * �ʱ��; ���ǽ�; ������		�� ������ �̷����
	 * ;; �����ݷ����� ������
	 * 
	 * [ ǥ���� ]
	 * 
	 * for(�ʱ��; ���ǽ�; ������) {
	 * 		�ݺ������� �����ϰ��� �ϴ� �ڵ�;
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ������ �� "�ʱ⿡ �� �ѹ��� ����"�� ����
	 * 			�ݺ��� �� �� �ʿ��� ������ �����ϰ� �ʱ�ȭ �ϴ� ����(�����) => int i = 0;
	 * 
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 * 			���ǽ��� ����� true�� ��� �ݺ��� ����
	 * 			���ǽ��� ����� false�� ��� �ݺ����� ���߰� for�� ���� �������� => i < 5;
	 * 
	 * - ������ : "�ݺ����� �����ϴ� ������ ���Ե� ��"�� �����ϴ� ����
	 * 			���� �ʱ�Ŀ��� ����� ������ ������ ������ �ۼ�
	 * 			�� ��, ���������� ���������ڸ� ����� 						=> ��++
	 */
	
	public void method1() {
		
		// 
		// 1
		// 2
		// 3
		// 4
		// 5
		//
		
//		for(int i = 1; i <=5; i++) {
//			System.out.println(i + "�� �ݺ�");
//		}
		
		// for���� �̿��ؼ� �ݺ��� 3�� �Ѵٰ� ����
		// i, j, k
		for(int i = 0; i < 3; i++ ) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 5; i+=2) {
			System.out.println(i);
		}
		
		for(int i = 100;  i >= 1; i--) {
			System.out.println(i);
		}
		
	}
	
	public void gugudan() {
		
		// ������
		
		// ����ڿ��� ������ �Է¹޾Ƽ�
		// ����ڰ� �Է��� ������ �̿��ؼ� �������� ����غ���
		// �������� ����
		// �� ���� ����Ͻðڽ��ϱ�
		
		// 8 x 1 = 8
		// 8 x 2 = 16
		// 8 x 3 = 24
		// ...
		// 8 x 9 = 72
		
		System.out.println("�������� ���� \n�� ���� ����Ͻðڽ��ϱ�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num + "���� ����ϰڽ��ϴ�");
		for(int i = 1; i <=9 ; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
		
	}
	
	public void method2() {
		
		//�ڡڡ�
		//�ڡڡ�
		//�ڡڡ�
		
//		System.out.println("�ڡڡ�");
//		System.out.println("�ڡڡ�");
//		System.out.println("�ڡڡ�");
//		System.out.println();
//		System.out.println("��");
//		System.out.println("��");
//		System.out.println("��");
//		System.out.println();
//		System.out.println("��");
//		System.out.println("��");
//		System.out.println("��");
//		System.out.println();
//		System.out.println("��");
//		System.out.println("��");
//		System.out.println("��");
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j <3; j++) {
				
				System.out.print("��");
				
			}
			
			System.out.println();
		}
		
		// ��� : X��° �ݺ�
		//		10��° �ݺ����� ���� �ϳ��� ����ֱ�
		for(int i = 0; i < 100; i++) {
			System.out.println((i+1) + "��° �ݺ�");
			
			// (i + 1) == 10 || (i + 1) == 20 ||
			if((i+1) % 10 == 0) {
				System.out.println("��");
			}
		}
		
	}
	
	public void method3() {
		
		for(;;) {
			System.out.println("������ ���α׷�~~~");
			System.out.println("1. ������ ���α׷� �����ϱ�");
			System.out.println("2. ������ ���α׷� �����ϱ�");
			System.out.println("3. ���α׷� �����ϱ�");
			Scanner sc = new Scanner(System.in);
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			if(menuNo == 1) {
				gugudan();
			} else if(menuNo == 2) {
				System.out.println("�������� ���۽�����");
				System.out.println("�� ����־�");
			} else if(menuNo == 3) {
				System.out.println("���α׷��� �����մϴ�");
				return;
			} else {
				System.out.println("�̷� �޴��� �����");
			}
			System.out.println();
		}
	}
}
