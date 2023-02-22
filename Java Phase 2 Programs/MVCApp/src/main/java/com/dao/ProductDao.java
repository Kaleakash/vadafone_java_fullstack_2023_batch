package com.dao;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.entity.Product;
import com.resource.DbResource;
public class ProductDao {

	public int storeProduct(Product product) {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.getTransaction();
		tran.begin();
			session.save(product);
		tran.commit();		
		return 1;
	}
	public List<Product> findAllProduct() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		TypedQuery tq = session.createQuery("from Product");
		List<Product> listOfProdut = tq.getResultList();
		return listOfProdut;
	}
	
}
