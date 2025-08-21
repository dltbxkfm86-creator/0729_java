package com.kh.chap03.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.kh.chap03.model.vo.MBTI;

public class Run {
	public static void main(String[] args) {
		
		// HashSet
		// Value���� ����, index���� ���� == �������� X, �ߺ� X
		// [ ǥ���� ]
		// HashSet ��ü�� = new HashSet(); // �� HashSet�� �������
		
		// ���ڿ��� ���� �� �ִ� HashSet
		Set<String> set = new HashSet();
		
		// ����߰�
		// add(�߰��� ���)
		set.add("�ȳ��ϼ���");
		set.add("�ݰ����ϴ�");
		set.add("���� ���ְ� ��̳���?");
		set.add("�ȳ��ϼ���");
		set.add(new String("�ݰ����ϴ�"));
		set.add(new String("�ȳ��ϼ���"));
		set.add("���� ���� ���峲");
		set.add("�� ��� ������� ����?");
		
		System.out.println(set); // ���� ���� ���� X, �ߺ� ��� X
		
		// ��� ���� ���ϱ� size()
		System.out.println("set�� ��� ���� : " + set.size());
		
		// MBTI 16���� �ٷ�߰ڴ�
		Set<MBTI> mbti = new HashSet();
		
		MBTI istj = new MBTI("I","S","T","J");
		MBTI isfj = new MBTI("I","S","F","J");
		MBTI estj = new MBTI("E","S","T","J");
		MBTI estp = new MBTI("E","S","T","P");
		
		mbti.add(istj);
		mbti.add(isfj);
		mbti.add(estj);
		mbti.add(estp);
		mbti.add(new MBTI("E","S","T","P"));
		/*
		System.out.println("ABC".equals(new String("ABC")));
		System.out.println(new String("ABC").hashCode());
		System.out.println("ABC".hashCode());
		*/
		
		// HashSet => set�� ��Ҹ� �߰��� �� ����
		// equals()�� hashCode()�� ��ȯ���� �������� ��ġ�ϴ� ��Ұ� �ִ��� ����
		
		System.out.println(mbti); // ���� ���� ���� X
		
		// istj.equals(istj);
		
		/*
		 * equals() ȣ���� ����� == true�̰� hashCode()�� ��ȯ���� ����� �����ڸ� ���� ������ ��
		 * ���� ��ġ�ϴٸ� => ���ϰ�ü�� �Ǵ�(�ߺ������� ��������)
		 * 
		 * �ʵ��� ���� ������ �ּҰ��� �޶� ���ϰ�ü�� �ƴѰ����� �Ǵ��ϱ� ����
		 * VOŬ������ ���ο� equals() �� hashCode()�� �������̵�
		 */
		
		System.out.println("============================================");
		
		// set�� ��Ҹ� �ݺ����� ���� ����غ���
		/*
		for(int i = 0; i < mbti.size(); i++) {
			System.out.println(mbti.get�� ����);
		} ����
		*/
		
		for(MBTI e : mbti) {
			System.out.println(e);
		}
		
		System.out.println("=============================================");
		
		// 2. Set�� ��ҵ��� List�� �Űܴ�� �ε����� Ȱ��
		
//		List list = new ArrayList();
//		list.addAll(mbti);
		List list = new ArrayList(mbti);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("=========================================");
		
		// 3. Iterator(�ݺ���)
		// StingTokenizer�� ����� ����
		
		Iterator it = mbti.iterator();
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		*/
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// List�� �׷��� Set�� �׷��� ���� �� iterator ������
		//
		// ��� ���� ��ü�� InteratorŸ������ ����� �� ����(������ ����)
		
		// => List�迭 Set�迭�� ���� �� iterator()�� ȣ���ؼ� �ݺ��� ��ų �� ����
		// => Map�迭������ �ٷδ� �Ұ���
		
	}
}
