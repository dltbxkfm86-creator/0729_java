package com.kh.chap03.model.vo;

public class Coffee {
	
	// ��ǰ��, ����, ����, ũ��
	
	// �ʵ��
	private String name;
	private String bean;
	private String size;
	private int price;
	
	// �����ں�
	
	// �޼ҵ�� getter / setter / info
	
	// �ʵ尪�� ��ȯ���ִ� �޼ҵ� == getter
	public String getName() {
		return name;
	}
	
	public String getBean() {
		return bean; // Coffee == �Ṱ
	}
	
	public String getSize() {
		return size;
	}
	
	public int getPrice() {
		return price;
	}
	
	// �ʵ尪�� ���� ���ִ� �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBean(String bean) {
		this.bean = bean;
	}
	
	public void setSzie(String size) {
		this.size = size;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// info()
	public String info() {
		String info = "��ǰ�� : " + name
					+ " ���� : " + bean
					+ " ������ : " + size
					+ ", ���� : " + price;
		return info;
	}
}
