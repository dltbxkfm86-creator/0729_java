package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.Casting;
public class Run {
	public static void main(String[] args) {
		
		// �ܺ� Ŭ������ �����ϴ� �޼ҵ带 ȣ���ϰ� ����
		
		// Ŭ�����̸� ��Ī = new Ŭ�����̸�();
		A_Variable a = new A_Variable();
		//a.findSeasonMenu();
		//a.declareVariable();
		
		B_KeyboardInput b = new B_KeyboardInput();
		//b.inputTest();
		
		Casting c = new Casting();
		//c.autoCasting();
		c.forceCasting();
	}
}
