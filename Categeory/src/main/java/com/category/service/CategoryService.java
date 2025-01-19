package com.category.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.category.entity.Category;
import com.category.repository.CategoryRepo;
@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	public List<Category> getAllCategories(){
		return categoryRepo.findAll();
	}
	
	public Category getCategoryById(Long id) {
		return categoryRepo.findById(id).orElse(null);
	}
	
	public Category createCategory(Category category) {
		return categoryRepo.save(category);
	}
	
	public Category updateCategory(Long id,Category category)
	{
		category.setId(id);
		return categoryRepo.save(category);
	}
	
	public void deleteCategory(Long id) {
		categoryRepo.deleteById(id);
	}
}
