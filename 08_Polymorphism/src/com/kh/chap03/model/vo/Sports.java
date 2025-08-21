package com.kh.chap03.model.vo;
/*
 * [ ǥ���� ]
 * ���������� abstract class Ŭ�����ĺ���{
 * }
 * 
 */

/*
 * Ŭ���� ���ο� ��ҷ� �߻�޼ҵ带 �ϳ��� �����ϴ� ����
 * Ŭ���� ���� abstractŰ���带 �ٿ��� �߻� Ŭ������ �����ؾ� ��
 * 
 * �߻�Ŭ���� == �ʵ� + �޼ҵ� + �߻�޼ҵ�(��������)
 * 
 * -> �߻�Ŭ������ �������� �ʾƵ� �߻�Ŭ������ ���ǰ���
 * 
 * => ��������δ� �����ڰ� �Ǵ����� �� �� Ŭ������ �θ�Ŭ���� ���ҷθ� ����� ���̰�,
 * 	  ��ü ������ �Ұ����ؾ��Ѵ� ��� ������ ��� �߻�Ŭ������ ����
 * 
 * => ���������δ� �����ڰ� �Ǵ����� �� �ش� Ŭ������ ��ü������ ������ ���°� �ƴѰ� ���� �ϴ�
 *	  ������ ��� �߻�Ŭ������ ����
 *
 * => ��ü ������ �Ұ����ϰ� �ϰ� �������� �Ӽ� �� �޼ҵ� �׸��� Ÿ�Ը� �������� �����ϰ� �ϰ�ʹ�
 * 
 */
public abstract class Sports {

	private int peopleCount;
	
	public Sports() {}
	public Sports(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	
	public int getPeopleCount() {
		return peopleCount;
	}
	public void setPeopleCount(int peopleCount) {
		this.peopleCount = peopleCount;
	}
	// �ڽĵ��� �������̵� �ؼ� �������� ������� ����� �뵵�� �޼ҵ�
	
	/*
	public void rule() {
		System.out.println("���� ��Ģ�Դϴ�");
	}
	*/
	// "�߻�"
	// abstract
	
	// [ �߻�޼ҵ� ǥ���� ]
	// ���������� abstract ��ȯ�� �ĺ���();
	// �߻�Ŭ������ ��ü ������ �Ұ�����
	public abstract void rule();
}
