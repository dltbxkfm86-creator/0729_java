package com.kh.chap06.controller;

public class MethodController {
			/* �ڷ��� */
	
	/*
	 * �޼ҵ�(Method) == ��� �Լ� : �Է°��� ������ Ư�������� ������ �� ������� ������
	 * 
	 * ���α׷��� ������ �Լ� : Ư�� �۾��� �����ϱ� ���ؼ� ������� �ڵ� ���
	 * 
	 * 1. ���뼺
	 * 2. ���ȭ
	 * 
	 * ��ü���� ���α׷��ֿ����� �޼ҵ�� : ��ü�� ������ �� �ִ� �ൿ�� ������ �ڵ� ���
	 * 
	 * Ư�� �ڷ��������� ����� ������ �Լ�
	 * 
	 * [ ǥ���� ]
	 * 
	 * ���������� ���Ǿ� ��ȯ�� �޼ҵ�ĺ���(�Ű��������ڷ��� �Ű������ĺ���) {
	 * 
	 * 			������ �ڵ�;
	 * 
	 * 			return ��ȯ��;
	 * }
	 * 
	 * ���� ������ �� : �����, �Ű�����, return��(void�� ���)
	 * ��ȯ�� : return��ȯ�� ���� �ڷ���
	 * ȣ���� �� �޼ҵ� ���� ���ڰ� = > �Ű������� �ڷ����� ������ ��Ȯ�ϰ�!! ��ġ�ؾ���
	 * 
	 * �� �� �����صθ� �ʿ��� ���� ������ ȣ���� ����
	 * 
	 * 
	 * 
	 */
	
	// ���ϱ⸦ �ؼ� ����� ��ȯ���ִ� �ڵ� ���� ����� �ʹ�
	public int add(int a, int b) { // �޼ҵ� �ñ״�ó
		int sum = a + b;// �޼ҵ� �ٵ�
		return sum;
	}
	
	// 1. �Ű������� �������� �ʰ� ��ȯ���� �������� �ʴ� �޼ҵ�
	
	public void method1() {
		
		System.out.println("�Ű������� ��ȯ���� �� �� �������� �ʽ��ϴ�." );
		
		// return;
		// returnType�� void�� ��� return���� ���� �� �� �ִ�.
	}
	
	// 2. �Ű������� �������� ������ ��ȯ���� �����ϴ� �޼ҵ�
	public String method2() {
		System.out.println("�Ű������� �������� ������ ��ȯ���� �����մϴ�");
		
		return "returnValue";
	}
	
	public String method3() {
		return method2();
	}
	
	public void println(String parameter) {
		System.out.println(parameter);
	}
	
	// 3. �Ű������� ���������� ��ȯ���� �������� �ʴ� �޼ҵ�
//	public void setName(String name) {
//		this.name = name;
//	}
//	
	public void method4(int num) {
		System.out.println("�Ű������� �����ϰ� ��ȯ���� �������� �ʽ��ϴ�");
		System.out.println("���޹��� �� + 100" + (num + 100));
	}
	
	// 4. �Ű������� �����ϰ� ��ȯ���� �����ϴ� �޼ҵ�
	public int method5(int num) {
		System.out.println("�Ű������� ��ȯ���� ����");
		return num + 50;
	}
	
	public void a() {
		System.out.println("�޼ҵ� aȣ��!");
		b();
	}
	
	public void b() {
		System.out.println("�޼ҵ� bȣ��!");
		a();
	}
	
	public void test(MethodController mc) {
		mc.method1();
	}
	
	public static void staticMethod() {
		System.out.println("�ȳ� ���� ����ƽ �޼ҵ���");
	}
}
