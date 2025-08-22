package com.kh.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("******* ���� �޴� *******");
			System.out.println("1. ������ ��ġ�� �� �߰�");
			System.out.println("2. ù ��ġ�� �� �߰� ");
			System.out.println("3. ��ü �� ��� ���");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ���� ����");
			System.out.println("7. ��� �������� ����");
			System.out.println("8. ������ �������� ����");
			System.out.println("9. ����");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1 : addList(); break;
			case 2 : addAtZero(); break;
			case 3 : printAll(); break;
			case 4 : searchMusic(); break;
			case 5 : removeMusic(); break;
			case 6 : setMusic(); break;
			case 7 : ascTitle(); break;
			case 8 : descSinger(); break;
			case 9 : System.out.println("����"); break;
			
			}
		}
	}
	
	public void addList() {
		System.out.println("****** ������ ��ġ�� �� �߰� ****** ");
		System.out.println("�� �� : ");
		String title = sc.nextLine();
		System.out.println("���� �� : ");
		String singer = sc.nextLine();
	
		Music music = new Music(title, singer);
		int result = mc.addList(music);
		
		if(result == 1) {
			System.out.println("�߰� ����");
		} else {
			System.out.println("�߰� ����");
		}
	}
	
	public void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.println("�� �� :");
		String title = sc.nextLine();
		System.out.println("���� �� : ");
		String singer = sc.nextLine();
		
		Music music = new Music(title, singer);
		
		int result = mc.addAtZero(music);
		
		if (result == 1) {
			System.out.println("�߰� ����");
		} else {
			System.out.println("�߰� ����");
		}
		
	}
	
	public void printAll() {
		System.out.println("****** ��ü �� ��� ��� ******");
		List<Music> musiclist = mc.printAll();
		System.out.println(musiclist);
	}
	
	public void searchMusic() {
		System.out.println("****** Ư�� �� �˻� ******");
		System.out.println("�� �̸� : ");
		String title = sc.nextLine();
		
		Music result = mc.searchMusic(title);
		
		if(result == null) {
			System.out.println("�˻��� ���� �����ϴ�");
		} else {
			System.out.println("�˻��� ���� " + result + "�Դϴ�");
		}
	}
	
	public void removeMusic() {
		System.out.println("****** Ư�� �� ���� ******");
		System.out.println("���� �� �� : ");
		String titile = sc.nextLine();
		
		Music result = mc.removeMusic(titile);
		
		if(result == null) {
			System.out.println("������ ���� �����ϴ�");
		} else {
			System.out.println(result);
		}
	}
	
	public void setMusic() {
		System.out.println("****** Ư�� �� ���� ���� ******");
		System.out.println("�˻��� �� �� : ");
		String searchTitle = sc.nextLine();
		System.out.println("������ �� ��");
		String newTitle = sc.nextLine();
		System.out.println("������ ���� �� : ");
		String newSinger = sc.nextLine();
		
		
		Music newMusic = new Music(newTitle, newSinger);
		Music result = mc.setMusic(searchTitle, newMusic);
		
		if(result == null) {
			System.out.println("������ ���� �����ϴ�");
		} else {
			System.out.println(result + "�� ���� ����Ǿ����ϴ�");
		}
	}
	
	public void ascTitle() {
		System.out.println("****** ���� �� �������� ���� ******");
		int result = mc.ascTitle();
		
		if(result == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}
	
	public void descSinger() {
		int result = mc.descSinger();
		
		if(result == 1) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
	}
}
