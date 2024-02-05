package com.kali.jpa.repository;

import com.kali.jpa.Entity.Product;
import com.kali.jpa.interfacebased.closed.ProductClosedView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<ProductClosedView>findBy();

}
