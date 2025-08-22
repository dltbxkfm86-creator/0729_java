package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		
		list.add(music);
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(music);
		return 1;
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for(Music music : list) {
			if(music.getTitle().equals(title)) {
				return music;
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}

		} return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				Music originalMusic = list.get(i);
				list.set(i, originalMusic);
				return originalMusic;
			}
		}
		return null;
	}
	
	public int ascTitle() {
		Collections.sort(list);
		return 1;
	}
	
	public int descSinger() {
		Collections.sort(list, new Comparator<Music>() {
			@Override

		}
	
	}
}

