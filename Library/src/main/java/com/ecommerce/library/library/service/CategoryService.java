package com.ecommerce.library.library.service;

import com.ecommerce.library.library.model.Category;

import java.util.List;

public interface CategoryService {

    /*Admin*/
    List<Category> findAll();
    Category save(Category category);
    Category findById(Long id);
    Category update(Category category);
    void deleteById(Long id);
    void enabledById(Long id);


//    Category findById(Long id);
//    Category update(Category category);
//
//
    List<Category> findAllByActivated();

//    /*Customer*/
//    List<CategoryDto> getCategoryAndProduct();
}
