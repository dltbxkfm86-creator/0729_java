package com.kh.chap06.run;

import java.util.Arrays;

import com.kh.chap06.controller.Human;
import com.kh.chap06.controller.MethodController;
import com.kh.chap06.controller.OverloadingController;

public class Run {
	
	public static void main(String[] args) {
		
		Human human = new Human();
		
//		MethodController mc = new MethodController();
//		
//		int a = mc.add(1, 2);
//		int b = mc.add(2, 3);
//		int c = mc.add(5, 6);
//		int d = mc.add(a, b);
//		int e = mc.add(c, d);
//
//		System.out.println("���� : " + e);
		
		MethodController mc = new MethodController();
		// int[] dd = new int[3];
//		mc.method1();
//		String returnValue = mc.method2();
//		System.out.println(returnValue);
//		System.out.println(mc.method2());
		//mc.println("method3 ȣ���� : " + mc.method3());
		
		// String parameter = "method3 ȣ�� ��� : " + mc.method3();
		//mc.method4(1);
		
//		int result = mc.method5(5);
//		System.out.println(result);
		// mc.a();
		
		// MethodController mc = mc;
		// �ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�
		// mc.test(mc); ���� �ּҸ� ����Ŵ
		
		// ����
		
		// ��ü�� �������� �ʰ� �޼��带 ȣ�� �� �� ����
//		Math.random();
//		int[] arr = {2,3};
//		System.out.println(Arrays.toString(arr));
		
		//MethodController.staticMethod();
		//Arrays.toString(new int[2]);
		
		//mc.haha();
		/*
		System.out.println(1);
		System.out.println(1.1);
		System.out.println('a');
		System.out.println("���?");
		System.out.println(mc);
		System.out.println();
		*/
		
		OverloadingController oc = new OverloadingController();
		
		// ���� ���ε�(Static Binding)
		// �������� ���� ���� � �޼ҵ尡 ȣ����� ����
		// �����Ϸ��� �˾Ƽ� �ڵ带 �м��ؼ� �޼ҵ� ȣ��
		
		oc.test();
		oc.test(10);
		oc.test("3");
		oc.test(1,2);
		oc.test(1,"asd");
		oc.test("asd`",2);
		
	}
}
