package org.ssg.product_manageapp.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.ssg.product_manageapp.domain.ProductVO;
import org.ssg.product_manageapp.dto.ProductDTO;
import org.ssg.product_manageapp.mapper.ProductMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ModelMapper modelMapper;
    private final ProductMapper productMapper;


    @Override
    public void insert(ProductDTO productDTO) {
        log.info(modelMapper);
        ProductVO productVO = modelMapper.map(productDTO,ProductVO.class);
        log.info(productVO);
        productMapper.insert(productVO);
    }

    @Override
    public void remove(Long pno) {
        productMapper.delete(pno);
        log.info(pno);
    }

    @Override
    public void modify(ProductDTO productDTO) {
        log.info("modify service call...");
        ProductVO productVO = modelMapper.map(productDTO, ProductVO.class);
        productMapper.update(productVO);
        log.info(productVO);

    }

    @Override
    public ProductDTO getOne(Long id) {
        ProductDTO productDTO = modelMapper.map(productMapper.selectOne(id), ProductDTO.class);
        log.info(productDTO);
        return productDTO;
    }

    @Override
    public List<ProductDTO> getList() {
        List<ProductVO> voList = productMapper.selectAll();

        List<ProductDTO> dtoList = voList.stream().map(vo -> modelMapper.map(vo, ProductDTO.class)).collect(Collectors.toList());
        log.info(dtoList);
        return dtoList;
    }
}
