package com.kh.run;

public class WrapperRun {

	public static void main(String[] args) {
		
		/*
		 * Wrapper Class
		 * => �⺻�ڷ����� �����ڷ������� �������ִ� Ŭ�������� ����Ŭ������� ��
		 * 
		 * �⺻ �ڷ���									Wrapper Class
		 * 					<---------------->
		 * boolean									Booelean
		 * char 									character
		 * byte										Byte
		 * short									Short
		 * int										integer
		 * long										Long
		 * float									Float
		 * double									Double 
		 */
		
		// �⺻�ڷ����� ��ü�� ����ؾ� �ϴ� ���
		// �޼ҵ� �Ű����� �ڷ����� �⺻�ڷ����� �ƴ� �����ڷ����� ��� ������ ���
		// �������� �����ؾߵ�
		
		int num1 = 10;
		int num2 = 15;
		
		// Object.equals()
//		Integer i1 = new Integer(num1);
//		System.out.println(i1);
		
		// �⺻�ڷ��� => Wrapper�� ����
		Integer i1 = num1;
		Integer i2 = num2;
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		// a.compareTo(b)
		// a�� b���� ũ�� 1�� ��ȯ
		// a�� b���� ������ -1�� ��ȯ
		// ������ 0��ȯ
		
		// "123", "1.1"
		String str1 = "10";
		String str2 = "1.1";
		
		System.out.println(str1 + str2);
		
		// �Ľ�(parsing) == Ư�� �����͸� ��Ģ�� ���� �м��ϰ� �ؼ��ϴ� ����
		
		int i =Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		// �ش� WrapperŬ�����̸�.parseXXX(������);
		
		System.out.println((double)i + d);
		
		String strInteger = String.valueOf(i);
		System.out.println(strInteger);
	}

}
