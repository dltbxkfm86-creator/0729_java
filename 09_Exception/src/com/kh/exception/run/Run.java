package com.kh.exception.run;

import com.kh.exception.controller.CheckedException;
import com.kh.exception.controller.UncheckedException;

public class Run {

	public static void main(String[] args) {
		/*
		 * ����(Error)
		 * 
		 * - �ý��� ���� : ��ǻ���� ���۵����� ���� �߻��ϴ� ����
		 * 				=> (�ɰ�) �ҽ��ڵ�� �ذ��� �ȵ� ����
		 * 
		 * - ������ ���� : ���α׷� ���� �� �ҽ��ڵ���� �������� ������ �߻��ϴ� ����
		 * 				=> �ҽ��ڵ带 �����ؼ� �ذ��� ����(�����ٷ� �˷���)
		 * 
		 * - ��Ÿ�� ���� : ���α׷� ���� �� �߻��ϴ� ���� ���������δ� ������ ���µ� �߻�
		 * 				=> ������� �߸��� ������ ����������...?
		 * 				=> �����ڰ� ���� ������ ���� ó������ �ʾ��� ��!
		 * 
		 * - ���� ���� : �ҽ��ڵ� �� ������ ����, �������� ���� ������ �߻����� ����
		 * 				=> �ǵ��ʹ� �ٸ��� ����(��ȹ / ���踦 �� �� ���� ��)
		 * 
		 * ���� : �ý��� ������ ������ ������ ������, ��Ÿ��, ���� ������ ���� ���� �� �ɰ��� �ֵ�
		 *		 �� �߿����� �ַ� ��Ÿ�� ������ �ǹ���
		 * 
		 */
		
		UncheckedException e = new UncheckedException();
		//e.method1();
		//e.homeWork();
		//e.method2();
		//e.method3();
		
		CheckedException ce = new CheckedException();
		
		try {
			ce.method1();			
		} catch(Exception e1) {
			e1.printStackTrace();
		}
	}

}
