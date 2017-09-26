package com.aaa.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aaa.dao.TransactionalTest1Dao;
import com.aaa.dao.TransactionalTest2Dao;
import com.aaa.entity.TransactionalTest1;
import com.aaa.entity.TransactionalTest2;
import com.aaa.service.TransactionalTestService;

@Service
public class TransactionalTestServiceImpl implements TransactionalTestService {
	private static final Logger log = LogManager.getLogger(TransactionalTestServiceImpl.class);

	@Resource
	private TransactionalTest1Dao transactionalTest1Dao;
	@Resource
	private TransactionalTest2Dao transactionalTest2Dao;

	@Override
	@Transactional(noRollbackFor = { ArithmeticException.class, Exception.class }, propagation = Propagation.NOT_SUPPORTED)
	public void addTransactionalTest() {
		// TODO Auto-generated method stub
		transactionalTest2Dao.addTransactionalTest2(new TransactionalTest2("aaaa1"));
		transactionalTest1Dao.addTransactionalTest1(new TransactionalTest1("aaaaa"));
	}

	@Override
	public void getTransactionalTest() {
		// TODO Auto-generated method stub
		List<TransactionalTest1> list = transactionalTest1Dao.getTransactionalTest1();
		System.out.println(list.size());
	}
}
