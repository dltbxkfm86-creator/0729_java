package com.kh.chap05.constructor.run;

import java.util.Scanner;

import com.kh.chap05.constructor.mode.vo.Member;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member member = new Member();
		System.out.println(member.info());
		
		Member member2 = new Member("하하호호");
		
		Member member3 = new Member("user01", "1234");
		System.out.println(member3.info());
		
		Member member4 = new Member("user02", "pass02", "홍길동");
		System.out.println(member4.info());


	}
}

