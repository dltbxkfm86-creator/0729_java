package com.kh.idol.model.vo;

public class Board {
	
	private int boardNo;
	private String boradTitle;
	private String boardContent;
	private String userId;
	private String createDate;
	
	/*
	 * 力格
	 * 郴侩
	 * 累己磊
	 * 累己老
	 * 
	 * 
	 */
	
	public Board() {	
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Board(int boardNo, String boradTitle, String boardContent, String userId, String createDate) {
		super();
		this.boardNo = boardNo;
		this.boradTitle = boradTitle;
		this.boardContent = boardContent;
		this.userId = userId;
		this.createDate = createDate;
	}


	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getBoradTitle() {
		return boradTitle;
	}

	public void setBoradTitle(String boradTitle) {
		this.boradTitle = boradTitle;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	
	
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", boradTitle=" + boradTitle + ", boardContent=" + boardContent
				+ ", userId=" + userId + ", createDate=" + createDate + "]";
	}

	

	
	
}
