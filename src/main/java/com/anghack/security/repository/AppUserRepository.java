
package com.anghack.security.repository;

import com.anghack.security.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author anghack
 */
public interface AppUserRepository extends JpaRepository<AppUser, Long>{
    AppUser findByUsername(String username);
}
