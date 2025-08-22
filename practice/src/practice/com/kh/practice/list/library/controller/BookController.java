package practice.com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import practice.com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private List<Book> list = new ArrayList();
	
	public BookController() {
		list.add(new Book("�ڹ��� ����", "���� ��", "��Ÿ", 20000));
		list.add(new Book("���� ���� �˰���", "������", "��Ÿ", 15000));
		list.add(new Book("��ȭ�� ���", "������", "�ι�", 17500));
		list.add(new Book("�� ������", "�ڽſ�", "�Ƿ�", 21000));
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	public ArrayList selectList() {
		return new ArrayList<>(list);
	}
	
	public ArrayList<Book> searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<>();
		for(Book book : list) {
			if(book.getTitle().contains(keyword)) {
				searchList.add(book);
			}
		}
		return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;
		for(int i = 0; i < list.size(); i++) {
			Book book = list.get(i);
			if(book.getTitle().equals(title) && book.getAuthor().equals(author)) {
				removeBook = list.remove(i);
				break;				
			}
		}
		return removeBook;
	}
	
	public int ascBook() {
		Collections.sort(list);
		return 1;
	}
	
}
