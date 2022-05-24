package com.mvst.edu.controller;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
public class MemberController {
	/** MemberService*/
	@Resource(name="memberService")
	private MemberService memberService;
	Logger logger = LogManager.getLogger(); 

	/** 
	 * 테스트 페이지
	 * @param model : 모델
	 * @return view
	 */
	@RequestMapping("/member/test")
	public String memSearch(Model model) {
		//logger.info("변경 전 - debug");
		//logger.error("변경 전 - error");
		
		
		
		
		return "member/index";
	}

}
