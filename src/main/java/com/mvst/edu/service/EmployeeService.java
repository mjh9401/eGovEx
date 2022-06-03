package com.mvst.edu.service;

import java.util.List;

import com.mvst.edu.vo.EmployeeVO;

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
	 * @return 직원정보 리스트
	 */
	List<EmployeeVO> selectAll();
	
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
	public int insertEmployee(EmployeeVO employeeVO);
	
	/** 
	 * 직원정보 수정 메소드
	 * @param employeeVO 직원VO
	 */
	public int updateEmployee(EmployeeVO employeeVO);
		
	/** 
	 * 직원정보 삭제 메소드
	 * @param employeeVO 직원VO
	 */
	public int delteEmployee(EmployeeVO employeeVO);
}
