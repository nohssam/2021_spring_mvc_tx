package com.ict.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.vo.VO;

@Repository("myDAOImpl")
public class MyDAOImpl implements MyDAO{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void insertCard(VO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertTicket(VO vo) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
