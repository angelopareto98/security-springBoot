
package com.anghack.security.service;

import com.anghack.security.entity.AppRole;
import com.anghack.security.entity.AppUser;
import com.anghack.security.repository.AppRoleRepository;
import com.anghack.security.repository.AppUserRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
    private final AppUserRepository appUserRepository;
    private final AppRoleRepository appRoleRepository;

    public AccountServiceImpl(AppUserRepository appUserRepository, AppRoleRepository appRoleRepository) {
        this.appUserRepository = appUserRepository;
        this.appRoleRepository = appRoleRepository;
    }
    
    
    @Override
    public AppUser addNewUser(AppUser user) {
        return this.appUserRepository.save(user);
    }

    @Override
    public AppRole addNewRole(AppRole role) {
        return this.appRoleRepository.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        AppUser user = this.appUserRepository.findByUsername(username);
        AppRole role = this.appRoleRepository.findByRoleName(roleName);
        
        user.getRoles().add(role);
    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return this.appUserRepository.findByUsername(username);
    }

    @Override
    public List<AppUser> listUsers() {
        return this.appUserRepository.findAll();
    }

}
