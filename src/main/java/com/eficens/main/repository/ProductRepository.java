package com.eficens.main.repository;

import com.eficens.main.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel,Long> {



}
