package com.kh.chap02.run;

import com.kh.chap02.model.vo.ItalyFood;
import com.kh.chap02.model.vo.JapanFood;
import com.kh.chap02.model.vo.KoreaFood;

public class Run {
	
	public static void main(String[] args) {
		
		KoreaFood kf = new KoreaFood();
		kf.setFoodName("�����");
		System.out.println(kf.getFoodName());
		
		// ȣ���� �ϴ� �޼ҵ尡 �ش� Ŭ������ �������� �ʴ´ٸ�
		// �ڵ����� �ش� Ŭ������ �θ�Ŭ������ �ִ� �޼ҵ带 ȣ��
		
		ItalyFood yf = new ItalyFood("�⸧�Ľ�Ÿ", "�⸧", 15, 5);
		System.out.println(yf.information());
		
		JapanFood jf = new JapanFood("����", "��", 20, 5);
		System.out.println(jf.information());
		
		// �ڽ�Ŭ������ �޼ҵ带 ������ ���� ���
		// �ڽ�Ŭ������ �����ϴ� �޼ҵ尡 �켱���� ������ ȣ���! �١ڡ١ڡ١ڡ١ڡ١ڡ١�
		
		/*
		 * ���
		 * 
		 * - �ߺ��� �ڵ带 �������� ����
		 * => ���� �������� �ڵ�� ���ο� Ŭ������ ���� �� ����
		 * 
		 * => ���꼺 ���, ������ ���,
		 * 
		 * ��ü���� ���յ��� ������
		 * 
		 * - Ŭ�������� ���߻���� �Ұ����ϴ�(���� ��Ӹ� ����)
		 * 
		 * - ��õǾ� ���� ������ ��� Ŭ������ objectŬ������ �ļ� Ŭ����
		 * 	(���� ���� Ŭ����, �ڹٿ��� ���� �����ϴ� Ŭ����)
		 * 
		 * => ObjectŬ������ �ִ� ����� ����� �� ����
		 * => ObjectŬ������ �ִ� �޼ҵ尡 ������ �� �糪�� ������ �� �� ����
		 */
	}
}
