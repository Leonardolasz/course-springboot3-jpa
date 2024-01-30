package com.lalsz.course.repositories;

import com.lalsz.course.entities.Product;
import com.lalsz.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
