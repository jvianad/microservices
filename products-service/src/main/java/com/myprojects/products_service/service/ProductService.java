package com.myprojects.products_service.service;

import com.myprojects.products_service.repository.iProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final iProductRepository productRepository;

    

}
