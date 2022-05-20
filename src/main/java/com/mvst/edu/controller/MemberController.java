package com.mvst.edu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvst.edu.service.MemberService;
import com.mvst.edu.vo.MemberVO;

/** 
 * @author ysk2685
 * @since 2022.5.13
 */
@Controller
@RequestMapping("/member")
public class MemberController {
	/** MemberService*/
	@Resource(name="memberService")
	private MemberService memberService;
	
	
	/** 
	 * 테스트 페이지
	 * @param model : 모델
	 * @return view
	 */
	@RequestMapping("/test")
	public String memSearch(Model model) {
		String name = null;
		MemberVO employee = memberService.test(name);
		
		model.addAttribute("employee", employee);
		
		return "member/index";
	}

}
