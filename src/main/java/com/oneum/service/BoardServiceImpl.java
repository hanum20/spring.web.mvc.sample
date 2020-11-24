package com.oneum.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oneum.dao.MemberDao;
import com.oneum.entity.MemberVO;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	MemberDao dao;

	@Override
	public Map<String, Object> signIn(Map<String, Object> member) throws Exception {
		
		if(dao.selectMember(member) < 1) {
			throw new Exception("Login Fail");
		}
		
		return member;
	}

	@Override
	public void signUp(Map<String, Object> member) throws Exception {
		
		dao.insertMember(member);
	}

}
