package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Product;

// DAO Layer work done 

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
