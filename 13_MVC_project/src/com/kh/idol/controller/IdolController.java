package com.kh.idol.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.idol.model.Idol;
import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Fan;

public class IdolController {
	
	private List<Fan> fans = new ArrayList();
	private List<Board> boards = new ArrayList();
	private List<Idol> aespa = new ArrayList();
	
	{
		aespa.add(new Idol("ī����", "����", "Rocket puncher"));
		aespa.get(0).setImage("""
				
				
				ī����
				
				
				""");
		aespa.add(new Idol("����","�ܱ���", "�ٰ�����"));
		aespa.get(1).setImage("""
				
				
				����
				
				
				""");
		aespa.add(new Idol("����", "����", "Armamenter"));
		aespa.get(2).setImage("""
				
				
				����
				
				
				""");
		aespa.add(new Idol("�״�", "�ܱ���2","E.D Hacker" ));
		aespa.get(3).setImage("""
				
				�״�
				
				""");
	}

	public List<Idol> findAll() {
		// TODO Auto-generated method stub
		return aespa;
	}
	
	// ���̵��鵵 ��� ��Ƴ��� �װ� �о�ͼ� ������ �������� ��
	public List<Idol> findMember(int Member) {
		return aespa.get(memberNo -1); 
	}
	
	// ����ڰ� ���̵� �Է����� �� �Է��� ���̵�
	// Fan���� ���� List�� ����� userId�ʵ尪�� �ߺ��Ǵ� �� �ִ���
	// Ȯ���� �� �ڿ� ����� View�� �ٽ� ��ȯ
	
	public boolean checkId(String userId) {
		
		// 1. userId
		// 2. fans
		// 3. fans.get(i).getUserId()
		// 4. equals()
		
		for(int i = 0; i < fans.size(); i++) {
			if(userId.equals(fans.get(i).getUserId())) {
				return true;
			}
		}
		return false;
	}
	
	// ����ڰ� �Է��� ���̵�, ��й�ȣ, �г����� ������
	// ���ο� Fan�̶�� ��ü�� �����ϸ鼭 �ʵ忡 ���� �������ְ�
	// ������ Fan��ü�� �ּҰ��� ���� ������ �ִ� Fan���� ���� List�� ��ҷ�
	// �߰��� ���ִ� �޼ҵ带 ������ �ؾ� ��
	
	public boolean signUp(String userId, String userPwd, String nickName) {
		
		// 1. ������ ����
		Fan fan = new Fan(userId, userPwd, nickName);
		
		// 2. ��û ó��(���� ��û ó���ϴ� ������ �ȹ�����Ƿ� ��Ʈ�ѷ����� ó��)
		boolean result = checkId(userId);
		
		if(!result) {
			fans.add(fan);
		}
		
		// 3. ����� ��ȯ
		return result;

	}


}
