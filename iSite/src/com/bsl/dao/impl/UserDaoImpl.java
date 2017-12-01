package com.bsl.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bsl.dao.UserDao;
import com.bsl.entity.User;

public class UserDaoImpl implements UserDao {
	
	//要得到Hibernate的configuration对象，再得到sessionFactory对象，再得到session对象
	private SessionFactory sessionFactory;
	private Session session;
	
	public Session geSession() {
		sessionFactory = new Configuration().configure().buildSessionFactory();
		session = sessionFactory.openSession();
		return session;
	}
	
	//关闭session对象和sessionFactory对象
	public void closeSession() {
		if (session!=null) {
			session.close();
		}
		if (sessionFactory!=null) {
			sessionFactory.close();
		}
	}
	//插入记录
	@Override
	public Long insert(User user) {
		session=geSession();
		Transaction transaction = session.beginTransaction();
		Long id = (Long) session.save(user);
		transaction.commit();
		closeSession();
		return id;
	}
	//更新记录
	@Override
	public void update(User user) {
		session=geSession();
		Transaction transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
		closeSession();
	}
	//删除记录
	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getUserById(Long id) {
		session=geSession();
		User user = session.get(User.class, id);
		closeSession();
		return user;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList() {
		session=geSession();
		List<User> list = session.createQuery("form User").getResultList();
		closeSession();
		return list;
	}

}
