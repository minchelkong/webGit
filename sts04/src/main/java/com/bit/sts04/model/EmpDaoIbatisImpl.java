package com.bit.sts04.model;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bit.sts04.model.entity.EmpVo;



public class EmpDaoIbatisImpl implements EmpDao {

	


	@Override
	public EmpVo selectOne(int key) throws SQLException {
		return null;
	}

	@Override
	public void insertOne(EmpVo bean) throws SQLException {
	
	}

	@Override
	public int updateOne(EmpVo bean) throws SQLException {
		return 0;
	}

	@Override
	public int deleteOne(int key) throws SQLException {
		return 0;
	}

	@Override
	public List<EmpVo> selectAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}