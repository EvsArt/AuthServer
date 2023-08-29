package com.pointofdelivery.authorizationserver.repository;

import com.pointofdelivery.authorizationserver.model.Role;
import com.pointofdelivery.authorizationserver.model.RolesEnum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(RolesEnum name);
    boolean existsByName(RolesEnum role);
}
