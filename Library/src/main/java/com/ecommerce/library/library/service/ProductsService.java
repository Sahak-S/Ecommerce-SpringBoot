package com.ecommerce.library.library.service;

import com.ecommerce.library.library.dto.ProductDto;
import com.ecommerce.library.library.model.Product;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductsService {

    List<ProductDto> findAll();
    Product save(MultipartFile imageProduct,ProductDto productDto);
    Product update(ProductDto productDto);
    void deleteById(Long id);
    void enable(Long id);

}
