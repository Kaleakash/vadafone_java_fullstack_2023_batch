package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Product;
import com.resource.DbResource;

public class ProductDao {
	SessionFactory sf;
	public ProductDao() {			// this code execute only once 
		sf = DbResource.getSessionFactory();
	}
	// we got the session factory 
	public int storeProduct(Product product) {
		try {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
			session.save(product);
		tran.commit();
		return 1;
		}catch(Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Product p = session.get(Product.class, pid);
		if(p==null) {
			return 0;
		}else {
			tran.begin();
				session.delete(p);
			tran.commit();
			return 1;
		}	
	}
	
	public int incrementProductPrice(Product product) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Product p = session.get(Product.class, product.getPid());
		if(p==null) {
			return 0;
		}else {
			tran.begin();
				p.setPrice(p.getPrice()+product.getPrice());
				session.update(p);
			tran.commit();
			return 1;
		}	
	}
	public int decrementProductPrice(Product product) {
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		Product p = session.get(Product.class, product.getPid());
		if(p==null) {
			return 0;
		}else {
			tran.begin();
				p.setPrice(p.getPrice()-product.getPrice());
				session.update(p);
			tran.commit();
			return 1;
		}	
	}
	
	public Product findProductById(int pid) {
		Session session = sf.openSession();
		Product p = session.get(Product.class, pid);
		return p;	
	}
	
	public List<Product> findProductAllProduct() {
		Session session = sf.openSession();
		TypedQuery<Product> tq = session.createQuery("from Product");
		List<Product> listOfProduct = tq.getResultList();
		return listOfProduct;
	}
}


