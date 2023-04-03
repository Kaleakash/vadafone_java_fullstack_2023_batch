package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Category;
import com.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	public String storeCategory(Category category) {
		categoryRepository.save(category);
		return "Category details stored";
	}
	
	public List<Category> findAllCategory() {
		return categoryRepository.findAll();
	}
}
