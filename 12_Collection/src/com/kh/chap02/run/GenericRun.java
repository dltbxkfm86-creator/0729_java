package com.kh.chap02.run;

import java.util.ArrayList;
import java.util.List;
import com.kh.chap02.model.vo.Plant;

public class GenericRun {
	
	public static void main(String[] args) {
		/*
		 * ���ʸ� <Generic>
		 * 
		 * �÷����� ����ϸ鼭 �ٷ� Ÿ�Ե��� �̸� ������ �� �ִ� ���
		 * => ��������� <Integer>, <Plant>
		 * => Ư�� Ÿ���� ��ҵ鸸 �÷��ǿ� ���� �� �ֵ��� ������ �� ����
		 * 
		 * ������ ���׸� ���� �÷��� ��ü ���� (E == Object)
		 * 
		 * 1. �ٷ� ����� Ÿ���� ������ �� ���� => �Ǽ��� ���� �� ����
		 * 2. �� �� ����ȯ�ϴ� ������ ���� �� ���� = > �ڵ� © �� ����
		 */
		List<Plant> plants = new ArrayList();
		plants.add(new Plant("����", "�꼼������"));
		// plants.add("�Ĺ�����~");
		plants.add(new Plant("����", "��������"));
		// String name = ((Plant)plants.get(0)).getName();
		plants.get(0);
		
		for(Plant plant : plants) {
			System.out.println(plant);
		}
	}
}
