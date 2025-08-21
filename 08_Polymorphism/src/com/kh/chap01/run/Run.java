package com.kh.chap01.run;

import com.kh.chap01.model.vo.Child1;
import com.kh.chap01.model.vo.Child2;
import com.kh.chap01.model.vo.Parent;

public class Run {
	/*
	 * ���
	 * 
	 * �ʵ� / �޼ҵ� = > ���� �� �߿���
	 * 
	 * �١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�
	 * �١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�
	 * �١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�
	 * 					Ÿ			��
	 * �١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�
	 * �١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�
	 * �١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١١�
	 * 
	 */
	public static void main(String[] args) {
		
		// 1. �θ� Ÿ�� �ڷ������� �θ� Ÿ�� ��ü�� �ٷ�
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1(); �ڽ��� ������ �ִ� ����� �θ� ����� �� ����
		// p1�����δ� Parent���� ������ ����
		
		// 2. �ڽ� Ÿ�� �ڷ������� �ڽ� Ÿ�� ��ü�� �ٷ�
		Child1 c1 = new Child1();
		c1.printChild1(); // ���� ����
		c1.printParent(); // �θ𲯵� ����
		//c1�����δ� Child1, Parent �Ѵ� ���� ����
		
		
		// = <-- �긦 �������� �纯�� �ڷ����� ���ƾ� ��
		// 3. �θ�Ÿ�� �ڷ������� �ڽ� Ÿ�� ��ü�� �ٷ� == > ������ ����
		Parent p2 = /*(Parent)*/ new Child1();
		p2.printParent();
		// p2.printChild1();
		// p2�δ� ParentŸ�Ը� ������ �� ����
		
		// ������ �ڷ����� �ٸ����� �ұ��ϰ� ������ �߻����� �ʴ� ������
		// �θ�Ŭ������ Parent�� �ڽ�Ŭ������ Child1���� Ÿ���� �����־
		// Ŭ���� ����ȯ�� �Ͼ�� ����
		
		/*
		 * Ŭ���� �� ��ȯ
		 * 
		 * "��� ����"�� ��쿡�� ����
		 * 
		 * 1. Up Casting
		 * 
		 * �ڽ�Ÿ�� => �θ�Ÿ��
		 * ������ ������
		 * 
		 * 2. Down Casting
		 * 
		 * �θ�Ÿ�� => �ڽ�Ÿ��
		 * ������ �Ұ�����
		 * 
		 */
		((Child1)p2).printChild1();
		
		// Child1Ÿ���� ��ü �� ��
		// Child2Ÿ���� ��ü �� ��
		// �� �װ��� ��ü�� �ٷﺼ ��
		
		Child1 child1 = new Child1();
		Child1 child2 = new Child1();
		Child2 child3 = new Child2();
		Child2 child4 = new Child2();
		/*
		child1.printChild1();
		child2.printChild1();
		child3.printChild2();
		child4.printChild2();
		*/
		
		// �迭�� ����غ���
		// �迭 == �� ������ �ڷ����� ������ ��� ������ �� ����
		/*
		Child1[] arr1 = new Child1[2];
		Child2[] arr2 = new Child2[2];
		arr1[0] = new Child1();
		arr1[1] = new Child1();
		arr2[0] = new Child2();
		arr2[1] = new Child2();
		
		arr1[0].printChild1();
		arr1[1].printChild1();
		arr2[0].printChild2();
		arr2[1].printChild2();
		*/
		
		System.out.println("\n\n\n�������� �����غ���");
		Parent[] arr = new Parent[4];
		arr[0] = (Parent)new Child1();
		arr[1] = (Parent)new Child2();
		arr[2] = new Child2();
		arr[3] = new Child1();
		
		//arr[0].printChild1();
		for(int i = 0; i < arr.length; i++) {
			arr[i].printParent();
		}
		
		System.out.println("\n\n\n\n");
		for(int i = 0; i < arr.length; i++) {
			/*
			if(i == 0 || i == 3) {
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/
			/*
			if(arr[i] instanceof Child1) {
				//instanceof => true / false
				// ���� ���������� ���������� � Ŭ����Ÿ���� �����ϰ� �ִ��� Ȯ�� �� �� ���
				((Child1)arr[i]).printChild1();
			} else {
				((Child2)arr[i]).printChild2();
			}
			*/

			arr[i].print();
			// �θ� Ŭ���� �ӽñ� x 4
			
			/*
			 * �������ε� : ���α׷� "���� ��" ������ ������ �������ε� ����(�ڷ����� �޼ҵ带 ����Ŵ)
			 * 			  ���������� �����ϰ� �ִ� ��ü�� �ش� �޼ҵ带 �������̵� �ߴٸ�
			 * 			  ���α׷� "���� ����" �������� �ڽ�Ŭ������ �������̵��� �޼ҵ带 ����
			 * 					 (Runtime)
			 * 
			 * ������ : �θ�Ŭ���� �ڷ������� ���� �ڽ�Ŭ������ �ٷ�� ���
			 * 
			 * 
			 * 
			 */
		}
	}

}
