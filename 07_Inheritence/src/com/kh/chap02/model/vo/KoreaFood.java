package com.kh.chap02.model.vo;

//			�θ�Ŭ����				�ڽ�Ŭ����
//			����Ŭ����				����Ŭ����
//			����Ŭ����				����Ŭ����
//			����Ŭ����				�ļ�Ŭ����
//			Ȯ��Ŭ����				�Ļ�Ŭ����
public class KoreaFood extends Food {
	// �ʵ��
	// foodName, material, cookingTime, spicy
	// [	Food Ŭ������ ������ ����	]
	private int spicy;
	
	// �����ں�
	public KoreaFood() {
		super(); // super : �θ�ü�� �ּҰ��� �ǹ��ϴ� Ű����
		System.out.println("���� �� �ڽ�");
		
	}
	
	// �޼ҵ��
	
	public int getSpicy() {
		return spicy;
	}
	public void setSpicy(int spicy) {
		this.spicy = spicy;
	}
	
}
