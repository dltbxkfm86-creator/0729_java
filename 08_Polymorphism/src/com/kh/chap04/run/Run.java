package com.kh.chap04.run;

import java.util.Scanner;

import com.kh.chap04.model.vo.Bong;
import com.kh.chap04.model.vo.Hong;
import com.kh.chap04.model.vo.Jjimdak;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �մ��� ��߽��Ѿ��� ~ ����
		System.out.println("��� �ֹ� ���񽺿� ���� ���� ȯ���մϴ�");
		System.out.println("�ֹ��Ͻ� ��� �귣�带 �����Ͻñ� �ٶ��ϴ�");
		System.out.println("1. ȫ���");
		System.out.println("2. �����");
		System.out.println("�޴��� �������ּ���");
		int menuNo = sc.nextInt();
		
		Jjimdak dak = null;
		
		switch(menuNo) {
		case 1 : dak = new Hong(); break;
		case 2 : dak = new Bong(); break;
		}
		
		dak.order();
		
		
	}

}
