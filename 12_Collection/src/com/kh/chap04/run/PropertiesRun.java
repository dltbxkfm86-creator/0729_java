package com.kh.chap04.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap04.model.vo.Fish;

public class PropertiesRun {
	
	public static void main(String[] args) {
		
		// Properties : Map�迭 -> key + Value��Ʈ�� ������
		// �ܺ����Ͽ� ��/����� �ϱ����� �뵵
		// => .properties ���Ϸ� ��/���
		// �������� �ʴ� ��������
		// �ش� ���α׷��� �⺻������ ������ �� �������� ��� ����
		Properties prop = new Properties();
		MyProperties myProp = new MyProperties();
		prop.put("Ű", new Fish());
		// myProp.put
		System.out.println(prop);
		
		prop.setProperty("List", "ArrayList");
		prop.setProperty("set", "HashSet");
		
		System.out.println(prop);
		
		try {
			// store(OutputStream os, String comment) : ���Ͽ� ����� �� ��
			//prop.store(new FileOutPutStream("test.properties"), "���������");
			
			// �Է�
			// load(inputStream is) : �Է� ���� �� ��
			//prop.load(new FileInputStream("test.properties"));
			//System.out.println(prop.get("Map"));
			
			// XML�� ���
			prop.storeToXML(new FileOutputStream("test.xml"), null);
			
			// XML���� �Է� loadFormXML(InputStream is);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
