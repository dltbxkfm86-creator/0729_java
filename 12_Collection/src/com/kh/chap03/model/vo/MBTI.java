package com.kh.chap03.model.vo;

import java.util.Objects;

public class MBTI {

	private String introversingExtroversion;
	private String sensingNtuiton;
	private String thinkingFeeling;
	private String judgingPerceiving;
	
	public MBTI() {
		super();
	}

	


	public String getIntroversingExtroversion() {
		return introversingExtroversion;
	}

	public MBTI(String introversingExtroversion, String sensingNtuiton, String thinkingFeeling,
			String judgingPerceiving) {
		super();
		this.introversingExtroversion = introversingExtroversion;
		this.sensingNtuiton = sensingNtuiton;
		this.thinkingFeeling = thinkingFeeling;
		this.judgingPerceiving = judgingPerceiving;
	}




	public void setIntroversingExtroversion(String introversingExtroversion) {
		this.introversingExtroversion = introversingExtroversion;
	}

	public String getSensingNtuiton() {
		return sensingNtuiton;
	}

	public void setSensingNtuiton(String sensingNtuiton) {
		this.sensingNtuiton = sensingNtuiton;
	}

	public String getThinkingFeeling() {
		return thinkingFeeling;
	}

	public void setThinkingFeeling(String thinkingFeeling) {
		this.thinkingFeeling = thinkingFeeling;
	}

	public String getJudgingPerceiving() {
		return judgingPerceiving;
	}

	public void setJudgingPerceiving(String judgingPerceiving) {
		this.judgingPerceiving = judgingPerceiving;
	}

	@Override
	public String toString() {
		return "MBTI [introversingExtroversion=" + introversingExtroversion + ", sensingNtuiton=" + sensingNtuiton
				+ ", thinkingFeeling=" + thinkingFeeling + ", judgingPerceiving=" + judgingPerceiving + "]";
	}
	
	// ��������� �츮�� �ؾ��� ��
	// �ʵ��� ���� �����ϴٸ�
	// equals() �� hashCode()�� �������̵��ؼ� ������ ������� ��µǵ��� �����ؾ���
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MBTI other = (MBTI) obj;
		return Objects.equals(introversingExtroversion, other.introversingExtroversion)
				&& Objects.equals(judgingPerceiving, other.judgingPerceiving)
				&& Objects.equals(sensingNtuiton, other.sensingNtuiton)
				&& Objects.equals(thinkingFeeling, other.thinkingFeeling);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(introversingExtroversion, judgingPerceiving, sensingNtuiton, thinkingFeeling);
	}
	
	
	
}
