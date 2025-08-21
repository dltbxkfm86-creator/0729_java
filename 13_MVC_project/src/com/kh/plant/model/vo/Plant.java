package com.kh.plant.model.vo;


// Model : ������ ���� �۾�
// VO : ���α׷� ���� �� ������� ��(Value)�� ���� ��ü(Object)
public class Plant {
	private String name;
	private String type;

	// VO ����� ����
	// �⺻������, �Ű�����������, getter, setter, toString
	// Alt + Shift + s => o => Alt + d => Alt + g

	public Plant() {
		super();
	}

	// Alt + Shift + s => o => Alt + d => Alt + g

	public Plant(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	// Alt + Shift + s = > r => Alt + a => Alt + r

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	// Alt + Shift + s => s => Alt + g
	@Override
	public String toString() {
		return "Plant [name=" + name + ", type=" + type + "]";
	}
	

}
