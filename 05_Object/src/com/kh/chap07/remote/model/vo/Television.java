package com.kh.chap07.remote.model.vo;

// �ʿ��� ������ �����ϴ� ����

public class Television {
	
	private boolean on;
	private String[] channel;
	
	public Television() {
		channel = new String[5];
		channel[0] = "���ѹα� 24����ä��";
		channel[1] = "�ôϾ���ũ��";
		channel[2] = "��Ʃ���K";
		channel[3] = "EBS ����б� 2����";
		channel[4] = "�ٷ���TV";
		
	}
	//getter
	
	public String[] getChannel() {
		return channel;
	}
	
	public String[] channelUp() {
		return channel;
	}
	
	//getter
	
	public boolean isOn() {
		return on;
	}
	//setter
	
	public void setOn(boolean on) {
		this.on = on;
	}

}
