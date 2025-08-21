package com.kh.plant.run;

import com.kh.plant.view.PlantView;

public class PlantRun {

	public static void main(String[] args) {
		
		// MVC ���� (Model - View - Controller)
		// ���ø����̼��� ���� ��
		// ���ø����̼��� ������ ������ ��ҷ� �и�����
		// ��� ����Ʈ���� ��Ű���� ������ ����
		// 1. Model
		// ������ ��� = > VO
		// �ܺθ�ü���� ��ȣ�ۿ� => DAO
		// ������ ���� =======> �����Ͻ� ����
		// 2. View
		// ����� �������̽��� ���
		// ����ڿ��� ���� ǥ�� / ������� �Է°��� �޾���
		// �𵨿��� ������� �����͸� �ð������� ǥ��
		// �𵨰� ���� ��ȣ�ۿ����� ����
		// 3. Controller
		// Model�ϰ� View�� �߰��ٸ� ����
		// ����� �Է��� ó���ϰ� �𵨿� ����
		// �𵨿��� �Ͼ ó���۾��� �信 �ݿ�
		
		PlantView pv = new PlantView();
		pv.mainMenu();
	}

}
