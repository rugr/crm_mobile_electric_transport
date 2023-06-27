package com.vntu.pipz.crm_mobile_electric_transport.repository;

import com.vntu.pipz.crm_mobile_electric_transport.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findOneByTitle(String title);

    List<Product> findAllByPriceBetween(int min, int max);
}
