package com.oneum.service;

import java.util.Map;

import com.oneum.entity.MemberVO;

public interface BoardService {
	public Map<String, Object> signIn(Map<String, Object> member) throws Exception;
	public void signUp(Map<String, Object> member) throws Exception;
}
