package com.mvst.edu.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mvst.edu.vo.EmployeeVO;
import com.mvst.edu.vo.PageVO;

/** 
 * EmployeeService
 * @author ysk2685
 * @since 2022.5.13
 */
public interface EmployeeService {
	/** 
	 * 직원정보 가져오는 메소드
	 * @param idx 인덱스
	 * @return 직원정보
	 */
	EmployeeVO selectByPK(int idx);
	
	/** 
	 * 직원정보 리스트 가져오는 메소드
	 * @param pageVO 페이지VO 
	 * @return 직원정보 리스트
	 */
	List<EmployeeVO> selectAll(PageVO pageVO);
	
	/** 
	 * 직원정보 가져오는 메소드
	 * @param deptid 부서번호
	 * @return 직원정보 리스트
	 */
	List<EmployeeVO> selectByDep(int deptid);
	
	/** 
	 * 직원정보 입력하는 메소드
	 * @param employeeVO 직원VO
	 */	
	int insertEmployee(EmployeeVO employeeVO);
	
	/** 
	 * 직원정보 수정 메소드
	 * @param employeeVO 직원VO
	 */
	int updateEmployee(EmployeeVO employeeVO);
		
	/** 
	 * 직원정보 삭제 메소드
	 * @param employeeVO 직원VO
	 */
	int delteEmployee(EmployeeVO employeeVO);

	/** 
	 * 직원 총합 구하는 메소드
	 * @return 전체 직원 수
	 */
	int getEmployeeCount();
}
