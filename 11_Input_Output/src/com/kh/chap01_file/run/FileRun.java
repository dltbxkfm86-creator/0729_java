package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {
	
	public static void main(String[] args) {
		
		// ���� �����ϰ� �ҽ��ڵ带 �̿��ؼ� ������ ������
		// File Ŭ������ ������ ����
		// java.io ��Ű���� ����
		
		// ����Ŭ������ �̿��ؼ� ��ü ����
		File file1 =new File("test.txt");
		
		try {
			// ���� �����
			file1.createNewFile();
			// createNewFile() : ���� ���� �޽���
		
			// ���� �����
			// mkdir
			File folder = new File("folder");
			folder.mkdir();
			
			// �����������
			File file2 = new File("folder/test.txt");
			file2.createNewFile();
			
			// ����Ŭ�������� �����ϴ� �޼ҵ�
			System.out.println("���� �´�?" + file2.isFile());
			System.out.println("���ϸ� : " + file2.getName());
			System.out.println("���� ���� : " + file2.getParent());
			System.out.println("���� ��� : " + file2.getAbsolutePath());
			System.out.println("���� ũ�� : " + file2.length());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * => IO(Input & Output), ��/���
	 * 
	 * ���α׷� ���� �����͸� �ܺθ�ü(�����, ����Ŀ, DB, ���μ���, �ܼ�, "����")�� ����ϰų�
	 * �Է���ġ(���콺, Ű����, ����ũ, "����")�� �Է¹޴� ����
	 * 
	 * IO�� �����ϰ� ������
	 * �켱������ �ݵ�� ���α׷��� �ܺθ�ü���� "���"�� ������ ��
	 * => ��Ʈ��(Stream)
	 * 
	 * ��Ʈ���� Ư¡
	 * 
	 * - �ܹ��� : �Է��̸� �Է� / ����̸� ���
	 * 			�Է¿�� ��¿� ��Ʈ���� ���� ���� ������
	 * 
	 * - ���Լ���(First In, First Out) ==> �ð����� ������ �߻��� �� ����
	 * 
	 * ��Ʈ���� ����
	 * 
	 * - ��Ʈ���� ������
	 * 
	 * ����Ʈ��Ʈ�� : 1Byte¥���� �̵��� �� �ִ� ���
	 * 				=> �Է�(XXXInputStream) / ��� (XXXOutputStream)
	 * 
	 * ���ڽ�Ʈ�� : 2Byte¥���� �̵��� �� �ִ� ���
	 * 				=> �Է�(XXXReader) / ���(XXXWriter)
	 * 
	 * - �ܺθ�ü���� �������� ���� ����
	 * 
	 * ��� ��Ʈ�� : �ܺθ�ü�� ���������� ����Ǵ� ��Ʈ��
	 * 
	 * ���� ��Ʈ�� : ��ݽ�Ʈ�������� ������ ������ �������ִ� �뵵�� ������� ��Ʈ��
	 * 					=> �ܵ� ��� �Ұ�(�ݵ�� ��ݽ�Ʈ���� �����ؾ߸� ����� ������)
	 * 					=> �ӵ� ���, �ڷ����� ���缭 ��ȯ, ��ü ������ �����, ����Ʈ <==> ����
	 * 
	 */
	
	
	
}
