package com.mvst.edu.vo;


public class EmployeeVO {
	/** 인덱스 (idx, smallint, nullable:NO) */
	private int idx;
	/** 이름 (name, character varying, nullable:NO) */
	private String name;
	/** 부서이름 (deptid, integer, nullable:NO) */
	private int deptid;
	
	
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
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	
	
}
