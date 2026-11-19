package com.ecomm.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomm.app.entity.Role;
import java.util.List;
import java.util.Optional;

import com.ecomm.app.enums.RoleName;


@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

	 Optional<Role> findByRoleName(RoleName roleName);
}
