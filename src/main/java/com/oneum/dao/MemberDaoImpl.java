package com.oneum.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.oneum.entity.MemberVO;

@Component
public class MemberDaoImpl implements MemberDao {
	
	/** SqlSessionTemplate */
	@Autowired
	private SqlSessionTemplate sqlSession;

	
	@Override
	public void insertMember(Map<String, Object> member) throws Exception {
		sqlSession.insert("sql.insertMember", member);
		
	}
	
	@Override
	public Integer selectMember (Map<String, Object> member) throws Exception {
		return sqlSession.selectOne("sql.selectMember", member);
	}

}
