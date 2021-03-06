package com.example.gorski.domain.users;

import com.example.gorski.domain.users.model.Role;
import com.example.gorski.domain.users.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
