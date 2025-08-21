package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	public int[] personCount() {
		int[] s= new int[3];
		
		for(int i = 0; i<s.length; i++) {
			if(s[i] != 0) {
				s[i]++;
			} return s;
		} 
		
		int[] e = new int[10];
		
		for(int i = 0; i<e.length; i++) {
			if(e[i] != 0) {
				e[i]++;
			} 
		} return e;
		
	}
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
	}
	
	//public Employee[] printEmployee() {
		
	//}
}
