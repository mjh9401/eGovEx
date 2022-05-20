package com.mvst.edu.dao;

import org.apache.ibatis.annotations.Param;

import com.mvst.edu.vo.MemberVO;
/** 
 * @author ysk2685
 * @since 2022.5.13
 */
//@Mapper("memberDao")
public interface MemberDAO {
	
	public MemberVO test(@Param("name") String name);
	
}
	
