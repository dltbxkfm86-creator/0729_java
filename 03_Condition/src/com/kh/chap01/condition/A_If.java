package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * (����) if��
	 * 
	 * [ ǥ���� ]
	 * 
	 * if (���ǽ�) {
	 * 
	 * 		���ǽ� true�� ��� �����ϰ��� �ϴ� �ڵ�;
	 * 
	 * }
	 * 
	 * => ���ǽ��� ����� true�� ��� : if�� Scope({})���� �ڵ尡 ����
	 * => ���ǽ��� ����� false�� ��� : if�� Scope({})�� �ǳʶ�!
	 */
	
	public void method1() {
		
		if(0 < 1) {
			System.out.println("0�� 1���� �۾ƿ�");
		}
		
		
		
		// if���� ���ǽ��ڸ����� ��������� true �ƴϸ� false���� ������ ��������!
		
		if(false) {
			System.out.println("��� �׾��� ������ �ȳ���");
		}
		
		if(true) {
			System.out.println("���ǽ� �ڸ����� ���������� true�� �;���");
		}
	}
	
	public void method2() {
		
		boolean loginCheck = false; // �α��� ���¸� �����ص� ����
		
		if(loginCheck == false) {
			System.out.println("���̹��� �� �����ϰ� ���ϰ� �̿��غ�����.");
			System.out.println("NAVER �α���");
			System.out.println("���̵� ã�� | ��й�ȣ ã�� | ȸ������");
		}
		
		if(loginCheck) {
			System.out.println("ȫ�浿�� ȯ���մϴ� :)");
			System.out.println("���� | ī�� | ��α� | ���� | ����");
		}
	}
	
	public void lunchMenu() {
		
		// ������ ������ �Է¹޾Ƽ�
		Scanner sc = new Scanner(System.in);
		
		// ���� / ���� / ���
		System.out.println("������ ������ �����(���� / ���� / ���) ");
		String weather = sc.nextLine();
		// System.out.println(weather);
		// ���� �޴��� ��õ���ִ� ���α׷�
		// ����� �Է��ߴٸ� ���õ���� ����� ����
		
		// ����ڰ� �Է��� ���� "���"�̶�� ���ڿ����� ������ؼ� ��ġ�ϴ��� ��
		// weather ����� "���"
		// System.out.println(weather == "���");
		// ���ڿ��� ��
		// ����񱳿�����(==)�� ����� �� ����
		// .equals()�� ȣ���ؾ���
		// System.out.println(weather.equals("���"));
		//if (weather == equals("���")) {
		
		
		// ����
		// ���࿡ ����ڰ� �Է��� ���ڿ�		�� "���"��	��ġ�Ѵٸ�
		// if		weather				"���"	.equals()
		// ���õ��
		
		if(weather.equals("���")) {
			System.out.println("���õ������ ��������ĵ弼��~");
		}
		
		// ���࿡ ����ڰ� �Է��� ���ڿ��� "����"�� ��ġ�Ѵٸ�
		
		if(weather.equals("����")) {
			System.out.println("����Ϲ������� �ø�� �弼��~");
		}
		
		// ���࿡ ����ڰ� �Է��� ���ڿ��� "����"�� ��ġ�Ѵٸ�
		
		if(weather.equals("����")) {
			System.out.println("������̰��� �ƹ��ų� �弼��~");
		}
	}
	
	public void method3() {
		
		// ����ڿ��� �������� �Է¹޾Ƽ� Ȧ / ¦�� �Ǻ� = > ����
		// if���� �̿��ؼ� ���!
		// ��, �Է¹��� ������ 0���� Ŭ ��쿡�� ���ǹ��� ����!
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		
		// if
		
		// ���ǽ�
		//
		// �񱳿���
		// 1. �Է¹��� ������ 0���� Ŭ��쿡��
		//		number > 0
		// 2. Ȧ/¦
		//		�Է¹��� ������ 2�� ���� �������� 0�� ������ؼ�
		//		number  % 	2 	==		0 ¦��(true �� ��)
		//		!number %	2	==		0 Ȧ��(true �� ��)
		int num = sc.nextInt();
		
		boolean flag = num > 0;
		
		if(flag && num % 2 == 0) {System.out.println("¦��"); }
		if(flag && num % 2 == 0) System.out.println("Ȧ��");
		
		// if�� ��ø
		if(num > 0) {
			if(num % 2 == 0) System.out.println("¦��");
			if(num % 2 == 1) System.out.println("Ȧ��");
		}
		if (num > 0 && num % 2 == 0) {
			System.out.println('¦');
		}
			
		if (num > 0 && num % 2 == 1) {
			System.out.println('Ȧ');
		}
		
		else {
			System.out.println("0���� ū ������ �Է����ּ���");
		}
		
	}
	
	public void method4() {
		
		// 1. �޴��� �����ֱ�
		// ��¹� == System.out.println()
		
		System.out.println("���� �޴���");
		System.out.println("1. ����(5000)");
		System.out.println("2. ����(4000)");
		System.out.println("�޴� ��ȣ�� �������ּ���");
		// 2. �޴���ȣ�� �޴� �Է¹ޱ�
		// Scanner ����ؼ� nextInt()
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// 3. ���� �Է¹ޱ�
		// Scanner ����ؼ� nextInt()
		System.out.println("������ �����ּ���");
		int quantity = sc.nextInt();
		
		// 4. ���ǹ�
		// if���� �̿��ؼ� �Է��� �޴���ȣ�� ���� �޴��� �����ϱ�
		// Ȥ�� ���� �޴� ��ȣ�� �Է��ߴٸ� ���� �޴���� �����ϱ�
		
		String numName = "";
		if(num == 1) numName = "����";
		if(num == 2) numName = "����";
		if(!(num == 1) && !(num == 2)) numName = "���� �޴�";
		
		
		if (num == 1) {
			System.out.println("1. ����(5000)");
		}
		if (num == 2) {
			System.out.println("2. ����(4000)");
		}
		
		else {
			System.out.println("���� �޴��Դϴ�.");
		}
		// 5. XXXX�޴��� XXX�� �ֹ��ϼ̽��ϴ�. ������ֱ� print()
		System.out.println("--------------�ֹ�����-----------------");
		System.out.println(num + "�� �޴��� " + quantity + "�� �ֹ��ϼ̽��ϴ�" );
		
		// 6. ��¥ �ֹ��Ұ��� �����
		// Y / N �Է� �޾Ƽ� Ȯ���ϱ�
		
		System.out.println("��¥ �ֹ��Ͻǰǰ���? (Y/N) ");
		sc.nextLine();
		char answer = sc.nextLine().charAt(0);
		System.out.println(answer);
		// 7. 6������ �Է¹��� ���� ���ڰ� 'Y' �Ǵ� 'y'�� ��ġ�Ѵٸ�
		// �޴���� ������ ���� ����ϱ� if�� + ��ø if�� + ��¹�
				

		if((answer) == 'Y' || (answer =='y')) {
			int price = 0;
			if(num == 1) price = 5000;
			if(num == 2) price = 4000;
			
			System.out.println("�� �����ݾ��� " + (price * quantity) +"���Դϴ�");
		}
				
		
		

	}
}