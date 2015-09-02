package com.pengyan.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pengyan.interfaces.Userinterface;
import com.pengyan.model.User;

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
		int delete = sqlSessionTemplate.delete("delete_user", id);
		System.out.println(delete);
	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		List<User> ls = new ArrayList<User>();
		ls = sqlSessionTemplate.selectList("queryAll");
		return ls;
	}
}
