package com.bsl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bsl.entity.User;

@Repository
public class UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void insert(User user) {
		Session session = sessionFactory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
	}
	
	public List<User> byNameAndPass(User user){
		
		String hql = "select u from User u where u.name=?1 and u.pass=?2";
		Session session = sessionFactory.openSession();
		List<User> list = session.createQuery(hql).setString(1, user.getUsername())
							.setString(2, user.getPassword()).list();
		session.close();
		return list;
		
		
	}
}
