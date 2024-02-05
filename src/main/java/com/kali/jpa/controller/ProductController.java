package com.kali.jpa.controller;


import com.kali.jpa.Entity.Local;
import com.kali.jpa.Entity.Product;
import com.kali.jpa.interfacebased.closed.ProductClosedView;
import com.kali.jpa.service.LocalService;
import com.kali.jpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/producs")
// http://localhost:8081/api/producs
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/findAll")
    public List<Product> findAll(){
        return productService.findAll();
    }

    // Closed View
    @GetMapping("/findAllProductsClsosedView")
    public List<ProductClosedView> productClosedViews(){
        return productService.findBy();
    }
}
