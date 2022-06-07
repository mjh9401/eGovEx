package com.mvst.edu.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvst.edu.service.MemberService;

/** 
 * @author ysk2685
 * @since 2022.5.13
 */
@Controller
@RequestMapping("/member")
public class MemberController {
	/** MemberService*/
	//@Resource(name="memberService")
	//private MemberService memberService;
	
	
	/** 
	 * 테스트 페이지
	 * @param model : 모델
	 * @return view
	 */
	@RequestMapping("/test")
	public String memSearch(Model model) {
		
		Date date = new java.util.Date(); 
		model.addAttribute("date", date);
		
		return "member/index";
	}

}
