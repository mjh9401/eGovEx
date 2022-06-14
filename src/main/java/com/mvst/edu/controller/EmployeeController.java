package com.mvst.edu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvst.edu.service.EmployeeService;
import com.mvst.edu.vo.EmployeeVO;
import com.mvst.edu.vo.PageVO;

/**
 * 직원컨트롤러
 * @author mjh
 * @since 2022.5.13
 */
@Controller
public class EmployeeController {
	/** logger */
	//Logger logger = LogManager.getLogger();
	/** EmployeeService */
	@Resource(name = "EmployeeService")
	private EmployeeService employeeService;


	/**
	 * 인덱스로 직원정보 찾는 메소드
	 * @param model 모델
	 * @param idx   인덱스
	 * @return view
	 */
	@RequestMapping("/employee/getEmployee")
	public String searchEmployeeByIdx(Model model, int idx) {
		EmployeeVO employeeVO = employeeService.selectByPK(idx);
		model.addAttribute("employee", employeeVO);

		return "employee/detail";
	}

	/**
	 * 전체 직원정보를 가져오는 메소드
	 * @param model 모델
	 * @param pageVO 페이지VO
	 * @return view
	 */
	@RequestMapping("/employee/getEmployeeList")
	public String employeeListSearchByIdx(Model model,PageVO pageVO) {
		// 전체 게시글 수
		int totalArticleCount = employeeService.getEmployeeCount();
		// 전체 페이지 수
		int totalPage = (int) Math.ceil((double)totalArticleCount / pageVO.getArticlePerAPage());
		// endPage
		pageVO.setTotalPageCount(totalPage);
		// 표시될 게시물
		List<EmployeeVO> employeeList = employeeService.selectAll(pageVO);
		
		if(pageVO.getLimitStart()/100 > 0) {
			int stargPage = (pageVO.getLimitStart()/10)+1;
			int endPage = pageVO.getLimitStart()/10+10;
					
			pageVO.setStartPage(stargPage);
			pageVO.setEndPage(endPage);
		}
		
		model.addAttribute("employeeList", employeeList);
		model.addAttribute("pageVO", pageVO);
		
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
		List<EmployeeVO> employeeList = employeeService.selectByDep(deptId);

		model.addAttribute("employeeList", employeeList);

		return "employee/deptidList";
	}

	/**
	 * 직원정보 추가 페이지이동 메소드
	 * @param employeeVO 직원VO
	 * @param model 모델
	 * @return view
	 */
	@RequestMapping("/employee/showInsertingEmployee")
	public String showInsertingEmployee(Model model,EmployeeVO employeeVO) {
		model.addAttribute("employeeVO", employeeVO);
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
		int resultInsertNumber = employeeService.insertEmployee(employeeVO);
		
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
		int resultUpdateNumber = employeeService.updateEmployee(employeeVO);
		
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
		int resultDeleteNumber= employeeService.delteEmployee(employeeVO);

		if(resultDeleteNumber > 0) {
			model.addAttribute("resultDeleteNumber", resultDeleteNumber);
		}else {
			model.addAttribute("resultDeleteNumber",null);
		}
		
		return "employee/result";
	}

}
