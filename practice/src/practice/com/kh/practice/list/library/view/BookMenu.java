package practice.com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import practice.com.kh.practice.list.library.controller.BookController;
import practice.com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	
	BookController bc = new BookController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("== Welcome KH Library ==");
			
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻� ��ȸ");
			System.out.println("4. ���� ����");
			System.out.println("5. ���� �� �������� ����");
			System.out.println("9. ����");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			
			case 1 : insertBook(); break;
			case 2 : selectList(); break;
			case 3 : searchBook(); break;
			case 4 : deleteBook(); break;
			case 5 : ascBook(); break;
			case 9 : System.out.println("���α׷��� �����մϴ�"); break;
			default : System.out.println("�� �� �Է��ϼ̽��ϴ�. �ٽ��Է����ּ���"); break;
			
			}
		}
		
		
	}
	
	public void insertBook() {
			System.out.println("===== �� ���� �߰� =====");
			System.out.println("å ������ �Է����ּ���");
			
			System.out.println("���� �� : " );
			String title = sc.nextLine();
			System.out.println("���� �� : " );
			String author = sc.nextLine();
			System.out.println("�帣(1. �ι� / 2. ���� / 3. �ܱ��� / 4. ��Ÿ)");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			String category = null;
			switch(menuNo) {
			case 1 : category = "�ι�"; break;
			case 2 : category = "����"; break;
			case 3 : category = "�ܱ���"; break;
			case 4 : category = "��Ÿ"; break;
			}
			
			System.out.println("���� : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			Book book = new Book(title, author, category, price);
			bc.insertBook(book);
		}
	

	public void selectList() {
		System.out.println("===== ���� ��ü ��ȸ =====");
		ArrayList<Book> booklist =  bc.selectList();
		
		if (booklist.isEmpty()) {
			System.out.println("�����ϴ� ������ �����ϴ�");
		} else {
			for(Book book : booklist) {
				System.out.println(book);
			}
		}
	}
	
	public void searchBook() {
		System.out.println("===== ���� �˻� =====");
		System.out.println("�˻� Ű���� : ");
		String keyword = sc.nextLine();
		
		ArrayList<Book> searchList = bc.searchBook(keyword);
		
		if (searchList.isEmpty()) {
			System.out.println("�˻� ����� �����ϴ�");
		} else {
			for (Book book : searchList) {
				System.out.println(book);
			}
		}
	}
	
	public void deleteBook() {
		System.out.println("===== ���� ���� ======");
		System.out.println("������ ������ : ");
		String title = sc.nextLine();
		
		System.out.println("������ ���ڸ� :");
		String author = sc.nextLine();
		
		Book remove = bc.deleteBook(title, author);
		
		if(remove != null) {
			System.out.println("���������� �����Ǿ����ϴ�");
		} else {
			System.out.println("������ ������ ã�� ���߽��ϴ�");
		}
	}
	
	public void ascBook() {
		System.out.println("===== ���� �������� ���� ======");
		int result = bc.ascBook();
		
		if(result == 1) {
			System.out.println("���Ŀ� �����Ͽ����ϴ�");
		} else {
			System.out.println();
		}
	}
}
