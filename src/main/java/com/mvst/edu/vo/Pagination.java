package com.mvst.edu.vo;

public class Pagination {
	
	// 현재 페이지번호
	private int currentPageNo;
	// 한 페이지당 게시되는 게시물 수
	private int recordCountPerPage;
	// 페이지 리스트에 게시되는 페이지 수
	private int pageSize;
	// 전체 페이지수
	private int totalRecordCount;
	// 페이지 리스트의 첫 페이지 번호
	private int firstPageNoOnPageList;
	// 페이지 리스트의 마지막 페이지 번호
	private int lastpageNoOnPageList;
	// 페이지 sql의 조건절에 시작되는 시작 rownum
	private int firstRecordIndex;
	// 페이징 마지막숫자
	private int realEnd;
	// 이전버튼
	private boolean xprev;
	// 다음버튼
	private boolean xnext;
	
	public int getCurrentPageNo() {
		return currentPageNo;
	}
	
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	
	public int getRecordCountPerPage() {
		return recordCountPerPage;
	}
	
	public void setRecordCountPerPage(int recordCountPerPage) {
		this.recordCountPerPage = recordCountPerPage;
	}
	
	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
	public int getTotalRecordCount() {
		return totalRecordCount;
	}
	
	public void setTotalRecordCount(int totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}
	
	/** 
	 * 페이지 리스트의 첫 페이지 번호 주는 메소드
	 * @return firstPageNoOnPageList 페이지 리스트 첫 페이지 번호
	 */
	public int getFirstPageNoOnPageList() {
		lastpageNoOnPageList = (int) (Math.ceil(getCurrentPageNo()/10.0)*10);
		firstPageNoOnPageList = lastpageNoOnPageList -9;
		
		return firstPageNoOnPageList;
	}
	
	public void setFirstPageNoOnPageList(int firstPageNoOnPageList) {
		this.firstPageNoOnPageList = firstPageNoOnPageList;
	}
	
	/** 
	 * 페이지 리스트 마지막 페이지 번호 주는 메소드
	 * @return lastpageNoOnPageList 페이지 리스트 마지막 페이지 번호
	 */
	public int getLastpageNoOnPageList() {
		lastpageNoOnPageList = (int) (Math.ceil(getCurrentPageNo()/10.0)*10);
		int realEnd = (int) Math.ceil(getTotalRecordCount()/getRecordCountPerPage());
		
		if(realEnd < lastpageNoOnPageList) {
			lastpageNoOnPageList = realEnd;
		}
		
		return lastpageNoOnPageList;
	}
	
	public void setLastpageNoOnPageList(int lastpageNoOnPageList) {
		this.lastpageNoOnPageList = lastpageNoOnPageList;
	}
	
	/** 
	 * sql 조건절 시작 rownum 주는 메소드
	 * @return firstRecordIndex rownum
	 */
	public int getFirstRecordIndex() {
		firstRecordIndex = (getCurrentPageNo()-1) * getRecordCountPerPage();
		
		return firstRecordIndex;
	}
	
	public void setFirstRecordIndex(int firstRecordIndex) {
		this.firstRecordIndex = firstRecordIndex;
	}
	
	/** 
	 * 페이징 마지막숫자 주는 메소드
	 * @return realEnd 페이징 마지막 숫자
	 */
	public int getRealEnd() {
		
		realEnd = (int) Math.ceil(getTotalRecordCount()/getRecordCountPerPage());
		
		return realEnd;
	}
	
	public void setRealEnd(int realEnd) {
		this.realEnd = realEnd;
	}
	
	/** 
	 * 이전버튼 상태 주는 메소드
	 * @return xprev 이전버튼 상태
	 */
	public boolean getXprev() {
		xprev = getFirstPageNoOnPageList() > 1 ;
		return xprev;
	}
	
	public void setXprev(boolean xprev) {
		this.xprev = xprev;
	}
	
	/** 
	 * 다음버튼 상태 주는 메소드 
	 * @return xnext 다음버튼 상태
	 */
	public boolean getXnext() {
		
		int realEnd = (int) Math.ceil(getTotalRecordCount()/getRecordCountPerPage());
		xnext = getLastpageNoOnPageList() < realEnd;
		
		return xnext;
	}
	
	public void setXnext(boolean xnext) {
		this.xnext = xnext;
	}
	
	
	
	
	

}
