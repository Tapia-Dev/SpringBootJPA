package com.kali.jpa.service;

import com.kali.jpa.Entity.Local;
import com.kali.jpa.Entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
}
