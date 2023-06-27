package com.vntu.pipz.crm_mobile_electric_transport.repository;

import com.vntu.pipz.crm_mobile_electric_transport.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
