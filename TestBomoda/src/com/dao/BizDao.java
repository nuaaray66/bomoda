package com.dao;

import com.pay.domain.Biz;

public interface BizDao {
	
	public void commit();
	
    /**
     * 根据主键删除
     * 参数:主键
     * 返回:删除个数
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入，空属性也会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    int insert(Biz record);

    /**
     * 插入，空属性不会插入
     * 参数:pojo对象
     * 返回:删除个数
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    int insertSelective(Biz record);

    /**
     * 根据主键查询
     * 参数:查询条件,主键值
     * 返回:对象
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    Biz selectByPrimaryKey(Integer id);

    /**
     * 根据主键修改，空值条件不会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    int updateByPrimaryKeySelective(Biz record);

    /**
     * 根据主键修改，空值条件会修改成null
     * 参数:1.要修改成的值
     * 返回:成功修改个数
     * @ibatorgenerated 2017-06-15 12:45:31
     */
    int updateByPrimaryKey(Biz record);
}