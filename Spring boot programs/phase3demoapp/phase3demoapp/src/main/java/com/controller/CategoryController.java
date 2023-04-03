package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.Category;
import com.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/adminHome",method = RequestMethod.GET)
	public String back(Model mm, Category cc) {
		mm.addAttribute("category", cc);
		return "adminHome";
	}
	
	@RequestMapping(value = "/addCategoryPage",method = RequestMethod.GET)
	public String openAddCategoryPage(Model mm, Category cc) {
		mm.addAttribute("category", cc);
		return "addCategory";
	}
	
	
	@RequestMapping(value = "/storeCategoryInfo",method = RequestMethod.POST)
	public String storeAddCategoryPage(Model mm, Category cc) {
		String result = categoryService.storeCategory(cc);
		mm.addAttribute("category", cc);
		mm.addAttribute("msg", result);
		return "addCategory";
	}
	
	
	@RequestMapping(value = "/viewCategoryPage",method = RequestMethod.GET)
	public String viewCategory(Model mm, Category cc) {
		List<Category> listOfCategories = categoryService.findAllCategory();
		mm.addAttribute("category", listOfCategories);
		return "viewCategory";
	}
}
