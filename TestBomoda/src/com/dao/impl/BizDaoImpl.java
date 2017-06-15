package com.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

import com.dao.BizDao;
import com.db.ConnectionFactory;

import com.pay.domain.Biz;

public class BizDaoImpl implements BizDao {

	public static final String workspace = "com.dao.BizDao.";

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
	public int insert(Biz record) {
		// TODO Auto-generated method stub
		return sqlSession.insert(workspace + "insert", record);
	}

	@Override
	public int insertSelective(Biz record) {
		// TODO Auto-generated method stub
		return sqlSession.insert(workspace + "insertSelective", record);
	}

	@Override
	public Biz selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return (Biz) sqlSession.selectOne(workspace + "selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(Biz record) {
		// TODO Auto-generated method stub
		return sqlSession.update(workspace + "updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(Biz record) {
		// TODO Auto-generated method stub
		return sqlSession.update(workspace + "updateByPrimaryKey", record);
	}

}
