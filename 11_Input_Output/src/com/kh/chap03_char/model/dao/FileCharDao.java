package com.kh.chap03_char.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileCharDao {
	
	// ���α׷� --> �ܺθ�ü(����)
	// ���
	
	 public void outputToFile() {
		 // FileWriter : ���Ϸ� �����͸� 2Byte������ ����ϴ� ��Ʈ��
		 
		 // 0. ��Ʈ�� ����
		// FileWriter fw = null;
		 
//		 try {
//			 // 1. ��Ʈ������
//			 fw = new FileWriter("b_char.txt");
//			 
//			 // 2. ��������� => write()
//			 fw.write("��..IO..�ű��ϴ�..");
//			 fw.write("E");
//			 
//		 } catch(IOException e) {
//			 System.out.println("�ٽ� �õ����ּ���");
//		 } finally {
			 // 3. �ڿ��ݳ� => �� ���Ѿ��ϴ� ��� => close()
//			 try {
//				 if(fw != null) {
//					 fw.close();
//				 }
//			 }catch(IOException e) {
//				 e.printStackTrace();
//			 }
//		 } 
		 /*
		  * try ~ with ~ resource ����
		  * - JDK 7�̻� ��밡��
		  * 		 
		  * try(��Ʈ����ü����; ...) {
		  * 	���ܰ� �߻��� ���� �ִ� ����;
		  * } catch(����Ŭ���� e) {
		  * 	���ܰ� �߻����� �� ������ ����;
		  * }
		  * ����� ������ ������ close()�� ȣ���ؼ� �ڵ����� �ڿ��� �ݳ�����
		  * Ȥ���� �� ���� �ִ� �Ǽ��� ���� �� �ִ� ���� �Ǹ��� ����
		  * ������ : Closeable�� ������ ��
		  */
		 
		 
		 
		 try(FileWriter fw = new FileWriter("c_char.txt"); 
				 Scanner sc = new Scanner(System.in)) {
			 fw.write("��..IO..����..");
			 fw.write("e");
		 } catch(IOException e) {
			 e.printStackTrace();
		 }
	 }
	 
	 public void writeTil() {
		 
		 // ����ڿ��� ���� �н������� �Է¹޾Ƽ�
		 // �ܺ����Ͽ� ������ ���
		 
		 // ������ ���ϸ� : 2025 08�� 14�� ������ �н�����
		 Date now = new Date();
		 // System.out.println(now);
		 // 2025�� 08�� 14��
		 
		 String titleDate = new SimpleDateFormat("yyyy�� MM�� dd��").format(now);
		 // System.out.println(titleDate);
		 StringBuilder sb = new StringBuilder();
		 // String fileName = titleDate + " ������ �н�����.txt";
		 sb.append(titleDate);
		 sb.append(" ������ �н�����.txt");
		 
		 FileWriter fw = null;
		 Scanner sc = new Scanner(System.in);
		 
		 try {
			 fw = new FileWriter(sb.toString());
			 System.out.println("���� ��� ���� �ۼ�");
			 String content = sc.nextLine();
			 fw.write("���� �н��� ���� : \t" + content);
			 
		 } catch(IOException e) {
			 System.out.println("��� ��� �����߻�");
		 } finally {
			 try {
				 if(sc != null) sc.close();
				 if(fw != null) fw.close();
			 } catch(IOException e){
				 System.out.println("�ڿ� �ݳ��� �ϴٰ� ���� �߻�");
			 }
		 }
	 }
}
