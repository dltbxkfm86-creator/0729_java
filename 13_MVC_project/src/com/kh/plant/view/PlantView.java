package com.kh.plant.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.kh.plant.controller.PlantController;
import com.kh.plant.model.vo.Plant;

// View : �ð����� �κ� ���, ȭ�� ��/���
public class PlantView {
	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();
	
	// ���α׷� ���� �� ������ ȭ���� ������ִ� ���
	public void mainMenu() {
		// ����� : ArrayList
		while(true) {
			System.out.println();
			System.out.println("�Ĺ� ���� ���α׷��Դϴ�.");
			// CRUD
			// create : ����ڿ��� �Է¹��� ���� ������ ���ο� �Ĺ��� �߰��ϴ� �۾�
			// read	  : ������� �Ĺ��� ��ȸ�ϴ� �۾�
			// Update : ������ �Ĺ��� �����ϴ� �۾�
			// Delete : �Ĺ��� �����ϴ� �۾�
			
			System.out.println("1. �Ĺ� �߰��ϱ�");
			System.out.println("2. �Ĺ� ��ü��ȸ");
			System.out.println("3. Ư�� �Ĺ� �˻�");
			System.out.println("4. Ư�� �Ĺ� ����");
			System.out.println("5. Ư�� �Ĺ� ����");
			System.out.println("6. �Ĺ� ����� ���Ϸ� ����");
			System.out.println("0. ���α׷� ����");
			System.out.println();
			System.out.println("� ����� �̿��Ͻðھ�� ?");
			try {
				int menuNo = sc.nextInt();
				sc.nextLine();
							
				switch(menuNo) {
				case 1 : createPlant(); break;
				case 2 : readAll(); break;
				case 3 : findByKeyword(); break;
				case 4 : deletePlant(); break;
				case 5 : break;
				case 6 : break;
				case 0 : System.out.println("���α׷��� �����մϴ�"); return;
				default : System.out.println("���� �޴��Դϴ�. �ٽ� �������ּ���.");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("������ �Է����ּ���.");				sc.nextLine();
				sc.nextLine();
			}
		}
		
	}

	// 1. ���ο� �Ĺ��� �߰����ִ� ���
	private void createPlant() {
		// TODO Auto-generated method stub
		System.out.println("�Ĺ� ���� �Է����ּ���");
		String name = sc.nextLine();
		System.out.println("������ �Է����ּ���");
		String type = sc.nextLine();
		
		pc.createPlant(name, type);
		
		System.out.println("�����մϴ�");
		System.out.println("���ο� �Ĺ��� �߰��Ǿ����ϴ�");
		
	}
	
	// 2. ��ü �Ĺ� ����� ������ִ� ���
	private void readAll() {
		
		System.out.println();
		System.out.println("��ü �Ĺ� ����Դϴ�.");
		
		List<Plant> plants = pc.readAll();
		
		// ����� ��
		// case 1. ���� ���� ���
		// case 2. ���� �ϳ��� ���
		// case 3. ���� �������� ���
		
		// List�� ��Ұ� �ϳ��� �������� ���� ���
		
		if(plants.isEmpty()) {
			// List�� ��Ұ� �ϳ��� �������� ���� ���
			System.out.println("�Ĺ��� �������� �ʽ��ϴ�");
			System.out.println("���ο� �Ĺ��� �߰��غ�����");
		} else {
			// �ּ��� �ϳ��� ���� ���
			
			for(Plant p : plants) {
				System.out.println("�Ĺ��̸� : " + p.getName() + ", �Ĺ��� : " + p.getType());
			}
		}
		System.out.println();
	}
	
	// 3. ����ڰ� �Ĺ��� ���� Ű���带 �Է��� �� �ִ� ȭ���� ������ִ� ���
	private void findByKeyword() {
		
		System.out.println();
		// 1. ����ڰ� �Է��� Ű���尡 ���� ���ԵǾ��ִٸ� ���
		// 2. ����ڰ� �Է��� Ű���尡 Ÿ�Կ� ���ԵǾ��ִٸ� ���
		// 3. ����ڰ� �Է��� Ű���尡 ���� �Ǵ� Ÿ�Կ� ���ԵǾ��ִٸ� ���
		// 4. ����ڰ� �Է��� Ű���尡 ����� Ÿ�Կ� �� �� ���ԵǾ� �ִٸ� ���
		
		// 3) 
		System.out.println("�Ĺ� �˻� �����Դϴ�");
		System.out.println("�˻�� �Է����ּ���");
		String keyword = sc.nextLine();
		// View�� �� �� ��
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 4. Ư�� �Ĺ��� ������ �� �ִ� ȭ���� ������ִ� ���
	private void deletePlant() {
		
		System.out.println();
		// ������ ��� �� �� �ֵ��� ������� ���ΰ�?
		// 1. �Ĺ��̸��� �Է¹޾Ƽ� ����
		// 2. �Ĺ�Ÿ���� �Է¹޾Ƽ� ����
		// 3. �Ĺ��̸��� Ÿ���� �Է¹޾Ƽ� ����
		// 4. �׳� �ƹ��͵� �Է� �� �ް� ��ü ����
		
		// (3). �̸� �� Ÿ���� �Է¹޾Ƽ� ����
		// 1) �̸��� ��ġ�ϸ� ����
		// 2) Ÿ�Ը� ��ġ�ϸ� ����
		// 3) �̸��ϰ� Ÿ���ϰ� �Ѵ� ��ġ�ؾ� ����
		// 4) �̸� Ű���尡 ���ԵǾ� ������ ����
		// 5) Ÿ�� Ű���尡 ���ԵǾ� ������ ����
		// 6) �̸� �Ǵ� Ÿ�Կ� Ű���尡 ���ԵǾ� ������ ����
		
		// 3-3) �̸��ϰ� Ÿ���� �Է¹ް� �Ѵ� ��ġ�ϴ� ���� ���� ���� ����
		
		System.out.println("�Ĺ��� �̸��� �Է����ּ���");
		String name = sc.nextLine();
		System.out.println("�Ĺ��� ������ �Է����ּ���");
		String type = sc.nextLine();
		
		// ���� ��
		
		// ��Ʈ�ѷ����� ����ڰ� �Է��� �� �� ���� �����ϸ鼭 ������û ������
		int count = pc.deletePlant(name, type);
		
		// 0
		// 1
		if(count > 0) {
			System.out.println("���� ����!");
			System.out.println(name + "��(��) �� " + count + "�� �����߽��ϴ�!");
		} else {
			System.out.println("������ �Ĺ��� ã�� ���߽��ϴ�");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
