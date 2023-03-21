
package com.anghack.security.service;

import com.anghack.security.entity.AppRole;
import com.anghack.security.entity.AppUser;
import java.util.List;

/**
 *
 * @author anghack
 */
public interface AccountService {
    AppUser addNewUser(AppUser user);
    AppRole addNewRole(AppRole role);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    
    List<AppUser> listUsers();
    
}
