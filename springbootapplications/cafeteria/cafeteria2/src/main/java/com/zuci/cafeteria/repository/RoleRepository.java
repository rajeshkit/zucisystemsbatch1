package com.zuci.cafeteria.repository;

import com.zuci.cafeteria.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RoleRepository extends JpaRepository<Role,Integer> {
}
