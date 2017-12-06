package com.bsl.dao;

import java.util.List;

import com.bsl.entity.User;

public interface UserDao {
	
	public Long insert(User user);
	public void update(User user);
	public void delete(User user);
	public User getUserById(Long id);
	public List<User> getUserByNameAndPass();
	public List<User> getUserList();
}
