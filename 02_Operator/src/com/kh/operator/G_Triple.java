package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	/*
	 * ���� ������ : �� �����ڰ� 3�� => �� 3���� 1���� �����ڷ� �̷����(���ǹ��� �������� ����)
	 * 
	 * ���ǹ� : ���� ���� ������ ó���ϴ� ���
	 * 		  ������� true�� ��� ù ��° ������ ó��
	 *		  ������� false�� ��� �� ��° ������ ó��
	 * 
	 * [ ǥ���� ] 
	 * ���ǽ� ? ���ǽ��� true�� ��� ����� : ���ǽ��� false�� ��� �����
	 * 
	 */
	
	public void method1() {
		System.out.println("���� �޴��� : ");
		System.out.println("1. �� ��� ���� ��� ����Ǫġ��");
		System.out.println("2. �ڸ� ���� ���� ����Ǫġ��");
		System.out.println("3. Ŀ�� ����� ����Ǫġ��");
		
		// ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�޴� ��ȣ�� �Է����ּ���");
		int menuNo = sc.nextInt();
		
		String selectedMenu = (menuNo == 1) ? "�� ��� ���� ��� ����Ǫġ�븦 �ֹ��ϼ̽��ϴ� "
							: (menuNo == 2) ? "�ڸ� ���� ���� ����Ǫġ�븦 �ֹ��ϼ̽��ϴ�"
							: (menuNo == 3) ? "Ŀ�� ����� ����Ǫġ�븦 �ֹ��ϼ̽��ϴ�"
							: "���� �޴��� �ֹ��ϼ̽��ϴ�.";
		
		// ���ǽ� ? ���ǽ��� true�� ���  ����� : ���ǽ��� false�� ��� ��� ��
		
		// ������ ��ȣ�� ���� �޴����� ���
		// 1�� �Է� �� == "�� ��� ���� ��� ����Ǫġ�븦 �ֹ��ϼ̽��ϴ�."
		
		System.out.println(selectedMenu);
		
//		if(menuNo == 1) {
//			System.out.println("1. �� ��� ���� ��� ����Ǫġ�븦 �ֹ��ϼ̽��ϴ�");
//		}
//		
//		else {
//			System.out.println("");
//		}
	
		// Ȧ¦ ���ϱ�
		
	}
	
	public void method2() {
		
		// ����ڿ��� ���� ���� �ϳ� �Է� �޾Ƽ�
		// �Է� ���� ������ Ȧ / ¦ �Ǻ��ؼ� ���
		
		// �Էµ��� ��Ī ����
		Scanner sc = new Scanner(System.in);
		
		// �ʿ��� ���� �Է¹��� �� �ֵ��� �޽��� ���
		System.out.println("���ڸ� �Է����ּ���");
		
		// ������ ������ ������ �� ��ĳ���� �޼ҵ带 ȣ���ؼ� �Է� ���ۿ� �ִ� �������� �޾ƿͼ�
		// ������ ���� ������ �ʱ�ȭ
		
		int num = sc.nextInt();
		System.out.println("���ϰ� ��� �� : ������ ���� " + num);
		
		char oddEven = ((num % 2 == 0)) ? '¦' : 'Ȧ';
		
		System.out.println("�Է��Ͻ�" + num + "��(��)" + oddEven + "�� �Դϴ�.");
		
		if (num % 2 == 0) {
			System.out.println(num + "�� ¦���Դϴ�");
		}
		
		else {
			System.out.println(num + "�� Ȧ���Դϴ�");
		}
	}
	
	public void practice() {
		
		// ����ڿ��� ���ĺ� �� ���ڸ� �Է¹޾Ƽ�
		// �Է¹��� ���ĺ��� �ҹ������� / �빮������ �Ǻ� �� ������ּ���
		
		// �������
		// XXX(����ڰ� �Է��� ���ĺ�)��(��) �ҹ��� / �빮�� �Դϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ� �� ���ڸ� �Է����ּ���");
		
		char input = sc.nextLine().charAt(0);
		char result = (('a' <= input) && (input <= 'z')) ? '��' : '��';
//		String result = Character.isUpperCase(input) ? "�빮��" :
//						Character.isLowerCase(input) ? "�ҹ���" : "���ĺ��� �ƴ�";
				
		System.out.println(input + "��(��)" + result +"�����Դϴ�");
		
		sc.close();
		//System.out.println(str);
	}
}
