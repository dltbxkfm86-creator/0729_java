package com.kh.chap01.abstraction.run;

import java.util.Scanner;

import com.kh.chap01.abstraction.vo.Puppy;

public class PuppyCareRun {

	public static void main(String[] args) {
		
		// ����ڿ��� �������� ������ �Է¹޾Ƽ�
		// �Է¹��� �������� ������ ������ְ�
		// �������� �Բ� ����� �� �ִ� ���α׷�
		
		System.out.println("�Ϳ��� ������ Ű���");
		/* ��ĳ�� Ÿ���� ���� ���� */ Scanner sc = new Scanner(System.in); // ��ĳ�� ��ü ����
		Puppy puppy = new Puppy(); // ������ �Ӽ� �����
		
		System.out.println("�������� �̸��� �Է����ּ���");
		puppy.name = sc.nextLine();
		System.out.println("� ���� �ΰ���?");
		puppy.species = sc.nextLine();
		System.out.println("���̴� �� �� �ΰ���?");
		puppy.age = sc.nextInt();
		sc.nextLine();
		System.out.println("������ �����ΰ���?");
		puppy.gender = sc.nextLine();
		System.out.println("�����Դ� �� kg�ΰ���?");
		puppy.weight = sc.nextInt();
		sc.nextLine();
		System.out.println("���� ���ΰ���?");
		puppy.color = sc.nextLine();
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("===========================");
			System.out.println(puppy.name + "�� ����!");
			System.out.println("���� : " + puppy.age);
			System.out.println("���� : " + puppy.gender);
			System.out.println("�� : " + puppy.species);
			System.out.println("�� : " + puppy.color);
			System.out.println("���� : " + puppy.weight);
			System.out.println("===========================");
			
			System.out.println("�޴��� �������ּ���");
			if(puppy.weight > 40) {
				System.out.println("���̾�Ʈ�� ���� ¢�⸦ ��õ�����");
			}
			System.out.println("1. �����ñ� / 2. ¢�� / 3. ���α׷� ����");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1: puppy.sniff(); break;
			case 2: puppy.bark(); break;
			case 3: exit = true; break;
			default : System.out.println("�޴��� �ٽ� �������ּ���");
			
			}
		}
	}

}
