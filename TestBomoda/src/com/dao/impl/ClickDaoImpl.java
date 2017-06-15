package com.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

import com.dao.ClickDao;
import com.db.ConnectionFactory;
import com.pay.domain.Biz;
import com.pay.domain.Click;

public class ClickDaoImpl implements ClickDao {

	public static final String workspace = "com.dao.ClickDao.";

	// @Resource
	// private SqlSession sqlSession;
	//

	@Resource
	private static SqlSession sqlSession = ConnectionFactory.getSession();;

	@Override
	public void commit() {
		sqlSession.commit();
	
	}
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sqlSession.delete(workspace + "deleteByPrimaryKey", id);
	}

	@Override
	public int insert(Click record) {
		// TODO Auto-generated method stub
		return sqlSession.insert(workspace + "insert", record);
	}

	@Override
	public int insertSelective(Click record) {
		// TODO Auto-generated method stub
		return sqlSession.insert(workspace + "insertSelective", record);
	}

	@Override
	public Click selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return (Click) sqlSession.selectOne(workspace + "selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(Click record) {
		// TODO Auto-generated method stub
		return sqlSession.update(workspace + "updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(Click record) {
		// TODO Auto-generated method stub
		return sqlSession.update(workspace + "updateByPrimaryKey", record);
	}

}
