package com.bsl.service;

import java.util.List;

import com.bsl.entity.User;

public interface UserService {
	
	public Long add(User user);
	public void update(User user);
	public void delete(User user);
	public User selectOnlyOne(long id);
	public List<User> selectAll();
}
