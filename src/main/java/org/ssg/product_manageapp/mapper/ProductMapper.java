package org.ssg.product_manageapp.mapper;

import org.ssg.product_manageapp.domain.ProductVO;

import java.util.List;

public interface ProductMapper {
    void insert(ProductVO productVO);
    List<ProductVO> selectAll();
    ProductVO selectOne(Long pno);
    void delete(Long pno);
    void update(ProductVO productVO);
}
