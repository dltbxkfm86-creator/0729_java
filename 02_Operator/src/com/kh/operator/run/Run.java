package com.kh.operator.run;

// 1�� import�� �ۼ�
import com.kh.operator.*;
// �� Ŭ������ ���� ���� : ���α׷� �����Ϸ���
public class Run {
	
	public static void main(String[] args) {
		
		// method();
		// 2�� import�� �� Ŭ�������ٰ� ��Ī ���̰� new(����) ���ֱ�
		A_Arithmetic a = new A_Arithmetic();

		//a.method();
		
		exam a1 = new exam();
		
		//a1.presentToStudent();
		
		B_InDecrease b = new B_InDecrease();
		//b.method1();
		//b.method2();
		//b.method3();
		
		C_Compound c = new C_Compound();
		//c.method1();
		
		D_LogicalNagation d = new D_LogicalNagation();
		//d.method1();
		
		E_Comparison e = new E_Comparison();
		//e.method1();
		
		F_Logical f = new F_Logical();
		//f.method1();
		//f.method2();
		//f.method3();
		
		G_Triple g = new G_Triple();
		//g.method1();
		//g.method2();
		g.practice();
	}
}
