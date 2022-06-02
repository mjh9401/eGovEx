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
	/*EmployeeDAO*/
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
	public void insertEmployee(EmployeeVO employeeVO) {
		employeeDao.insertEmployee(employeeVO);
	}

	@Override
	public void updateEmployee(EmployeeVO employeeVO) {
		employeeDao.updateEmployee(employeeVO);
	}

	@Override
	public void delteEmployee(EmployeeVO employeeVO) {
		employeeDao.delteEmploee(employeeVO);
	}
	


}
