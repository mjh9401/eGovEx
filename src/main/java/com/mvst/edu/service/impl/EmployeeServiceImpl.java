package com.mvst.edu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mvst.edu.dao.EmployeeDAO;
import com.mvst.edu.service.EmployeeService;
import com.mvst.edu.vo.EmployeeVO;

/** 
 * EmployeeService 구현체
 * @author mjh9401
 * @since 2022 05 24
 */
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
	/**EmployeeDAO*/
	@Resource(name="employeeDAO")
	private EmployeeDAO employeeDao;

	@Override
	public EmployeeVO selectByPK(int idx) {
		EmployeeVO employeeVO = employeeDao.selectByPK(idx);
		
		return employeeVO;
	}

	@Override
	public List<EmployeeVO> selectAll() {
		
		
		List<EmployeeVO> employeeList = employeeDao.selectAll();
		
		return employeeList;
	}

	@Override
	public List<EmployeeVO> selectByDep(int deptid) {
		List<EmployeeVO> employeeList = employeeDao.selectByDep(deptid);
		
		return employeeList;
	}

	@Override
	public int insertEmployee(EmployeeVO employeeVO) {
		int reusltNum= employeeDao.insertEmployee(employeeVO);
		
		return reusltNum;
	}

	@Override
	public int updateEmployee(EmployeeVO employeeVO) {
		int updateNum = employeeDao.updateEmployee(employeeVO);
		
		return updateNum;
	}

	@Override
	public int delteEmployee(EmployeeVO employeeVO) {
		int deleteNum = employeeDao.delteEmploee(employeeVO);
		
		return deleteNum;
	}

	@Override
	public int getEmployeeCount() {
		int totalEmployeeCount = employeeDao.getEmployeeCount();
		
		return totalEmployeeCount;
	}
	


}
