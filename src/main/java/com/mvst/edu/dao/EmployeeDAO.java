package com.mvst.edu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mvst.edu.vo.EmployeeVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

/** 
 * 직원DAO
 * @author mjh9401
 * @since 2022.05.24
 */
@Mapper("employeeDAO")
public interface EmployeeDAO {
	/**
	 * 직원 정보 가져오는 메소드
	 * @param idx 인덱스
	 * @return 직원정보
	 */
	EmployeeVO selectByPK(@Param("idx") int idx);
	
	/** 
	 * 전체 직원 정보 가져오는 메소드
	 * @return 직원정보 리스트
	 */
	List<EmployeeVO> selectAll();
	
	/** 
	 * 직원 정보 가져오는 메소드
	 * @param deptId
	 * @return 직원정보
	 */
	EmployeeVO selectByDep(@Param("deptid") int deptId);
	
	/** 
	 * 직원 정보 입력 메소드
	 * @param name 이름
	 * @param deptid 부서번호
	 */
	void insertEmployee(@Param("name") String name,@Param("deptid") int deptid);
	
	/** 
	 * 직원 정보 수정 메소드
	 * @param idx 인덱스
	 * @param name 이름
	 * @param deptid 부서번호
	 */
	void updateEmployee(@Param("idx") int idx,@Param("name") String name,@Param("deptid") int deptid);
	
	/** 
	 * 직원 정보 삭제 메소드
	 * @param idx 인덱스
	 */
	void delteEmploee(@Param("idx") int idx);
}
