package com.kh.chap05.constructor.mode.vo;

import java.util.Scanner;

public class Homework1 {
	public String name;
	public String color;
	public int weight;

	public void colorChange() {
		System.out.println("���ϴ� ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		color = sc.nextLine();
		this.color = color;
		System.out.println("���ϴ� ���� :" + color);
	}

	public void weightChange() {
		System.out.println("���ϴ� ���Ը� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		weight = sc.nextInt();
		this.weight = weight;
		System.out.println("���� �� ���� : " + weight);
	}
}
