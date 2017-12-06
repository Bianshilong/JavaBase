package com.bsl.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;

import com.bsl.dao.BaseDao;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class BaseDaoImpl<T> implements BaseDao<T> {
	
	private SessionFactory SessionFactory;
	

	@Override
	public T get(Class<T> entityClazz, Serializable id) {
		return (T)getSessionFactory().getCurrentSession().get(entityClazz, id);
	}

	@Override
	public Serializable save(T entity) {
		return getSessionFactory().getCurrentSession().save(entity);
	}

	@Override
	public void update(T entity) {
		getSessionFactory().getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		getSessionFactory().getCurrentSession().delete(entity);
	}
	
	@Override
	public void delete(Class<T> entityClazz, Serializable id) {
		getSessionFactory().getCurrentSession().createQuery("delete"
				+ entityClazz.getSimpleName()+"en where en.id = ?0")
				.setParameter("0", id)
				.executeUpdate();
		
	}

	@Override
	public List<T> findAll(Class<T> entityClazz) {
		return find("select en from"+entityClazz.getSimpleName()+"en");
	}

	@Override
	public long findCount(Class<T> entityClazz) {
		// TODO Auto-generated method stub
		return 0;
	}

	//使用HQL语句查询实体
	@SuppressWarnings("unchecked")
	protected List<T> find(String hql){
		List<T> list =(List<T>) getSessionFactory().getCurrentSession().createQuery(hql).getResultList();
		return list;
	}
	
	//根据占位符参数HQL语句查询实体
	@SuppressWarnings("unchecked")
	protected List<T> find(String hql,Object... params){
		//创建查询
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);
		//为包含占位符的HQL语句设置参数
		for (int i = 0; i < params.length; i++) {
			query.setParameter(i+"", params[i]);
		}
		return query.getResultList();
	}
}
