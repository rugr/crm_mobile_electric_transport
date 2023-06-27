package com.vntu.pipz.crm_mobile_electric_transport.repository;

import com.vntu.pipz.crm_mobile_electric_transport.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByUser(User user);
}
