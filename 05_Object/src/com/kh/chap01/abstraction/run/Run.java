package com.kh.chap01.abstraction.run;

import com.kh.chap01.abstraction.vo.Puppy;

public class Run {

	public static void main(String[] args) {
		/*
		 * ��ü ���� ���α׷��� : ���Ǽ��迡���� �������� ����(��ü)�� �Ӽ��� ������ ����
		 *					 ��ü���� ��ȣ�ۿ��� ���� ���α׷��� �ϴ� ���
		 * 
		 * �����ϰ��� �ϴ� ���α׷��� ��ü�� ����� ���ؼ���(�����ϱ� ���ؼ���)
		 * => Ŭ������ ���� �����ؾ� ��!
		 * 
		 * Ŭ������? �� ��ü���� ����(�Ӽ�, ����)���� ��Ƴ��� �׸� �Ǵ� Ʋ �Ǵ� ���赵 �Ǵ� ��
		 *
		 * Ŭ���� : VO(Value Object) 
		 * 
		 * ������ ����!
		 * 
		 * ���Ǽ��迡 �����ϴ� ������ �� ���𰡸� ã�Ƽ�
		 * VOŬ������ �����
		 * PuppyCareRunŬ������ �����Ͽ� ������ ��ü�� ������ �� �ִ� ���α׷��� �ۼ��Ͻÿ�
		 *
		 * ���� ) VO Ŭ���� 5�� + VO�������α׷� 5��
		 * �� VOŬ������ �ּ� �ʵ� �� 5��
		 * �ּ� �� �� �̻��� �ʵ� ���� ������ �� �ִ� �޼ҵ� ���� --> PuppyŬ������ bark()ó��
		 * 
		 * ������ �� : �츮�� �Խ��� �Խñ� �ۼ�
		 * 				���� ���� ������ �� ����
		 * ���ѽð� : 2025 / 08 / 07 / 07:59����
		 * �Խñ� ���� : ȫ�浿 VOŬ���� �����
		 *
		 * + �޸𸮱��� �׸���
		 *
		 */
		
		// ���Ǽ���
		// ����
		
		/*
		 * ������
		 * ����
		 * 
		 * �� : ���޶�Ͼ�
		 * �̸� : �ʶ���
		 * ���� : 4
		 * ���� : ����
		 * ���� : ����
		 * ������ : 3kg
		 */
		
		// ��ü �����غ���
		// ������ ��ü ����
		Puppy smart = new Puppy();	// ��ü ����
						// new ��� ���� ���
						// Memory�� heap������ �����͸� ����
		//smart.sniff();

		//System.out.println(smart);
		//System.out.println(smart.name);
		
		smart.name = "�ʶ���";
		System.out.println(smart.name);
		smart.age = 4;
		smart.gender = "��";
		smart.color = "����";
		smart.weight = 3;
		
		System.out.println(smart.name + "��"
						+ smart.color + " "
						+ smart.species + "�Դϴ�.");
		System.out.println(smart.age + "��"
						+ smart.gender + "�ƿ� "
						+ smart.weight + "kg�Դϴ�.");
		
		Puppy soldier = new Puppy();
		soldier.name = "�����";
		soldier.age = 22;
		soldier.species = "�׷���Ʈ �Ƿ�����";
		soldier.gender = "��";
		soldier.color = "���";
		soldier.weight = 60;
		
		System.out.println(soldier.name + "�̴�"
						+ soldier.color + " "
						+ soldier.species + "�Դϴ�.");
		System.out.println(soldier.age + "��"
						+ soldier.gender + "�ƿ� "
						+ soldier.weight + "kg�Դϴ�.");
		
		System.out.println("=============================");
		
		smart.sniff();
		soldier.sniff();
		
		System.out.println("¢�� �� ����� ������ : " + soldier.weight);
		soldier.bark();
		
		System.out.println("¢�� �� �� ����� ������ : " + soldier.weight);
		
	}

}
