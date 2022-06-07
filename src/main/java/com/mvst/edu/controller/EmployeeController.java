package com.mvst.edu.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvst.edu.service.EmployeeService;
import com.mvst.edu.vo.EmployeeVO;

/**
 * 직원컨트롤러
 * @author ysk2685
 * @since 2022.5.13
 */
@Controller
public class EmployeeController {
	/** logger */
	//Logger logger = LogManager.getLogger();
	/** EmployeeService */
	@Resource(name = "EmployeeService")
	private EmployeeService EmployeeService;


	/**
	 * 인덱스로 직원정보 찾는 메소드
	 * @param model 모델
	 * @param idx   인덱스
	 * @return view
	 */
	@RequestMapping("/employee/getEmployee")
	public String searchEmployeeByIdx(Model model, int idx) {
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
		Date date = new java.util.Date();
		
		model.addAttribute("employeeList", employeeList);
		model.addAttribute("date", date);
		
		return "employee/list";
	}

	/**
	 * 부서번호로 직원정보를 찾는 메소드
	 * @param deptId 부서번호
	 * @param model  모델
	 * @return view
	 */
	@RequestMapping("/employee/getEmployeeByDep")
	public String searchEmployeeByDepid(Model model,int deptId) {
		List<EmployeeVO> employeeList = EmployeeService.selectByDep(deptId);
		model.addAttribute("employeeList", employeeList);

		return "employee/deptidList";
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
	 * @param employeeVO 직원VO
	 * @param model 모델
	 * @return view
	 */
	@RequestMapping("/employee/insertEmployee")
	public String insertEmployee(Model model,EmployeeVO employeeVO){
		int resultInsertNumber = EmployeeService.insertEmployee(employeeVO);
		
		if(resultInsertNumber > 0) {
			model.addAttribute("resultInesrtNumber", resultInsertNumber);
		} else {
			model.addAttribute("resultInsertNubmer", null);			
		}
		
		return "employee/result";
	}

	/**
	 * 직원정보 수정페이지로 이동하는 메소드
	 * @param employeeVO 직원VO
	 * @param model 모델
 	 * @return view
	 */
	@RequestMapping("/employee/showUpdatingEmployee")
	public String showUpdatingEmployee(Model model,EmployeeVO employeeVO) {
		model.addAttribute("employeeVO", employeeVO);

		return "employee/update";
	}

	/**
	 * 직원정보 수정메소드
	 * @param employeeVO 직원VO
	 * @param model 모델
	 * @return view
	 */
	@RequestMapping("/employee/updateEmployee")
	public String updateEmployee(Model model,EmployeeVO employeeVO){
		int resultUpdateNumber = EmployeeService.updateEmployee(employeeVO);
		
		if(resultUpdateNumber > 0) {
			model.addAttribute("resultUpdateNumber", resultUpdateNumber);
		}else {
			model.addAttribute("resultUpdateNumber",null);
		}
		
		return "employee/result";
	}

	/**
	 * 직원정보 삭제 메소드
	 * @param employeeVO 직원VO
	 * @param model 모델
	 * @return view
	 */
	@RequestMapping("/employee/deleteEmployee")
	public String deleteEmployee(Model model,EmployeeVO employeeVO){
		int resultDeleteNumber= EmployeeService.delteEmployee(employeeVO);

		if(resultDeleteNumber > 0) {
			model.addAttribute("resultDeleteNumber", resultDeleteNumber);
		}else {
			model.addAttribute("resultDeleteNumber",null);
		}
		
		return "employee/result";
	}

}
