package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public MemberMenu() { }
	
	public void mainMenu() {
		while(true) {
			int count = mc.existMemberNum();
			System.out.println("�ִ� ��� ������ ȸ�� ���� " + mc.SIZE + "���Դϴ�.");
			System.out.println("���� ��ϵ� ȸ������ " + count + " ���Դϴ�.");
			
			if(count != 10) {
				System.out.println("1. �� ȸ�����");
			} else {
				System.out.println("ȸ�� ���� �� á�� ������ �Ϻθ޴��� ���µ˴ϴ�");
			}
			System.out.println("2. ȸ�� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ����");
			System.out.println("5. ��� ���");
			System.out.println("9. ������");
			System.out.println("�޴� ��ȣ");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : insertMember(); break;
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : findAll(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("���� �޴��� �����ϼ̽��ϴ�. �ٽ� �Է��ϼ���~");
			}
		}
		
	}
	
	private void findAll() {
		
		System.out.println();
		System.out.println("ȸ�� ��ü ��ȸ �����Դϴ�");
		
		Member[] members = mc.getM();
		int count = mc.existMemberNum();
		System.out.println("�� " + count + "���� ȸ���� �����մϴ�");
		if(count > 0) {
			for(int i = 0; i < members.length; i++) {
				if(members[i] != null) {
					System.out.println("===============================");
					System.out.println("���̵� : " + members[i].getId());
					System.out.println("��й�ȣ : " + members[i].getPassword());
					System.out.println("�̸� : " + members[i].getName());
					System.out.println("�̸��� : " + members[i].getEmail());
					System.out.println("===============================");
					System.out.println();
				} else {
					System.out.println("ȸ���� �������� �ʽ��ϴ�");
				}
				
			}
			
		}
		
		
		
		System.out.println("");
		
	}

	private void insertMember() {
		
		// ���̵� => �ߺ��� �߻��ϸ� �ȵǹǷ� mc�� �޼ҵ带 ȣ���ؼ� �ߺ�Ȯ��
		//			�ߺ��� �ƴҽø� pass
		String id = " ";
		while(true) {
			
			// �ߺ����̵� �ִ� == true
			// �ߺ����̵� ���� == false
			System.out.println("���̵� �Է����ּ��� >");
			id = sc.nextLine();
			boolean result = mc.checkId(id);
			
			if(result) {
				System.out.println("�ߺ����̵� �����մϴ�. �ٽ� �Է��ϼ���");
			} else {
				break;
			}
		}
		
		// ��й�ȣ
		System.out.println("��й�ȣ�� �Է����ּ���");
		String password = sc.nextLine();
		char gender = ' ';
		while(true) {
			
			System.out.println("������ �Է����ּ���(M/F)");
			gender = sc.nextLine().charAt(0);
				
			if(gender =='m' || gender =='M' ||
				gender == 'f' || gender == 'F') {
				break;
			} else {
				System.out.println("������ �ٽ� �Է����ּ���!");
			}
		}
		System.out.println("");
		String name = sc.nextLine();
		
			// �̸�
			// ����	=> M,m,F,f �� �ƴϸ� �ٽ� �Է¹޾Ƽ�

		System.out.println("�̸����� �Է����ּ���");
		String email = sc.nextLine();
		
		System.out.println("���̸� �Է����ּ���");
		int age = sc.nextInt();
		sc.nextLine();
		
		mc.insertMember(id, name, password, email, gender, age);
		
	}
	
	private void searchMember() {
		
		while(true) {
			System.out.println("ȸ�� �˻� �����Դϴ�.");
			System.out.println();
			System.out.println("1.���̵�� �˻��ϱ�");
			System.out.println("2.�̸����� �˻��ϱ�");
			System.out.println("3.�̸��� �˻��ϱ�");
			System.out.println("9.�������� ���ư��� ");
			System.out.println();
			System.out.println("�޴��� �������ּ���");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : searchId(); break;
			case 2 : searchName(); break;
			case 3 : searchEmail(); break;
			case 9 : return;
			default : System.out.println("�̻��Ѱ� ����������");
			}
		}
		
	}
	
	private void searchId() {
		
		System.out.println("���̵� �Է����ּ���");
		String id = sc.nextLine();
		
		Member member = mc.searchId(id);
		// ���̵� �������� ��� => heap������ ���� MemberŸ���� ��ü �ּҰ�
		// ���̵� �������� �ʾ��� ��� => null
		
		if(member != null) {
			System.out.println("���̵� " + id + "�� �˻�����Դϴ�.");
			System.out.println("�̸� : " + member.getName());
			System.out.println("���� : " + member.getAge());
			System.out.println("�̸��� : " + member.getEmail());
		} else {
			System.out.println("�Է��Ͻ� ���̵�� �������� �ʽ��ϴ�");
		}
	}
	
	private void searchName() {
		
		System.out.println("�̸����� �˻��ϱ� �����Դϴ�");
		System.out.println("�˻��Ͻ� �̸��� �Է����ּ���");
		String keyword = sc.nextLine();
		
		Member[] members = mc.searchName(keyword);
		
		if(members[0] != null) {
			
			for(int i = 0; i < members.length; i++) {
				System.out.println("====================");
				System.out.println("���̵� : " + members[i].getId());
				System.out.println("�̸� : " + members[i].getName());
				System.out.println("�̸��� : " + members[i].getEmail());
				System.out.println("====================");
			}
			
		} else {
			System.out.println("�˻������ �������� �ʽ��ϴ�");
		}
	}
	private void searchEmail() {
		
	}
	
	private void updateMember() {
		while(true) {
			
			System.out.println();
			System.out.println("ȸ�� ���� ���� �����Դϴ�");
			System.out.println("1. ��й�ȣ �����ϱ�");
			System.out.println("2. �̸� �����ϱ�");
			System.out.println("3. �̸��� �����ϱ�");
			System.out.println("4. ���� �����ϱ�");
			System.out.println("5. ���� �����ϱ�");
			System.out.println("9. ���θ޴��� ���ư���");
			System.out.println();
			System.out.println("�޴��� �������ּ��� >");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : updatePassword(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 9 : return;
			default : System.out.println("���� �޴��Դϴ�.");
			}
		}
	}
	
	private void updatePassword() {
		// ���̵�� ��й�ȣ�� �ٲ� ��й�ȣ��
		// 3���� ���� �Է¹޾Ƽ�
		// ���̵�� ��й�ȣ�� ��ġ�ϴٸ� ���� ��й�ȣ�� �ٲ� ��й�ȣ�� ����
		// ���̵� �Ǵ� ���� ��й�ȣ �� �� �ϳ��� ��ġ���� �ʴٸ� �� �ٲ���
		
		System.out.println("���̵� �Է��ϼ���");
		String userId = sc.nextLine();
		
		System.out.println("���� ��й�ȣ�� �Է��ϼ���");
		String userPw = sc.nextLine();
		
		System.out.println("�� ��й�ȣ�� �Է��ϼ���");
		String newPassword = sc.nextLine();
		
		boolean result = mc.updatePassword(userId, userPw, newPassword);
		
		if(result) {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�");
		} else {
			System.out.println("��й�ȣ ���濡 �����߽��ϴ�");
			System.out.println("�Է°��� Ȯ�����ּ���");
		}
		
	}
	
	private void deleteMember() {
		
		System.out.println("ȸ�� ���� �����Դϴ�");
		
		System.out.println("�����Ͻ� ȸ���� ���̵� �Է����ּ���");
		String userId = sc.nextLine();
		
		System.out.println("�����Ͻ� ȸ���� ��й�ȣ�� �Է��ϼ���");
		String userPwd = sc.nextLine();
		
		int result = mc.deleteMember(userId, userPwd);
		
		if(result > 0) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
		
		
		
		
		
	}
}
