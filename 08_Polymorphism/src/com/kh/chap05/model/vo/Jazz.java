package com.kh.chap05.model.vo;

public class Jazz extends Music implements MusicI {

	@Override
	public void play() {
		System.out.println("��� ����մϴ�");
	}
	
	@Override
	public void stop() {
		System.out.println("������ ����ϴ�");
	}
}
