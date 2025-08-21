package com.kh.chap02.model.vo;
/*
 * ���(Inheritence)
 * 
 * ������ Ŭ������ �̿��ؼ� ���ο� Ŭ������ ����� ��� == ���
 * 
 * �� Ŭ�������� �ߺ��� �ʵ�, �޼ҵ���� �ϳ��� Ŭ������
 * �����ص� �� �ش� Ŭ������ ����� ������ ����ϴ� ����
 * 
 */
public class Food {
	// ���������� ������ �ִ� �ʵ�
	// �ʵ�� : foodName, meterial, cookingTime
	private String foodName;
	private String material;
	private int cookingTime;
	
	// �����ں�
	public Food() {
		
		System.out.println("�ȳ��ϼ��� �θ��Դϴ�");
	}
	
	public Food(String foodName, String material, int cookingTime) {
		this.foodName = foodName;
		this.material = material;
		this.cookingTime = cookingTime;
	}
	
	// �޼ҵ��
	
	public String getFoodName() {
		return foodName;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public int getCookingTime() {
		return cookingTime;
	}
	
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	public void setCookingTime(int cookingTime) {
		this.cookingTime = cookingTime;
	}
	
	public String information() {
		return "���ĸ� : " + foodName + ", ����� : " + material
				+ ", �����ð� : " + cookingTime;
	}
}
