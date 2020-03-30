package com.eomaxl.spring.order.service.api.repository;

import com.eomaxl.spring.order.service.api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer>
{

}
