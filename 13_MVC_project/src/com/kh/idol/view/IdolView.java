package com.kh.idol.view;

import java.util.List;
import java.util.Scanner;

import com.kh.idol.controller.IdolController;
import com.kh.idol.model.Idol;

public class IdolView {
	// �ʵ��
	private Scanner sc = new Scanner(System.in);
	private IdolController ic = new IdolController();
	
	// ������
	
	
	
	// �޼ҵ��
	// ���α׷��� �������� �� ���� ���� ������ ȭ���� ������ִ� ���
	public void mainMenu() {
		
		System.out.println("aespa Ŀ�´�Ƽ");
		
		String img = "";
		
		while(true) {
			System.out.println("�̿��Ͻ� ���񽺸� �������ּ���");
			System.out.println("1. ������ ��������");
			System.out.println("2. ȸ�� ����");
			System.out.println("3. �α���");
			System.out.println("4. �Խ��� ����");
			System.out.println("5. ���α׷� ����");
			System.out.println("�޴���ȣ �Է�");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : infoMenu(); break;
			case 2 : signUp(); break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			default : System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�");
			}
			
		}
	}

	private void infoMenu() {
		
		System.out.println();
		System.out.println("�������� �����Դϴ�.");
		System.out.println("�̿��Ͻ� �޴��� �������ּ���!");
		System.out.println("1. ī������ ��������");
		System.out.println("2. ������ ��������");
		System.out.println("3. ������ ��������");
		System.out.println("4. �״��� ��������");
		System.out.println("5. ��� ��� ��������");
		System.out.println("6. ���� �޴��� ���ư���");
		System.out.println("�̿��Ͻ� �޴��� �Է����ּ���");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		switch(menuNo) {
		case 1, 2, 3, 4 : findMember(); break;
		case 5 : findAll(); break;
		case 6 : return;
		}
		
	}

	private void findMember(int menuNo) {
		// TODO Auto-generated method stub
		// Ư�� ����� �ּҰ��� ��ȯ���ٷ�?
		
		Idol idol = (Idol) ic.findMember(menuNo);
		
		System.out.println();
		System.out.println(" " + idol.getName() + " ");
		System.out.println(idol.getImage());
		System.out.println("������ : " + idol.getPosition());
		System.out.println("������� : " + idol.getSkill());
	}
	
	private void findAll() {
		// TODO Auto-generated method stub
		// ��� ����� ������ ������ �� �ִ� ���� �� 
		List<Idol> aespa = ic.findAll();
		
		if(aespa.isEmpty()) {
			
			System.out.println("����� �������� �ʽ��ϴ�...");
			
		} else {
			
			for(Idol i : aespa) {
				System.out.println("������ �̹��� : " + i.getImage());
				System.out.println();
				System.out.println("�̸� : " + i.getName());
				System.out.println("������ : " + i.getPosition());
				System.out.println("������� : " + i.getSkill());
				System.out.println();
				
			}
			
		}
	}
	

	private void signUp() {
		
		// Fan�̶�� �ڷ����� ���� �ʵ忡 set�� �� 3���� ����ڿ��� �Է¹���
		
		System.out.println("\n ������ Ŀ�´�Ƽ�� ���Ű��� ȯ���մϴ�.");
		System.out.println("ȸ������ �����Դϴ�");
		
		// �Է� => userId, userPwd, nickName
		
		// �������� => ���̵�� 4���ڿ��� 10���� ������ ��
		//		  => ���̵�� �ٸ� Fan�� ���̵�� �ߺ��Ǹ� �ȵ� ��
		
		String userId; 
		while(true) {
			System.out.println("�����Ͻ� ���̵� �Է����ּ���");
			userId = sc.nextLine();
			
			// �ϳ��� �޼ҵ�� �ϳ��� ��ɸ��� �����ؾ���
			// ������ ���� �� ȸ������ �޼ҵ��
			// ȸ�� ���� �Ӹ� �ƴ϶� ���̵𰪿� ���� ��ȿ�������� �����ϰ� ����
			// �̷��� �Ǹ� �� �޼ҵ�� �ϴ� ����
			// 1. ��ȿ�� ����
			// 2. ȸ������
			// �� ���� �Ǿ������ ������ �ϴ� ���� �ʹ� ����
			
			// 1. ���̵�� 4���ڿ��� 10���� ���̸� ����
			if(!(3 < userId.length() && userId.length() < 11)) {
				System.out.println("���̵�� 4���ڿ��� 10���� ���̸� ��밡���մϴ�");
				continue;
			} 
			
			// 2. �ߺ�üũ
			
			boolean duplicateId = ic.checkId(userId);
			
			if(duplicateId) {
				System.out.println("�̹� �����ϴ� ���̵� �Դϴ�");
			} else {
				System.out.println("��밡���� ���̵��Դϴ�");
				break;
			}
		}
		
		System.out.println("��й�ȣ�� �Է����ּ���");
		String userPwd = sc.nextLine();
		
		System.out.println("�г����� �Է����ּ���");
		String nickName = sc.nextLine();
		
		// ��� �ϴ� �ڽ��� ������ 1������ ��������
		// ����ڰ� �Է��� ���̴ٿ� ��й�ȣ�� �г����� ������ 
		// Fan��ü�� �����ؼ� �ʵ忡 ��Ƽ�
		// Controller�� �ִ� fans��� List�� ��ҷ� �߰�
		boolean result = ic.signUp(userId, userPwd, nickName);
		
		if(result) {
			System.out.println("ȸ�����Կ� �����߽��ϴ�. �ٽ� �õ����ּ���");
		} else {
			System.out.println("ȸ�����Կ� �����ϼ̽��ϴ�");
		}
	}

	
	
	
}

