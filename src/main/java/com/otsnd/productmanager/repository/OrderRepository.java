package com.otsnd.productmanager.repository;

import com.otsnd.productmanager.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByUserId(long id);
}
