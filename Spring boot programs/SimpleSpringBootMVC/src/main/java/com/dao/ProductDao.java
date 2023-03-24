package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository
public class ProductDao {

	//@Autowired
	//DataSource ds
	
	//@Autowired
	//JdbcTemplate jdbcTemplate;
	
	@Autowired
	EntityManagerFactory emf;			// SessionFactory sf = con.buildSessionFactory();
	
	public int storeProduct(Product product) {
	try {
	EntityManager manager = emf.createEntityManager();   // Session session = sf.createSssion();
	EntityTransaction tran = manager.getTransaction();   // Transaction tran = session.getTransaction();
	tran.begin();
	manager.persist(product);     // session.save(product);
	tran.commit();
	return 1;
	}catch(Exception e) {
		System.out.println(e);
		return 0;
	}
	}
}
