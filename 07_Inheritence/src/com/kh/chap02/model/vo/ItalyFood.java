package com.kh.chap02.model.vo;

public class ItalyFood extends Food {
	
	// �ʵ��
	private int oil;
	
	// �����ں�
	public ItalyFood() {
		super(); // ��������
	}
	public ItalyFood(String foodName, String material, int cookingTime, int oil) {
		
		// this.foodName = foodName;
		// super.foodName = foodName;
		// ���������ڰ� private�̱� ������ �Ⱥ���
		// �ذ� ���
		// 1. �θ�Ŭ������ ���������ڸ� �ٲ����
		// ĸ��ȭ ��Ģ X = > ������ ����� �ƴ�
		
		// 2. �θ�Ŭ������ ���������� public�� setter�޼ҵ带 ȣ��
		
		/*super.setFoodName(foodName);	
		super.setMaterial(material);
		super.setCookingTime(cookingTime);
		*/
		
		// 3. �θ�Ŭ������ ������ �ִ� �Ű����� �����ڸ� ȣ��
		super(foodName, material, cookingTime);
		this.oil = oil;
	}
	
	// �żҵ��
	public int getOil() {
		return oil;
	}
	public void setOild(int oil) {
		this.oil = oil;
	}
}
