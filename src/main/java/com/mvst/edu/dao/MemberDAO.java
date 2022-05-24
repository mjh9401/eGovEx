package com.mvst.edu.dao;

import org.apache.ibatis.annotations.Param;

import com.mvst.edu.vo.MemberVO;
/** 
 * 직원DAO
 * @author ysk2685
 * @since 2022.5.13
 */
// MybatisDao구현
//@Mapper("memberDao")
public interface MemberDAO {
	
	/**
	 * 직원데이터 가져오는 메소드
	 * @param name 직원이름
	 * @return 직원데이터
	 */
	/*함수 프로타입 타입*/
	MemberVO test(@Param("name") String name);
	
}
	
