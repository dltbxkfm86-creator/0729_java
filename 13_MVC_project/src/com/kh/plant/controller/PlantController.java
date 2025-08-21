package com.kh.plant.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.plant.model.vo.Plant;

// Controller : ����ڰ� View�� ���� ��û���� ��
// ��û�� �޾� ó������ �� �ٽ� ó������� View�� ��ȯ����

public class PlantController {
	// �Ĺ� �����
	private List<Plant> plants = new ArrayList();
	
	// �ʱ�ȭ ���
	{
		plants.add(new Plant("�ȼ�����", "����"));
	}
	
	// View���� �Ĺ� �߰� ��û�� �� �� ���� ȣ��Ǵ� �޼ҵ�
	public void createPlant(String name, String type) {
		// 1�� => ��ü ����
		Plant plant = new Plant(name, type);
		
		// �Ĺ�����ҿ� ���ο� �Ĺ��� �߰�
		// �ʵ�� ������ �ִ� List�� �ʵ�� ������ �ִ� Object[]�� ��ҷ� �ߤ�
		
		plants.add(plant);
	}
	
	// View���� ��ü �Ĺ���ȸ ��û�� ���� �� ȣ��Ǵ� �޼ҵ�
	public List readAll() {
		// PlantŸ���� ��ü���� �ּҰ� ��ҷ� �����ϴ� Object[]�� View���� ��ȯ
		return plants;
	}

	// View���� �Ĺ� ���� ��û�� ���� �� ȣ��Ǵ� �޼ҵ�
	public int deletePlant(String name, String type) {
		// ����ڰ� �Է��� �Ĺ��̸� + �Ĺ������� ��ġ�ϴ� �ʵ尪�� ���� Plant��ü�� ����
		// case 1. ������ �̸� �� ������ ���� �Ĺ��� �������� �ʾҴ�
		// case 2. ������ �̸� �� ������ ���� �Ĺ��� �� �� �� �����ߴ�
		// case 3. ������ �̸� �� ������ ���� �Ĺ��� ���� �� �����ߴ�
		// ����/���� ������ ���� View���� ��ȯ���� �ٸ��� �����־�� ��
	
		// �Ĺ��� ������ �� ���ŵ� Plant��ü�� ��Ƽ� ��ȯ
//		Plant p = plants.remove(2);
//		List returnList = new ArrayList();
//		returnList.add(p);
//		return returnList;
		
		// ��Ұ� ���� �� �� ���� �������� ���� ��Ű��
		// ������ ������ ��ȯ

		int count = 0;
		
		// ��ûó��
		for(int i = 0; i< plants.size(); i++) {
			
			if(name.equals(plants.get(i).getName()) &&
				type.equals(plants.get(i).getType())) {
				
				plants.remove(plants.get(i));
				i--;
				count++;
			}
		}
		return count;
	}
}
