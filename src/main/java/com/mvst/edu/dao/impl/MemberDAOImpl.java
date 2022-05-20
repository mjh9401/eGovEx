package com.mvst.edu.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvst.edu.dao.MemberDAO;
import com.mvst.edu.vo.MemberVO;

@Repository("memberDao")
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private static final String nameSpaece = "com.mvst.edu.dao.MemberDAO";
	
	
	@Override
	public MemberVO test(String name) {
		return sqlSession.selectOne(nameSpaece+".test",name);
	}

}
