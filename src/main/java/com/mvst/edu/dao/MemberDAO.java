package com.mvst.edu.dao;

import org.apache.ibatis.annotations.Select;

import egovframework.rte.psl.dataaccess.mapper.Mapper;
/** 
 * @author ysk2685
 * @since 2022.5.13
 */
@Mapper("memberDao")
public interface MemberDAO {
	/**현재시간을 알려주는 메소드*/
	@Select("SELECT NOW();")
	public String test();
}
