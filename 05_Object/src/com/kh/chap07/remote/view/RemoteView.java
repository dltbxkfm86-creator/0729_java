package com.kh.chap07.remote.view;

import java.util.Scanner;

import com.kh.chap07.remote.controller.RemoteController;

// ����ڿ��� ���� �Է¹ް� ������ ������ִ� �޼ҵ带 �־�� Ŭ����
public class RemoteView {
	private Scanner sc = new Scanner(System.in);
	private RemoteController rc = new RemoteController();
	
	// ���α׷� ���� �� ������ ���θ޴��� ������ִ� �޼ҵ�
	public void mainMenu() {
		
		while(true) {
			System.out.println("������ ���� ���α׷��Դϴ�.");
			System.out.println("�̿��Ͻ� �޴��� �������ּ���.");
			System.out.println("1. �����ѱ�");
			System.out.println("2. ä�� �ٲٱ� ��");
			System.out.println("3. ä�� �ٲٱ� ��");
			System.out.println("4. ���� ���� ��");
			System.out.println("5. ���α׷� ���� ��");
			System.out.println("� ����� �̿��Ͻðڽ��ϱ� ?");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : powerOn(); break;
			case 2 : channelUp(); break;
			case 3 : break;
			case 4 : break;
			case 5 : System.out.println("������ ���� ���α׷� ����");return;
			default : System.out.println("���� �޴��� �����ϼ̽��ϴ�. �ٽ� �Է����ּ���");
			}
		}	
	}
	
	private void powerOn() {
		// RemoteController rc = new RemoteController();
		System.out.println("==============================");
		System.out.println("���� �ѱ� �޴��Դϴ�.");
		System.out.println("==============================");
		int result = rc.powerOn();
		if(result > 0) {
			System.out.println("Ƽ�� �����־ ����");			
		} else {
			System.out.println("Ƽ�� �̹� ��������");
		}
		System.out.println("������ �������ϴ�");
		System.out.println();
		
	}
	
	private void channelUp() {
		// 0��ä��
		// 1��ä��
		// ��Ʈ�ѷ��� ä�� �÷��� �׸��� ���ϴ��� �˷���
		String channel = rc.channelUp();
		if(channel != null) {
			int channelNo = rc.getChannelNo();
			System.out.println(channelNo + "�� ä���Դϴ�");
			System.out.println("====================================");
			System.out.println("���� ������ ���α׷��Դϴ� : " + channel);
			System.out.println("====================================");
		} else {
			System.out.println("���� ������ ���ֽñ� �ٶ��ϴ�");
		}
		
		System.out.println();
	}
}
