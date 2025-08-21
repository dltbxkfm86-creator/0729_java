package com.kh.chap02;

public class Cafe {

	// �ʵ�(Field)��
	/*
	 * ��ü�� ���� �� �ִ� �Ӽ�
	 * 
	 * ����(Data)�� ��� �κ�
	 * 
	 * �ʵ� == �������
	 * 
	 * ���������� �ڷ��� �ʵ�ĺ���;
	 */
	private String name;
	private String address;
	private String signatureMenu;
	private int signatureMenuPrice;	
	
	// ������(Constructor)��
	// �޼ҵ�(Method)��
	/*
	 * ���(method)�� �����ϴ� �κ�
	 * 
	 * ���������� (�����) ��ȯ�� �޼ҵ�ĺ���(�Ű�����) {
	 * 		�޼ҵ� ȣ�� �� ������ �ڵ�;
	 * }
	 * 
	 * ���������� : ȣ���� �� �ִ� ������ ������ �� ����
	 * ��ȯ��	    : void = > return �� �� ������ ���� ����
	 * 			  ��ȯ �� ��� ���� �ڷ����� ������ش�.
	 * �Ű�����   : �޼ҵ� ȣ�� �� ���� ���� �޾��ִ� ����
	 * 		      �޼ҵ� ���������� ��� ����. ���� ����
	 */
	
	public void open() {
		dishWash();
		cleaning();
		windowWash();
	}
	
	public void dishWash() {
		System.out.println("�����ϰ� ����!!");
	}
	
	public void cleaning() {
		System.out.println("û�ҵ� ����!!");
	}
	
	public void windowWash() {
		System.out.println("������ ����!!");
	}
	
	// �����͸� ��� �� �����ϴ� ����� �޼ҵ� : setter()
	
	/*
	 * DTO - > setter�� �������
	 * VO -> �Ϲ������� setter�޼ҵ带 �������� ����
	 * 
	 * DTO�� 2�޵ڿ� ���ǵ� DTO�н� �������� VOŬ������ setter�� �����ؼ� ���
	 * 
	 * setter����� ��Ģ
	 * 
	 * 1. setter�޼ҵ�� �ܺο��� ������ �����ؾ� �ϱ� ������ ���������� public�� �̿�
	 * 2. set�ʵ������ �ĺ��ڸ� �ۼ��ϸ� ��Ÿ��ǥ���(camelCase)�� �� ��Ű���� ����.
	 * 
	 * 3. (���ܻ�Ȳ) �츮�� ��а� �׻� ��� �ʵ忡 ���ؼ� setter�� �����մϴ�
	 */
	
	// �����޴��� ���������� ��� �� ������ �� �ִ� �޼ҵ�
	// signatureMenuPrice
	public void setSignatureMaenuPrice(int signatureMenuPrice) {
		

		/*
		 * System.out.println("setter���� ���� ���� ���� �� : "
		 * 					+ signatureMenuPrice);
		 */
		// signatureMenuPrice = signatureMenuPrice;
		// Scope�ȿ����� �ش� �����ȿ� �ִ� ���������� ���� �켱���� ����
		System.out.println("�� �ּҰ� ���� ? " + this);
		// this : �ش� ��ü�� �ּҰ��� ����Ű�� ����
		
		if(signatureMenuPrice <= 1000) {
			System.out.println("���������� ���� ���� �Է��ϼ̽��ϴ�. 1000 �̻��� ������ �Է����ּ���");
		} else {
			this.signatureMaenuPrice = signatureMenuPrice;
		}
		
		// name�ʵ带 ��� �� ������ �� �ִ� �޼ҵ�
		public void setName(String name) {
			this.name = name;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		
		/*
		 * ���� ���� �� �� �̻��� �ʵ尪�� �� ���ϴ� �޼ҵ�� set�� ������ XX
		 * 
		 * public void setNameAndAddress(String name, String address) {
			setName(name);
			setAdderss(address);
		}
		 * 
		 */
		
		// �����͸� ��ȯ���ִ� ����� �޼ҵ� : getter()
		
		/*
		 * ��Ģ!
		 * 
		 * 1. getter()�� ���������� public�� ����Ѵ�
		 * 2. get�ʵ������ ����, ��Ÿǥ���(camelCase)�� ����Ѵ�
		 * 3. ��� �ʵ忡 ���ؼ� �ݵ�� ������ �� �� ����� ������ּ���
		 */
		
		// �޼ҵ带 ȣ���� ������ name�ʵ尪�� �����ְ� ����
		public String getName() {
			return name;
		}
		
		// �ּ����� ��ȯ���ִ� �޼ҵ�
		
		public String getAddress() {
			return address;
			// return value;
			// value�� �޼ҵ� ȣ�� �κ����� ��ȯ�ϰڴ�
			// �޼ҵ��� ��ȯ���� ��ȯ�ϰ��� �ϴ� ���� �ڷ����� ��ġ�ϴ°��� �� �� Ȯ���ؾ� ��
		}
		
		public int getSignatureMenuPrice() {
			return signatureMenuPrice;
		}
		
		// getter() / setter() �� ���� => ĸ��ȭ�� ����(�������� ����)
		/*
		 * 1. ���� ����� => �ʵ��� ���������ڸ� public��� private���� �����Ѵ�
		 * 2. �޼ҵ带 ���� �ʵ忡 ������ �� �ֵ��� ������� => getter() / setter() ����
		 * 
		 * �����͸� ���� -> ��ü���� ���յ��� ���� -> å���� �и���Ų��.
		 */
		
		// ��� �ʵ� ���� Ȯ���� �� �ֵ��� ��ȯ���ִ� �޼ҵ�
		public String info() {
			
			// name, address, signatureMenuPrice
			// return name, address, signatureMenuPrice;
			// return �� �� ��ȯ�� �� �ִ� �� �� �Ѱ�
			String info = "[name �ʵ尪 : " + name + ", address �ʵ尪 : " 
							+ address + ", signatureMenuPrice : " + "signatureMenuPrice + "]";"
			return info;						
		}
}
