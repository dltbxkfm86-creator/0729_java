package com.kh.controller;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.run.Run;

public class StringController {
	
	// String Ŭ���� => �Һ�(������ ������ �ǹ�)
	
	/*
	 * String Ŭ���� �����
	 * 
	 * 1. new �����ڸ� ����ؼ� StringŬ������ �����ڸ� ȣ���ϴ� ��� 
	 * 2. ���Կ����ڸ� �̿��ؼ� ���ڿ� ���ͷ����� �����ϴ� ���
	 * 
	 */
	
	// �����ڸ� ȣ���ؼ� ���ڿ� ��ü�� �����ϴ� ���
	public void method1() {
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		Run run = new Run();
		// String str3 = "hello";
		
		System.out.println(str1.toString());
		System.out.println(str2);
		System.out.println(run.toString());
		// 1. String Ŭ������ toString()�� ���
		// ���� ����ִ� ���ڿ� ���ͷ� value���� ��ȯ�ϰԲ� �������̵�
		
		Run run2 = new Run();
		System.out.println(run.equals(run2));
		
		// equals()
		System.out.println(str1.equals(str2));
		// true 
		// �ּҰ� �񱳴� �����̰� ���ڿ� ���� ���ϵ��� �������̵�
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println("hello".hashCode());
		// 3. StringŬ������ hashCode()
		// �ּҰ��� �ؽ��ϴ� ���� �ƴ϶� ���� ��� ���ڿ����� ������� �ؽ��ڵ� ���� ���鵵�� �������̵�
		
		
		// ��¥ �� ������ �������� �ĺ��� �� �ִ� ���� �˾Ƴ��� ��
		// System.identityHashCode(������ ����)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
	}
	
	
	// ���ڿ� ���ͷ� ���� ���
	public void method2() {
		
		String str1 = "hello";
		String str2 = "hello";
		
		// toString()
		System.out.println(str1);
		System.out.println(str2);
		
		// equals()
		System.out.println(str1.equals(str2));
		
		// hashCode()
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// System.identityHashCode()
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println(str1 == str2);
	}
	
	// String (Constant) Pool ��� Ǯ
	public void method3() {
		
		String exam = new String("hello");
		String str = "hello";
		
		// ���ڿ� ���ͷ��� ���� �����ڸ� ����� ������ ��
		// String Contant Pool������ ��ϵ�
		// Ư : ������ ������ ���ڿ� ���ͷ��� ������ �� ����
		
		System.out.println(System.identityHashCode(str));
		
		str = "bye";
		System.out.println(System.identityHashCode(str));
		
		str += "!!";
		System.out.println(System.identityHashCode(str));
		
		String a = "a";
		String b = "a";
		
		System.out.println("��� : " + a == b );
		// false
		System.out.println("��� : " + (a == b) );
		// true
		
	}
	
	public void method4() {
		//Arrays.toString(new int[2]);
		
		// StringBuffer
		// Buffer == �ӽ��������
		// ���ڿ��� �Һ���ü�� ���빰�� ���� �� �� ���� ���ο� ������ �Ҵ��ؼ� ����ִ´�
		// �̸� �ذ��ϱ� ���ؼ� �ӽð���(Buffer)�� �غ��ؼ�
		// �ӽð����� �������� ��Ҵٰ� �ѹ��� ó�����ִ� Ŭ����
		
		StringBuffer sb = new StringBuffer();
		
		// System.out.println("Hello" + "Buffer");
		sb.append("hello ");
		sb.append("World");
		// ���ڿ������� ���ϱ�� �޸� ���� ����
		System.out.println(sb);
		
		// StringBuilder
		StringBuilder sr = new StringBuilder();
		sr.append("Hello ");
		sr.append("World");
		System.out.println(sr);
		
		// ����������(Thread-Safe)��
		// �ܺο��� ������ ���� �ǰ� �ֱ� ������
		// �浿ȯ���� �ƴ϶�� ���� ������ �ʿ䰡 ����
		
		
	}
	
	
	// ���ڿ��� ���õ� �޼ҵ��
	
