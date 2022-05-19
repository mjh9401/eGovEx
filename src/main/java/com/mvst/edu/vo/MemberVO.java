package com.mvst.edu.vo;

public class MemberVO {
	private int idx;
	private String name;
	private int deptId;
	
	public MemberVO() {}
	
	public MemberVO(int idx,String name,int deptId) {
		this.idx = idx;
		this.name = name;
		this.deptId = deptId;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	
}
