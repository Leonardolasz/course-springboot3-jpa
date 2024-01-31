package com.lalsz.course.repositories;

import com.lalsz.course.entities.OrderItem;
import com.lalsz.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
