package com.kh.operator;

public class A_Arithmetic {
	
	// ���������  - > ���׿�����, �켱���� ����
	// + : ����
	// - : ����
	// * : ����
	// / : ������
	// % : ����(Modular) => ������������ �������� ����
	
	public void method() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		
		test();
		System.out.println("num1 + num2 :" + (num1 +num2));
						// 1�ܰ� "num1 + num2 : 10"
						// 2�ܰ� "num1 + num2 : 103"
		// ������� "num1 + num2 : 103"
		// ���� �켱������ �����ϰ� �ʹٸ� ()�� �̿��ؼ� �����־���� �ǵ��� �����
		// ����� �� ����
		
		int sum = num1 + num2;
		System.out.println("�� ���� �հ� : " + sum);
		System.out.printf("num1 + num2 : %d\n", num1 + num2);
		System.out.println("num1 - num2 : " + (num1 - num2));
							// 1�ܰ� : "num1 - num2 : 10
		// ������ ��� ��ȣ�� �������� ������
		// ���ڿ��� num1�� �ϳ��� ��ģ �� ������ ���� ������ ������ �Ұ�����! 
		
		System.out.println("num1 X num2 : " + (num1 * num2));
		
		// *, /, % �� �켱������ +,- ���� ���� ������ ������ �ʴ���
		// ���� ������ �����ؼ� ����� ���� �� ����
		// ������ ����� ���� ��ȣ�� ����ϴ� ���� ����
		System.out.println("num1 / num 2 : " + (num1 / num2));
		System.out.println("num1 mod num2 : " + (num1 % num2));
		
		// ����
		
		System.out.println(10 / 0);
	}
	
	private void test() {
		System.out.println("�� ���θ޼��忡�� ȣ���ؾ� �ϴ� ���� �ƴ�");
		
	}
	
	// ���� ���� ���ϱ� ���α׷��� �����Ͻÿ�.
	
	// �޼ҵ� : presentToStudent() < == �޼ҵ� ����
	
	// ����ڿ��� ���� �Է� < == Scanner
	// 1. ������ �л��� �� < == nextInt();
	// 2. ���� ����		< == nextInt();
	
	// 1�δ� ���� �� �ִ� ������ ���� : ���� ���� / �л��� ��
	// ���� ������ ���� : ���� ���� % �л��� �� <== ���������
	
	// �������
	// �л� �� ��� ���� �� �ִ� ������ ���� : x�� <== ��¹�
	// ���� ���� ���� : X��					< == ��¹�
}










