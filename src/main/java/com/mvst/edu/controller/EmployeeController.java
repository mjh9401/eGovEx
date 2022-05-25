package com.mvst.edu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mvst.edu.service.EmployeeService;
import com.mvst.edu.vo.EmployeeVO;

/** 
 * 직원컨트롤러
 * @author ysk2685
 * @since 2022.5.13
 */
@Controller
public class EmployeeController {
	/** logger*/
	Logger logger = LogManager.getLogger(); 
	/** EmployeeService*/
	@Resource(name="EmployeeService")
	private EmployeeService EmployeeService;

	
	/** 
	 * 인덱스로 직원정보 찾는 메소드
	 * @param model 모델
	 * @param idx 인덱스
	 * @return view
	 */
	@RequestMapping("/employee/getEmployee")
	public String searchEmployeeByIdx(Model model,int idx) {
		EmployeeVO employeeVO = EmployeeService.selectByPK(idx);
		model.addAttribute("employee", employeeVO);
		
		return "employee/detail";
	}
	
	/** 
	 * 전체 직원정보를 가져오는 메소드
	 * @param model 모델
	 * @return view
	 */
	@RequestMapping("/employee/getEmployeeList")
	public String employeeListSearchByIdx(Model model) {
		List<EmployeeVO> employeeList = EmployeeService.selectAll();
		model.addAttribute("employeeList", employeeList);
		
		return "employee/list";
	}
	
	/** 
	 * 부서번호로 직원정보를 찾는 메소드
	 * @param deptId 부서번호
	 * @param model 모델
	 * @return view
	 */
	@RequestMapping("/employee/getEmployeeByDep")
	public String searchEmployeeByDepid(int deptId,Model model) {
		EmployeeVO employeeVO = EmployeeService.selectByDep(deptId);
		model.addAttribute("employee", employeeVO);
		
		return "employee/detail";
	}
	
	/** 
	 * 직원정보 추가 페이지이동 메소드
	 * @return view
	 */
	@RequestMapping("/employee/showInsertingEmployee")
	public String showInsertingEmployee() {
		
		return "employee/insert";
	}
	
	
	/** 
	 * 직원정보 추가 메소드
	 * @param name
	 * @param deptid
	 * @return view
	 */
	@RequestMapping("/employee/insertEmployee")
	@ResponseBody
	public String insertEmployee(String name,int deptid) {
		EmployeeService.insertEmployee(name, deptid);
		
		return "Success";
	}
	
	/** 
	 * 직원정보 수정페이지로 이동하는 메소드
	 * @return view
	 */
	@RequestMapping("/employee/showUpdatingEmployee")
	public String showUpdatingEmployee(Model model,int idx, String name,int deptid) {
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setDeptid(deptid);
		employeeVO.setIdx(idx);
		employeeVO.setName(name);
		
		model.addAttribute("employeeVO", employeeVO);
		
		return "employee/update";
	}
	
	
	/** 
	 * 직원정보 수정메소드
	 * @param idx 인덱스
	 * @param name 이름
	 * @param deptid 부서번호
	 * @return view
	 */
	@RequestMapping("/employee/updateEmployee")
	@ResponseBody
	public String updateEmployee(int idx,String name,int deptid) {
		EmployeeService.updateEmployee(idx, name, deptid);
		
		return "Success";
	}
	
	
	/** 
	 * 직원정보 삭제 메소드
	 * @param idx 인덱스
	 * @return view
	 */
	@RequestMapping("/employee/deleteEmployee")
	@ResponseBody
	public String deleteEmployee(int idx) {
		EmployeeService.delteEmployee(idx);
		
		return "Success";
	}

}
