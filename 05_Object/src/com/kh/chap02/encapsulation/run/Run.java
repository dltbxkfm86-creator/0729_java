package com.kh.chap02;

public class Run {

	// ĸ��ȭ (encapsulation)
	// �Ӽ�(������)�� �ش� �����͸� �����ϴ� �ൿ(�޼ҵ�)�� �ϳ��� ������ ���� ��
	// ��������(information hiding)
	
	// ���������� (�����) ��ȯ�� �޼ҵ�ĺ���(�Ű�����) { }
	public static void main(String[] args) {
		
		// ���� ���� 		���Կ�����		��ü ���� == �޸𸮿� ����
		Cafe cafe = new Cafe();
		
		/*
		 * cafe.lee;
		 * cafe.name = "khī��";
		 * System.out.println(cafe.name);
		 * cafe.signatureMenu = "khĿ��;
		 * cafe.signatureMenuPrice = -500;
		 * System.out.println(cafe.signatureMenu);
		 * System.out.println(cafe.signatureMenuPrice);
		 */
		
		// �ʵ尡 ������ �ʾƼ�(�ܺο��� ������ �Ұ����ؼ�) ���� �߻�!
		// ���������ڸ� public���� private���� �����߱� ������ ���� ������ �Ұ���
		// ���� ������ �Ұ����ϱ� ������ ���������� ������ �� �ִ� ����� ������־�� ��
		// cafe.signatureMenuPrice = -500;
		
		/* ��ü�� ������ ���� / �ܺ��� ����
		 * cafe.widdowCleaning();
		 * cafe.dishWash();
		 * cafe.cleaning();
		 * cafe.a();
		 * cafe.open();
		 * 5000
		 * �޼ҵ� ȣ�� �ο����� ������ ���� �ѱ� �� ����
		 * 
		 */
		
		cafe.setSignatureMenuPrice(5000);
		System.out.println("���� �޼��忡�� �� cafe�� �ּ� : " + cafe);
		cafe.setSignatureMenuPrice(5000);
		cafe.setName("khī��");

		//System.out.println(cafe.name);
		
		String cafeName = cafe.getName();
		System.out.println(cafeName);
		String cafeAddress = cafe.getAddress();
		System.out.println(cafeAddress);
		int price = cafe.getSignatureMenuPrice();
		System.out.println(price);
		
		String info = cafe.info();
		System.out.println(info);
		// �����޴��� ���������� ��� �� ������ �� �ִ� �޼ҵ�
		// signatureMenuPrice
		public void setSignatureMaenuPrice(int signatureMenuPrice) {
			
			/*
			 * System.out.println("setter���� ���� ���� ���� �� : "
			 * 					+ signatureMenuPrice);
			 */
		}
	}
}
