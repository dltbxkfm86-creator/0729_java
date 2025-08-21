package com.kh.chap05.constructor.mode.vo;

import java.util.Scanner;

public class Homework1 {
	public String name;
	public String color;
	public int weight;

	public void colorChange() {
		System.out.println("원하는 색상을 입력하세요");
		Scanner sc = new Scanner(System.in);
		color = sc.nextLine();
		this.color = color;
		System.out.println("원하는 색상 :" + color);
	}

	public void weightChange() {
		System.out.println("원하는 무게를 입력하세요");
		Scanner sc = new Scanner(System.in);
		weight = sc.nextInt();
		this.weight = weight;
		System.out.println("변경 된 무게 : " + weight);
	}
}
