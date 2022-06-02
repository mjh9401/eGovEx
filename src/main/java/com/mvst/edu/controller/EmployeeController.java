package com.mvst.edu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	/** logger */
	Logger logger = LogManager.getLogger();
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
		model.addAttribute("employeeList", employeeList);

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
	 * @param response response
	 * @return view
	 * @throws IOException
	 */
	@RequestMapping("/employee/insertEmployee")
	@ResponseBody
	public ResponseEntity<String> insertEmployee(EmployeeVO employeeVO){
		EmployeeService.insertEmployee(employeeVO);
		
		String Script = "<script>"
				+ "alert('직원정보가 입력됐습니다.'); "
				+ "location.href='../employee/getEmployeeList.do';"
				+ "</script>";
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-type", "text/html;charset=utf8");
		
		return new ResponseEntity<String>(Script,responseHeaders,HttpStatus.OK);
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
	 * @param response response
	 * @return view
	 * @throws IOException
	 */
	@RequestMapping("/employee/updateEmployee")
	@ResponseBody
	public void updateEmployee(EmployeeVO employeeVO, HttpServletResponse response) throws IOException {
		EmployeeService.updateEmployee(employeeVO);

		// 메소드 실행결과를 alert창으로 띄우는 코드
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('직원정보가 수정됐습니다.'); location.href='../employee/getEmployeeList.do';</script>");
	}

	/**
	 * 직원정보 삭제 메소드
	 * @param employeeVO 직원VO
	 * @param response response
	 * @return view
	 * @throws IOException 
	 */
	@RequestMapping("/employee/deleteEmployee")
	@ResponseBody
	public void deleteEmployee(EmployeeVO employeeVO,HttpServletResponse response) throws IOException {
		EmployeeService.delteEmployee(employeeVO);
		 
		// 메소드 실행결과를 alert창으로 띄우는 코드
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<script>alert('직원정보가 삭제됐습니다.'); location.href='../employee/getEmployeeList.do';</script>");
	}

}
