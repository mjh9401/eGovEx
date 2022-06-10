package com.mvst.edu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mvst.edu.vo.EmployeeVO;
import com.mvst.edu.vo.PageVO;

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
	 * @param pageVO 페이지VO
	 * @return 직원정보 리스트
	 */
	List<EmployeeVO> selectAll(PageVO pageVO);
	
	/** 
	 * 직원 정보 가져오는 메소드
	 * @param deptId 부서번호
	 * @return 직원정보 리스트
	 */
	List<EmployeeVO> selectByDep(@Param("deptid") int deptId);
	
	/** 
	 * 직원 정보 입력 메소드
	 * @param employeeVO 직원VO
	 */
	int insertEmployee(EmployeeVO employeeVO);
	
	/** 
	 * 직원 정보 수정 메소드
	 * @param employeeVO 직원VO
	 */
	int updateEmployee(EmployeeVO employeeVO);
	
	/** 
	 * 직원 정보 삭제 메소드
	 * @param employeeVO 직원VO
	 */
	int delteEmploee(EmployeeVO employeeVO);

	/** 
	 * 직원 총합 구하는 메소드
	 * @return 직원 초합
	 */
	int getEmployeeCount();
}
