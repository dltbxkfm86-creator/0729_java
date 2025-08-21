package com.kh.chap02.model.vo;

public class RiceWineDrinker extends Drinker {
	
	private int age;
	
	public RiceWineDrinker() {}
	public RiceWineDrinker(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void drink() {
		System.out.println("���Ÿ��� ���� ���ź�����");
	}
	
	@Override
	public void eat() {
		System.out.println("������ �弼��");
	}
}
