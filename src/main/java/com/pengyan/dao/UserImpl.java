package com.pengyan.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pengyan.interfaces.Userinterface;
import com.pengyan.model.User;
import com.sun.tools.javac.util.List;

@Repository
public class UserImpl implements Userinterface {

	@Autowired
	public SqlSessionTemplate sqlSessionTemplate;

	@Override
	public User queryById(int id) {
		// TODO Auto-generated method stub
		return (User) sqlSessionTemplate.selectOne("queryById", 1);
	}

	@Override
	public void save(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User u) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectList(statement);
	}
}
