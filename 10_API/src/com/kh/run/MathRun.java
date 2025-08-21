package com.kh.run;

// import java.lang.*;
// ����


public class MathRun extends Object{

	public static void main(String[] args) {
		
		// java API (Application programming interface)
		
		// Math Ŭ���� (����)
		
		// Math math = new  Math();
		/*
		 * - ��� �ʵ�� �޼ҵ尡 ���� �� static
		 * - ��ü�� ������ �ʿ䰡 �����Ƿ� �⺻�������� ���ٻ����ڰ� private
		 * - java.lang
		 * 
		 * 
		 * 
		 */
		
		// �ʵ�
		// ���� => MathŬ���� ���� ����ʵ�� ���ǵǾ�����
		System.out.println(Math.PI);
		
		// �޼ҵ�
		// 1. ���� => Math.pow()
		System.out.println("2�� 10���� : " + Math.pow(3,13));
		
		// 2. ���밪 => Math.abs(int, double, long, float)
		System.out.println("���밪 : " + Math.abs(-33));
		
		double num = 8.141414;
		
		// 1. �ø� => Math.ceil(double) : double
		System.out.println("�ø� : " + Math.ceil(num));
		
		// 2. ���� => Math.floor(double) : double
		System.out.println("���� : " + Math.floor(num));
		
		// 3. �ݿø� => Math.round(double) : long
		System.out.println("�ݿø� : " + Math.round(num));
		
		
		
		
		
		
		
	}

}
