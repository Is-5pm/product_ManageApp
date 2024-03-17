package org.ssg.product_manageapp.service;

import org.ssg.product_manageapp.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    void insert(ProductDTO productDTO);
    void remove(Long pno);
    void modify(ProductDTO productDTO);
    ProductDTO getOne(Long id);

    List<ProductDTO> getList();
}
