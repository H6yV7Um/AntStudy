package com.aaa.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.aaa.dao.TransactionalTest1Dao;
import com.aaa.entity.TransactionalTest1;

@Component
public class TransactionalTest1DaoImpl extends HibernateDaoSupport implements TransactionalTest1Dao {

	@Autowired
	public void setSF(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Override

	public String addTransactionalTest1(TransactionalTest1 transactionalTest1) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(transactionalTest1).toString();
		int i = 100 / 0;
		return "";
	}

	@Override
	public List<TransactionalTest1> getTransactionalTest1() {
		// TODO Auto-generated method stub
		List<TransactionalTest1> transactionalList = new ArrayList<TransactionalTest1>();
		transactionalList = this.getHibernateTemplate().loadAll(TransactionalTest1.class);
		return transactionalList;
	}
}
