package com.kh.run;

import com.kh.variable.A_Variable;
import com.kh.variable.B_KeyboardInput;
import com.kh.variable.Casting;
public class Run {
	public static void main(String[] args) {
		
		// 외부 클래스에 존재하는 메소드를 호출하고 싶음
		
		// 클래스이름 별칭 = new 클래스이름();
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
