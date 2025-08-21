package com.kh.chap05.constructor.mode.vo;

public class Member {
	
	// �ʵ��
	// ���̵�, ��й�ȣ, �г���
	private String userId;
	private String userPwd;
	private String nickName;
	
	// [ �����ں� ]
	/*
	 * ������(Constructor) : ��ü�� �����ϴµ� ����ϴ� Ư���� ������ �޼ҵ�
	 * 
	 * [ ǥ���� ]
	 * ���������� Ŭ�����ĺ���(�Ű�����(��������)) {
	 * 		�ش� �����ڸ� ���ؼ� ��ü ���� �� �����ϰ����ϴ� �ڵ�;
	 * 
	 * }
	 * 
	 * �������� ����
	 * 
	 * -- ������� ���� : ��ü�� ������ �� � ���·� ������ �ؾ��ϴ°�
	 * -- �������� ���� : ��ü�� ó������ ��ȿ�� ���¸� �������� ����
	 * 
	 * �������� ����
	 * 
	 * 1. �Ű������� ���� ������ => �⺻������
	 * 2. �Ű������� �����ϴ� ������ => ��ü�� ������ ���ÿ� ��ȿ�ϰ� ����� ���ؼ�
	 * 
	 */
	
	//public Member() {
		// �⺻������(�Ű����� ����)
		// System.out.println("������");
		// �⺻�����ڴ� ��ü�� ������ �������� ȣ���ؼ� ���
		// �⺻�����ڴ� �����ص� ������ �߻����� ����
		// Ŭ���� ���ο� �����ڸ� �ϳ��� �ۼ����� ������ JVM�� �⺻�����ڸ� �ڵ����� �������
		// �⺻�����ڸ� �׻� �ۼ�����!!! �ڡڡڡڡڡ�
	//}

	// public member() <-- �޼ҵ��� �ν�
	
	// public void Member() <-- �޼ҵ��� �ν�
	
	public Member() {} // <-- �ִ� ������ �� �־�� ��
	
	// �Ű������� �����ϴ� ������
	public Member(String userId) {
		System.out.println("�Ű������� �� ���� ������");
	}
	
	public Member(String userId, String userPwd) {
		//System.out.println("�Ű������� �� ���� ������");
		//System.out.println("���޹��� ���̵� �� : " + userId);
		//System.out.println("���޹��� ��й�ȣ �� : " + userPwd);
		this.userId =userId;
		this.userPwd = userPwd;
	}
	
	public Member(String userId, String userPwd, String nickName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.nickName = nickName;
	}
	
	/*
	 * 1. �ݵ�� �������� �̸��� Ŭ������ �̸��� �����ϰ� �ۼ��ؾ� ��(��/�ҹ��� ����)
	 * 2. ��ȯ���� �����ؼ��� �ȵ�(�޼ҵ�� �Ǵ�)
	 * 3. �Ű����� �����ڸ� ��������� �ۼ��ϸ� �⺻�����ڸ� ��������� ����
	 * => �츮�� �� �⺻�����ڸ� ������ ������ �ۼ��ϴ� ������ �鿩�� ��
	 * 4. �����ڴ� ������ �̸����� ���� �� ������ ���������� �Ű������� �ߺ��Ǿ �ȵ� => ������ �����ε�
	 * 
	 */
	
	/*
	 * 2025 / 08 / 07
	 * ������ �ǽ� �� ����
	 * 
	 * ������ ����� �ξ��� �ټ� ���� VOŬ���� �� ���� Ŭ������
	 * ���� ��� ĸ��ȭ �� �����ڸ� �����Ͽ� �����Ͻÿ�
	 * 
	 * 1) ��� �ʵ��� ���������ڸ� private�� ����
	 * 2) �ʵ忡 ���������� ������ �� �ֵ��� getter / setter ����
	 * 3) ��� �ʵ��� ������ ���ļ� ���ڿ��� ���·� ��ȯ���ִ� info() ����
	 * 4) �⺻������ �� ��� �ʵ带 �Ű������� ������ �ִ� ������ ����
	 * 5) ������������ ����ϰ� �ִ� ����Ŭ������ �ڵ���� ���� �� getter / setter ��ü
	 * 
	 * �츮�ݰԽ��ǿ� ������ �������� ����
	 * 
	 * ���� �ð� : 08 /  08 -- 07:59 ����
	 */
	
	// [ �޼ҵ�� ]
	// 16:00�� �����е��� ���� �ð��̱� ������, �ǽ��� �帮�ڽ��ϴ�
	// ��� �ʵ忡 ���� getter() / setter() ����� + ��� �ʵ��� ������ 
	// ���ļ� ��ȯ�ϴ� info() �����
	
	//getter
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getNickName() {
		return nickName;
	}
	
	// setter
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	// info
	
	public String info() {
		return "���̵� : " + userId + ", ��й�ȣ : " + userPwd + ", �г��� :" + nickName;
	}
}
