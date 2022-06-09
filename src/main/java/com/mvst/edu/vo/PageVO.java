package com.mvst.edu.vo;

public class PageVO {
	// 현재페이지
	private int pageIndex = 1;
	// 페이지갯수
	private int pageUnit = 10;
	// 페이지사이즈
	private int pageSize = 10;
	// firstIndex
	private int firstIndex = 1;
	// recordCountPerpage
	private int recordCountPerPage = 10;
	// 총갯수
	private int totCnt = 0;
	// 시작데이터
	private int startData =0;
	// 종료데이터
	private int endData = 0;
	// 페이징 마지막 숫자
	private int realEnd = 0;
	// 이전, 다음버튼
	private boolean xprev,xnext;
	
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageUnit() {
		return pageUnit;
	}
	public void setPageUnit(int pageUnit) {
		this.pageUnit = pageUnit;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getFirstIndex() {
		return firstIndex;
	}
	public void setFirstIndex(int firstIndex) {
		this.firstIndex = firstIndex;
	}
	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}
	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}
	public int getTotCnt() {
		return totCnt;
	}
	public void setTotCnt(int totCnt) {
		this.totCnt = totCnt;
	}
	public int getStartData() {
		return startData;
	}
	public void setStartData(int startData) {
		this.startData = startData;
	}
	public int getEndData() {
		return endData;
	}
	public void setEndData(int endData) {
		this.endData = endData;
	}
	public int getRealEnd() {
		return realEnd;
	}
	public void setRealEnd(int realEnd) {
		this.realEnd = realEnd;
	}
	public boolean isXprev() {
		return xprev;
	}
	public void setXprev(boolean xprev) {
		this.xprev = xprev;
	}
	public boolean isXnext() {
		return xnext;
	}
	public void setXnext(boolean xnext) {
		this.xnext = xnext;
	}
	
	
	
}
