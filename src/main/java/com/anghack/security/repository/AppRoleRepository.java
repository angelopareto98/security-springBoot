
package com.anghack.security.repository;

import com.anghack.security.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author anghack
 */
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findByRoleName(String roleName);
}
