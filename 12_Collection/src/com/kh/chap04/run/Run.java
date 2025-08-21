package com.kh.chap04.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap04.model.vo.Fish;

public class Run {
	public static void main(String[] args) {
		// Map
		// list set map�� �����
		// Key + Value ��Ʈ�� ����
		
		// HashMap
		// [ ǥ���� ]
		// Map ��ü�̸� = new HashMap();
		
		// Ű	== �ĺ��� => �����̸�
		// ���  == ������ü
		
		Map<String, Fish> aquarium = new HashMap();
		
		// ����ִ� �ʿ� ��Ҹ� �߰��غ���
		// List, Set => add()
		// Collection�� ������ Ŭ����
		
		// HashMap -> put()
		// => key + value �Բ� ��ҷ� �߰�
		
		// 1.put(K key, V value) : Map�� key + value��Ʈ�� ��ҷ� �߰�����
		aquarium.put("���", new Fish("�ܸ�", "ȸ"));
		aquarium.put("����", new Fish("�⸧��", "ȸ"));
		aquarium.put("����", new Fish("����� ��", "������ũ"));
		aquarium.put("����", new Fish("������", "����"));
		aquarium.put("�ޱ�", new Fish("���", "�ſ���"));
		
//		System.out.println(aquarium); // ���� ���� ���� X
//		aquarium.put("��ġ", new Fish("�⸧��", "ȸ"));
//		System.out.println(aquarium); // Value���� ��� �ߺ� ���� O
//		aquarium.put("��ġ", new Fish("��ĥ��", "���丶Ű"));
//		System.out.println(aquarium); // key == �ĺ��� --> �ߺ��� �߻��ϸ� �������
		
		// 2. get(Object key) : Object
		// ���޵� key���� �ش��ϴ� value���� ��ȯ���ִ� �޼ҵ�
		// key -> value�� ã�ƿ�
		
		System.out.println(aquarium.get("���"));
		System.out.println(aquarium.get("�ޱ�"));
		System.out.println(aquarium.get("����"));
		
		
		// 3. size() : Map�� ����ִ� ����� ����
		System.out.println(aquarium.size());
		
		// 4. replace(K key, V value) : Ű������ ��Ҹ� ã�Ƽ� Value���� �ٲ�
		aquarium.replace("��ġ", new Fish("����Ѹ�", "����"));
		
		aquarium.replace("���°�", null);
		System.out.println(aquarium); 
		// ������ �������� �ʴ� Ű���� ���ڷ� �����ϸ� �߰����� �ʴ� �ٴ� ���� put���� ������
		
		// 5. remove(Object key) => �ش� Ű ���� ã�Ƽ� => Ű + ��� ��Ʈ�� �����ִ� �޼ҵ�
		aquarium.remove("��ġ");
		
		System.out.println(aquarium);
		
		System.out.println("====================================================");
		
		// Map�� ����ִ� ��� ��ҵ鿡 ���������� �����ؾ� �Ѵٸ�?
		// for�� X, ���� for�� X, while X
		// addAll(Collection c) => X
		// Iterator => X 	set�� ����
		
		aquarium.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});
		
		// Map�� Key - Value�� ������ �ִµ�
		// key���鸸 Set���� �ٲ� �� ����
		// Set���� �ٲٸ� Iterator�� ����� �� �ֱ� ������ �ݺ�
		
		// 1) keySet() ȣ���ϱ�
		
		// 1_1> Map�� ������ �ִ� Key�鸸 Set�� ��´�
		Set<String> fishSet = aquarium.keySet();
		System.out.println(fishSet);
		
		// 1_2 > Set�� Iterator�� ���
		Iterator<String> itkey = fishSet.iterator();
		
		// 1_3 > �ݺ��� ����ϱ�
		while(itkey.hasNext()) {
			String key = itkey.next();
			System.out.println(key + "------" + aquarium.get(key));
		}
		
		System.out.println("=====================================");

		// 2) entrySet()�� �̿��ϴ� ���
		
		// 2_1> Map�� ������ �ִ� key-Value��Ʈ�� Set�� ���
		
		
		Set<Entry<String, Fish>> entrySet = aquarium.entrySet();	
		
		System.out.println(entrySet);
		
		for(Entry<String, Fish> e : entrySet) {
			System.out.println(e.getKey() + ":::::" + e.getValue());
		}
		
		
		
		
		
		
		
	}
}
