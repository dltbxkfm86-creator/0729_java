package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
	// ���α׷� ����� static �� , �ʱ�ȭ ��, ������ ������ ����
	
	// static ��
	static{
		System.out.println("ȣ�� ���� ���� ������");

	}
	
	// �ʱ�ȭ ��

	{
		//System.out.println("���� 3��");
		m[0] = new Member("admin", "������", "ad1234", "admin@kh.com", 'M', 100);		
	}
	
	public MemberController() {
	//	System.out.println("���� 4��");
	}
	
	public Member[] getM() {
		return m;
	}
	public int existMemberNum() {
		
		int count = 0;
		/*
		if(m[0] != null) count++;
		if(m[1] != null) count++;
		if(m[2] != null) count++;
		*/
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	public boolean checkId(String inputId) {
		
		
		for(int i = 0; i < m.length; i++) {
			// if(m[i] != null) {
			if(m[i] != null && m[i].getId().equals(inputId)) {
				return true;
			}
			// }
		}
		
		return false;
	}
	
	public void insertMember(String id, String name, String password, String email,
							 char gender, int age) {
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	
	}
	
	public Member searchId(String id) {
		
		// �Ű����� id : ����ڰ� �Է��� �˻��ϰ��� �ϴ� ���̵� ��
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				// ���̵� �Ȱ����� ����
				return m[i];
			}
		}
		return null;
	}
	
	public Member[] searchName(String keyword) {
		int count = existMemberNum();
		Member[] members = new Member[count];
		int index = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(keyword)) {
				members[index++] = m[i];
			}
		}
		return members;
		
	}
	
//	public Member[] searchName(String name) {
//		
//	}
	
//	public Member[] serarchEmail(String email) {
//		
//	}
	
	public boolean updatePassword(String userId, String userPw, String newPassword) {
		
		// ���޹��� 3���� ���� ������
		// ��й�ȣ�� �ٲ��ְų� �ٲ����� �ʰų�
		
		// �迭�� ù��° ��� ���̵� ��
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(userId) && m[i].getPassword().equals(userPw)) {
				m[i].setPassword(newPassword);
				return true;
			}
		}
		
		return false;
	}
	
//	public Boolean updateName(String id, String name) {
//		
//	}
//	
//	public Boolean updateEmail(String id, String email) {
//		
//	}
	
	public int deleteMember(String userId, String userPwd) {
		
		for(int i = 0; i<m.length; i++) {
			if(m[i] != null && m[i].getId().equals(userId) && m[i].getPassword().equals(userPwd))
			m[i] = null;
			return 1;
		} return 0;
	} 
	
	public void delete() {
		
	}
	
	public Member[] printAll() {
		
	}
	
	
	
	
	
}
