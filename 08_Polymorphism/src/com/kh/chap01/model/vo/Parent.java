package com.kh.chap01.model.vo;

public class Parent {
	// �ʵ��
	private int x;
	private int y;
	
	// �����ں�
	public Parent() { }
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// �޼ҵ��
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY() {
		this.y = y;
	}
	
	public void printParent() {
		System.out.println("�ȳ� ���� �θ�Ŭ������~");
	}
	
	public void print() {
		System.out.println("���� �θ�");
	}
}
