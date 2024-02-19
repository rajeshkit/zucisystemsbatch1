package com.zuci.cafeteria.repository;

import com.zuci.cafeteria.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
    public Users findByUsername(String username);
}
