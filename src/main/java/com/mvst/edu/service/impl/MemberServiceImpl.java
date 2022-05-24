package com.mvst.edu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mvst.edu.dao.EmployeeDAO;
import com.mvst.edu.service.MemberService;
import com.mvst.edu.vo.EmployeeVO;

/** 
 * MemberService 구현체
 * @author mjh9401
 * @since 2022 05 24
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {
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
	public EmployeeVO selectByDep(int deptid) {
		EmployeeVO employeeVO = employeeDao.selectByDep(deptid);
		
		return employeeVO;
	}

	@Override
	public void insertEmployee(String name, int deptid) {
		employeeDao.insertEmployee(name, deptid);
	}

	@Override
	public void updateEmployee(int idx, String name, int deptid) {
		employeeDao.updateEmployee(idx, name, deptid);
		
	}

	@Override
	public void delteEmployee(int idx) {
		employeeDao.delteEmploee(idx);
	}
	


}
