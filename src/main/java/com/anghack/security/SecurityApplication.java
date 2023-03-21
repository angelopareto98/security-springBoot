package com.anghack.security;

import com.anghack.security.entity.AppRole;
import com.anghack.security.entity.AppUser;
import com.anghack.security.service.AccountService;
import java.io.IOException;
import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecurityApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SecurityApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AccountService accountService) {
        return args -> {
            accountService.addNewRole(new AppRole(null, "USER"));
            accountService.addNewRole(new AppRole(null, "ADMIN"));
            accountService.addNewRole(new AppRole(null, "CUSTOMER_MANAGER"));
            accountService.addNewRole(new AppRole(null, "BILLS_MANAGER"));

            accountService.addNewUser(new AppUser(null, "admin", "1234", new ArrayList<>()));
            accountService.addNewUser(new AppUser(null, "user1", "1234", new ArrayList<>()));
            accountService.addNewUser(new AppUser(null, "user2", "1234", new ArrayList<>()));
            accountService.addNewUser(new AppUser(null, "user3", "1234", new ArrayList<>()));

            accountService.addRoleToUser("admin", "USER");
            accountService.addRoleToUser("admin", "ADMIN");
            accountService.addRoleToUser("user1", "USER");
            accountService.addRoleToUser("user2", "USER");
            accountService.addRoleToUser("user2", "CUSTOMER_MANAGER");
            accountService.addRoleToUser("user3", "USER");
            accountService.addRoleToUser("user3", "BILLS_MANAGER");
        };
    }

}
