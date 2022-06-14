package com.mvst.edu.vo;

public class PageVO {
	
	// 시작 페이지
	private int startPage = 1;
	// 마지막 페이지
	private int endPage = 10;
	// 한 페이지 당 게시되는 게시글 수
	private int articlePerAPage = 10;
	// 페이징 SQL 조건절 시작 index
	private int limitStart;
	// 전체 게시글 수
	private int totalArticleCount;
	// 전체 페이지 수
	private int totalPageCount;
	
	public int getStartPage() {
		return startPage; 
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getLimitStart() {
		return limitStart;
	}
	public void setLimitStart(int limitStart) {
		this.limitStart = limitStart;
	}
	public int getArticlePerAPage() {
		return articlePerAPage;
	}
	public void setArticlePerAPage(int articlePerAPage) {
		this.articlePerAPage = articlePerAPage;
	}
	public int getTotalArticleCount() {
		return totalArticleCount;
	}
	public void setTotalArticleCount(int totalArticleCount) {
		this.totalArticleCount = totalArticleCount;
	}
	public int getTotalPageCount() {
		return totalPageCount;
	}
	public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	
	
}
