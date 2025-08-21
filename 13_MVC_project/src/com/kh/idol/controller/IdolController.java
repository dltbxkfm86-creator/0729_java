package com.kh.idol.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.idol.model.Idol;
import com.kh.idol.model.vo.Board;
import com.kh.idol.model.vo.Fan;

public class IdolController {
	
	private List<Fan> fans = new ArrayList();
	private List<Board> boards = new ArrayList();
	private List<Idol> aespa = new ArrayList();
	
	{
		aespa.add(new Idol("카리나", "리더", "Rocket puncher"));
		aespa.get(0).setImage("""
				
				
				카리나
				
				
				""");
		aespa.add(new Idol("지절","외국인", "다개국어"));
		aespa.get(1).setImage("""
				
				
				지젤
				
				
				""");
		aespa.add(new Idol("윈터", "불자", "Armamenter"));
		aespa.get(2).setImage("""
				
				
				윈터
				
				
				""");
		aespa.add(new Idol("닝닝", "외국인2","E.D Hacker" ));
		aespa.get(3).setImage("""
				
				닝닝
				
				""");
	}

	public List<Idol> findAll() {
		// TODO Auto-generated method stub
		return aespa;
	}
	
	// 아이돌들도 어디에 담아놓고 그걸 읽어와서 정보를 출력해줘야 함
	public List<Idol> findMember(int Member) {
		return aespa.get(memberNo -1); 
	}
	
	// 사용자가 아이디를 입력했을 때 입력한 아이디가
	// Fan들이 들어가는 List의 요소의 userId필드값과 중복되는 게 있는지
	// 확인을 한 뒤에 결과를 View로 다시 반환
	
	public boolean checkId(String userId) {
		
		// 1. userId
		// 2. fans
		// 3. fans.get(i).getUserId()
		// 4. equals()
		
		for(int i = 0; i < fans.size(); i++) {
			if(userId.equals(fans.get(i).getUserId())) {
				return true;
			}
		}
		return false;
	}
	
	// 사용자가 입력한 아이디, 비밀번호, 닉네임을 가지고
	// 새로운 Fan이라는 객체를 생성하면서 필드에 값을 대입해주고
	// 생성된 Fan객체의 주소값을 내가 가지고 있는 Fan들이 들어가는 List의 요소로
	// 추가를 해주는 메소드를 구현을 해야 함
	
	public boolean signUp(String userId, String userPwd, String nickName) {
		
		// 1. 데이터 가공
		Fan fan = new Fan(userId, userPwd, nickName);
		
		// 2. 요청 처리(아직 요청 처리하는 계층을 안배웠으므로 컨트롤러에서 처리)
		boolean result = checkId(userId);
		
		if(!result) {
			fans.add(fan);
		}
		
		// 3. 결과값 반환
		return result;

	}


}
