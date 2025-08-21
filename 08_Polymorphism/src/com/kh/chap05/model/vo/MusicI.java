package com.kh.chap05.model.vo;
/*
 * Interface
 * 
 * [ 표현법 ]
 * 
 * 접근제한자 interface 인터페이스식별자 {
 * 
 * 		// 상수 필드
 *		// 메소드
 * } 
 * 
 * 구체 클래스
 * 추상 클래스
 * 인터페이스
 * 
 * - 추상클래스보다 더욱 가안 규칙성, 강제성을 가짐
 * 
 * - 인터페이스의 필드는 상수 필드
 * 
 * - 인터페이스의 메소드 키워드를 붙이지 않는 이상 추상메소드
 * 
 * - 인터페이스는 다중 구현을 허용한다
 * 
 * - 무조건 구현해야하는 기능이 있을 경우 인터페이스를 사용해서
 * 	 사용법만 만들어주고 구현하는 쪽에서 실체화를 만듬 ==> 오버라이딩
 */
public interface MusicI {

	// 인터페이스로는 객체 생성이 불가능하기 때문에 생성자를 기술할 수 없음
	// public MusicI() {}
	
	/*public static final*/ int NUM = 1;
	// 인터페이스의 모든 필드들은 암묵적으로 public static final
	/*
	public void hi() {
		
	}
	\*/

	/*public abstract*/ void play();
	// 인터페이스의 메소드들은 기본적으로 추상메소드
	void stop();
	
}

