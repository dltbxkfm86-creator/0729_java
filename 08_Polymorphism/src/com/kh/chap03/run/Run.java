package com.kh.chap03.run;

import com.kh.chap03.model.vo.BaseBall;
import com.kh.chap03.model.vo.FootBall;
import com.kh.chap03.model.vo.Sports;

public class Run {
	
	public static void main(String[] args) {
		
		FootBall fb = new FootBall();
		fb.rule();
		BaseBall bb = new BaseBall();
		bb.rule();
		
		/*
		Sports s = new Sports();
		s.rule();
		�߻�Ŭ������ ����Ǿ��� ������ ��ü ������ �Ұ�����
		*/
		
		Sports[] sports = new Sports[2];
		sports[0] = fb;
		sports[1] = bb;
		
		for(int i = 0; i < sports.length; i++) {
			sports[i].rule();
		}
	}
}
