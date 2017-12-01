package com.bsl.service.impl;

import java.util.List;

import com.bsl.dao.UserDao;
import com.bsl.entity.User;
import com.bsl.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao dao;

	//新加用户
	@Override
	public Long add(User user) {
		long id = dao.insert(user);
		return id;
	}
	
	//修改用户
	@Override
	public void update(User user) {
		dao.update(user);
		
	}
	//删除用户
	@Override
	public void delete(User user) {
		dao.delete(user);
		
	}

	//查找单个用户
	@Override
	public User selectOnlyOne(long id) {
		User user = dao.getUserById(id);
		return user;
	}

	@Override
	public List<User> selectAll() {
		List<User> list = dao.getUserList();
		return list;
	}

}
