package com.kh.chap01.run;

import com.kh.chap01.model.vo.*;


public class Run {

	public static void main(String[] args) {
		//foodName, material, cookingTime, spicy
		koreaFood kf = new koreaFood("�����", "��", 5, 2);
		//foodName, material, cookingTime, oil		
		ItalyFood yf = new ItalyFood("�⸧�Ľ�Ÿ", "�⸧", 15, 5);
		//foodName, material, cookingTime, fresh
		JapanFood jf = new JapanFood("����", "��", 10, 10);
		
		System.out.println(kf.information());
		System.out.println(yf.information());
		System.out.println(jf.information());

		
		/*
		 * �� Ŭ�������� �ߺ��� �ڵ���� �ϳ��ϳ� ����ϴٺ���
		 * �ڵ��� �߰� �Ǵ� ������ ���� �������� �� ���� �Ѷ��Ѷ� ã�Ƽ� ���ľ��ϴ� ���ŷ����� ����\
		 * 
		 * ����̶�� ������ �����ؼ�
		 * �� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ���� 
		 * �� �ϳ��� Ŭ����(�θ�Ŭ����)�� ����� ����, ���Ǹ� �صΰ�
		 * �ش� �θ�Ŭ������ ������ �ִ� ��Ҹ� ��ӹ޾Ƽ� ����ϴ� ���·� ����
		 * 
		 */
	}
	
}
