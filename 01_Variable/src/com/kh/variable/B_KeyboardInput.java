package com.kh.variable;

//1��. import���� �ۼ��ؼ� � ��Ű���� �����ϴ� Ŭ������ ����� ������ ����!
import java.util.Scanner;

public class B_KeyboardInput {
	public void inputTest() {
		
		/*
		 * Ű���带 �̿��ؼ� ����ڿ��� ���� �Է¹��� ����
		 * �ڹٿ��� �������ִ� Scanner��� Ŭ������ �����
		 * Scanner Ŭ������ �����ϰ� �ִ� �޼ҵ���� ȣ���ؼ� �Է��� ���� �� ����
		 */	
		// 2��. Ŭ������ ��Ī�� �����ָ鼭 new(����)�� ����
		Scanner sc = new Scanner(System.in);
		// System.in : ǥ�� �Է� �������� �Է¹��� ������ �ްڴ�. (����Ʈ ����)
		
		// �����ķ��̽�
		// ����ڿ��� �ֹ��� ���Ḧ �Է¹޾Ƽ� ����ϱ�
		
		// �Է¹ް��� �ϴ� ������ �˷��ְų� ���� ������ �ؼ� �Է��� ����
		System.out.println("====== �޴��� ======");
		System.out.println("�ѱ��� ���������� ����ÿ");
		System.out.println("KH���������� A�����忡�� ���� �����");
		System.out.println("��");
		System.out.println("");
		System.out.println("====== �޴��� ======");
		System.out.println("�ֹ��Ͻ� �޴��� �Է����ּ���");
		
		//next() : ����ڰ� �Է��� �� �� ������ ���� ��� ���鹮�� ���������� �Է¹���
		String menu = sc.next();
		
		// ����ڰ� �Է��� �޴��� ����ϱ�
		// "���� �ֹ��ϼ̽��ϴ�."
		System.out.println(menu + "��(��) �ֹ��ϼ̽��ϴ�.");
		// �� ��
		System.out.println("�� �� �ֹ��Ͻðڽ��ϱ�?(���ڷ� �Է����ּ���)");
		// nextInt() : ������ �Է� ���� ����
		// nextDouble() : �Ǽ��� �Է� ���� ����
		int quantity = sc.nextInt();
		System.out.println(menu + "�� " + quantity + "�� �ֹ��ϼ̽��ϴ�.");
		
		System.out.println("�ּ����� �Է����ּ��� ");
		// nextLine() : ����ڰ� �Է��� ���� ����� �����ϰ�
		//				���๮�� �������� ��ü�� �� �о��
		// nextLine() : �Է¹��ۿ��� ���๮�� ���������� ��� ���� ������ ��
		//				�Է¹��ۿ� �����ϴ� "���๮��"�� ������
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println(menu + "�� " + quantity + "����" + address + "�� ����մϴ�.");
		
	}
	
	
}
