package com.kali.jpa.service;

import com.kali.jpa.Entity.Product;
import com.kali.jpa.projection.interfacebased.closed.ProductClosedView;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    List<ProductClosedView>findBy();
}
