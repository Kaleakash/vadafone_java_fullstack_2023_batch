package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
