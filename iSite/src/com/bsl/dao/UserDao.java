package com.bsl.dao;

import java.util.List;

import com.bsl.entity.User;

public interface UserDao {
	
	public Long save(User user);
	public void update(User user);
	public void delete(User user);
	public User findById(Long id);
	public List<User> findAll();
}
