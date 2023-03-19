package com.anghack.security;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) throws IOException {
            Path path = Path.of("fichier.txt");
            System.out.println(path.toAbsolutePath());
		SpringApplication.run(SecurityApplication.class, args);
	}

}