	public void StringMethod() {
		
		String str1 = "��Ƿ������� ��ī����";
		
		// 1.���ڿ�.length() : int
		// ���ڿ��� ���̸� ��ȯ
		System.out.println("str1�� ���� : " + str1.length());
		
		// 2. ���ڿ�.charAt(int index) : char
		char ch = str1.charAt(3);
		System.out.println("�� : " + ch);
		
		String phoneNumber = "010-1234-5678";
		// 3. ���ڿ�.substring(int beginindex) : String
		// => ���ڿ��� beginindex��ġ���� ���ڿ� �������� ���ڿ��� �����ؼ� ��ȯ
		System.out.println(phoneNumber.substring(4));
		System.out.println(phoneNumber.substring(4, 8));
		
		// 4. ���ڿ�.indexOf(str) : int
		System.out.println(str1.indexOf("��"));
		
		String[] emails = {"hong@kh.com", "kim@kh.com", "hitel@kh.com", "hhaahhoo@kh.com"};
		
		for(int i = 0; i < emails.length; i++) {
			System.out.println(emails[i].substring(0,emails[i].indexOf("@")));
		}
		
		// 5. ���ڿ�.toCharArray() : char[]
		// ���ڿ��� �� ���ڵ��� char[]�� ��ȯ���ִ� �޼ҵ�
		char[] chArr = emails[0].toCharArray();
		for(int i = 0; i< chArr.length; i++) {
			System.out.println(chArr[i]);
		}
		
		for(char c : chArr) {
			System.out.println(c);
		}
		new String(chArr).chars().mapToObj(c -> (char)c).forEach(System.out::println);
		
		// char[] -> String
		System.out.println(String.valueOf(chArr));
		
		
		// 6. ���ڿ�.replace(char old, char new) : String
		System.out.println(emails[0].replace("kh", "naver"));
		
		String str3 = "             java                 ";
		
		// 7.���ڿ�.trim() : String
		System.out.println(str3.trim());
		
		// 8.���ڿ�.toUpperCase() : String -> �ϴ� �빮�ڷ� �ٲٱ�
		//	 ���ڿ�.toLowerCase() : String -> �ϴ� �ҹ��ڷ� �ٲٱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Ͻðھ��(Y/N)");
		String answer = sc.nextLine();//.toUpperCase()
		// String upperAnswer = answer.toUpperCase();
		if(answer.toUpperCase().equals("Y") || answer.equals("y")) {
			System.out.println("�� ������ �ؾ߰ڴ� ���� �� ����");
		}
	}
	
	public void split() {
		
		// ���ڿ� �и���Ű��
		String str = "����Ŀ�,������,�ϱ�Ⱦ��,��ſ���";
		
		// ���ڿ�.split(String ������) : String[]
		
		String[] arr = str.split(",");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		// ���� for��
		for(String s : arr) {
			System.out.println(s);
		}
		// �ʱ��, ���ǽ�, ������ �Ⱦ�
		// for(���� �޾��� ���� ���� : ���������� ��ҿ� ������ �迭 || �÷���) { }
		// �迭�� ��Ҹ� ������ �� ����, index�� ���� ������ �� ����
		
		// java.util.StringTokenizer Ŭ������ �̿��ϴ� ���
		
		StringTokenizer stn = new StringTokenizer(str , ",");
		// System.out.println(stn);
		System.out.println("��ũ�������� �̾ƾ���");
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		StringTokenizer stn1 = new StringTokenizer(str)
		
		while(stn1.hasMoreElements()) {
			// �����ִ� ��ū�� �ִٸ� true / ��ū�� ���ٸ� false
			System.out.println(stn1.nextToken());
		}

	}
		
		
	
	
	
	
	
	
	
}
