package com.kh.chap03.run;

import com.kh.chap03.model.vo.Book;
import com.kh.chap03.model.vo.ElectronicBook;
import com.kh.chap03.model.vo.LastTime;
import com.kh.chap03.model.vo.PaperBook;

public class Run {
	
	public static void main(String[] args) {
		
		Book book = new Book("�� ���� �̾ƴ� ���� �� �Ծ�����", "���� ���� �Ͽ콺"
							, "�ڿϼ�", 16650);
		
		ElectronicBook eb = new ElectronicBook("���ӳ�ȭ ���ε��", "���Ϻ�"
												, "�����", 17550, "yes24") ;
		
		PaperBook pb = new PaperBook("ȥ���", "â��"
									,"���س�", 16200, 0);
		
		System.out.println(book.information());
		System.out.println(eb.information());
		System.out.println(pb.information());
		
		System.out.println(book);
		System.out.println(book.toString());
		// toString() : �ش� ��ü�� ǮŬ������ + "@" + �ش� ��ü�� �ּҰ�(16������) : String
		System.out.println(eb);
		System.out.println(pb);
		
		LastTime lt = new LastTime();
		System.out.println(lt);
	}
}
