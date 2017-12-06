package com.bsl.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bsl.dao.UserDao;
import com.bsl.entity.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public List<User> findByNameAndPass(User user) {
		List<User> list = find("select u from User u where u.username = ?0 and m.password=?1"
				,user.getUsername(),user.getPassword());
		return list;
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
