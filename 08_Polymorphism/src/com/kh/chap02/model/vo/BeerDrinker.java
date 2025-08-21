package com.kh.chap02.model.vo;

public class BeerDrinker extends Drinker {
	
	private boolean gout;
	
	public BeerDrinker() {}
	public BeerDrinker(boolean gout) {
		this.gout = gout;
	}
	
	public void setGout(boolean gout) {
		this.gout = gout;
	}
	
	public boolean isGout() {
		return gout;
	}
	
	@Override
	public void drink() {
		System.out.println("���� �� ���� ���ʴϴ�");
	}
	
	@Override
	public void eat() {
		System.out.println("ġŲ�� �� �� �Խ��ϴ�");
	}
	
}
