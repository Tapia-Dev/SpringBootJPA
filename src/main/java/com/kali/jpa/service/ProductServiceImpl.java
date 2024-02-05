package com.kali.jpa.service;

import com.kali.jpa.Entity.Product;
import com.kali.jpa.projection.interfacebased.closed.ProductClosedView;
import com.kali.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductClosedView> findBy() {
        return productRepository.findBy();
    }
}
