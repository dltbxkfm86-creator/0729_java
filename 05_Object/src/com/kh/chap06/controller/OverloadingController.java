package com.kh.chap06.controller;

public class OverloadingController {
	/*
	 * �޼ҵ� �����ε�(Method Overloading) �١ڡ� => ���� �ܰ� ����
	 * 
	 * - �ϳ��� Ŭ���� �ȿ� ������ �޼ҵ� �ĺ��ڷ� ���� ���� �޼ҵ���� ������ �� �ִ� ���!
	 * - �Ű����� �ڷ����� ����, ����, ������ �ٸ��� �ۼ��ؾ� ��
	 * - ����� �Ű����� �ĺ���, ����������, ��ȯŸ���� �޼ҵ� �����ε��� �ƹ��� ������ ��ġ�� ����
	 * 
	 */
	
	// �޼ҵ���� test�� ����
	public void test() {
		System.out.println("�޼ҵ� �����ε� �׽�Ʈ 1");
	}
	
	public void test(int num) {
		System.out.println("�޼ҵ� �����ε� �׽�Ʈ 2");
	}
	
	public void test(String str) {
		System.out.println("�޼ҵ� �����ε� �׽�Ʈ 3");
		test(1,2);
	}
	
	public void test(int a, int b) {
		System.out.println("�޼ҵ� �����ε� �׽�Ʈ 4");
	}
	
	/*
	public void test(int c, int d) {
		
		
	}
	
	�Ű����� �ĺ��ڿʹ� �������
	�ڷ����� ����, ������ �����ϱ� ������ ������ �Ұ�����
	*/
	
	/*
	public String test(int c, int d) {
		
	}
	��ȯ���� ������� �Ű������� ������ ������ �׻� �ٸ��� �ۼ��ؾ� ��
	
	*/
	/*
	private void test(int c, int d) {
		
	}
	���������ڿʹ� ������� �Ű������� ������ ������ �׻� �ٸ��� �ۼ��ؾ� ��
	*/
	
	public void test(int a, String b) {
		
	}
	
	public void test(String b, int a) {
		
	}
}
