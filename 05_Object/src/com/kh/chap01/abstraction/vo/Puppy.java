package com.kh.chap01.abstraction.vo;
/*
 * public class Ŭ�����ĺ��� {
 * 
 *		// �ʵ��
 *
 *
 *		// �����ں�
 *
 *
 *		// �޼ҵ��
 *
 * }
 */
public class Puppy {

	// [ �ʵ�� ]
	// ���������� �ڷ��� �ʵ�ĺ���;
	
	// ���������� : �� �ʵ忡 ������ �� �ִ� ���ٱ����� �����ϴ� ����
	//				public > protected > default > private
	// Ŭ���� ���ο� �ʵ带 ������ ���� �ݵ�� ���������ڸ� ���� ��!
	
	// ��, �̸�, ����, ����, ����, ������
	public String species;
	public String name;
	public int age;
	public String gender;
	public String color;
	public int weight;
	
	// [ �����ں� ]
	
	// [ �޼ҵ�� ]
	
	public void sniff() {
		System.out.println("ůů�Ÿ��� ������ �ý��ϴ�.");
	}
	
	public void bark() {
		
		if(weight > 15) {
			System.out.println(name + "�� ���ϰ� ¢���ϴ�.");
			weight = weight - 5;
		} else {
			System.out.println("�ʳ� ¢���~");
		}

	}
}
