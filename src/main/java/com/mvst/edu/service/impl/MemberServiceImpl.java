package com.mvst.edu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mvst.edu.dao.MemberDAO;
import com.mvst.edu.service.MemberService;
import com.mvst.edu.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Resource(name="memberDao")
	private MemberDAO memberDao;
	
	@Override
	public MemberVO test(String name) {
		MemberVO time = memberDao.test(name);
		
		return time;
	}

}
