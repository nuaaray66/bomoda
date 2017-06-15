package com.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

import com.dao.PageDao;
import com.db.ConnectionFactory;
import com.pay.domain.Biz;
import com.pay.domain.Page;

public class PageDaoImpl implements PageDao {

	public static final String workspace = "com.dao.PageDao.";

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
	public int insert(Page record) {
		// TODO Auto-generated method stub
		return sqlSession.insert(workspace + "insert", record);
	}

	@Override
	public int insertSelective(Page record) {
		// TODO Auto-generated method stub
		return sqlSession.insert(workspace + "insertSelective", record);
	}

	@Override
	public Page selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return (Page) sqlSession.selectOne(workspace + "selectByPrimaryKey", id);
	}

	@Override
	public int updateByPrimaryKeySelective(Page record) {
		// TODO Auto-generated method stub
		return sqlSession.update(workspace + "updateByPrimaryKeySelective", record);
	}

	@Override
	public int updateByPrimaryKey(Page record) {
		// TODO Auto-generated method stub
		return sqlSession.update(workspace + "updateByPrimaryKey", record);
	}

}
