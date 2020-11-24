package com.oneum.dao;

import java.util.Map;

import com.oneum.entity.MemberVO;

public interface MemberDao {
	void insertMember(Map<String, Object> member) throws Exception;
	Integer selectMember(Map<String, Object> member) throws Exception;
}
