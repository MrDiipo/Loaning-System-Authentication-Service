package com.mrdiipo.authentication_service;

import com.mrdiipo.authentication_service.user.model.User;
import com.mrdiipo.authentication_service.user.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticationServiceApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(AuthenticationServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("John", "1234"));
        userRepository.save(new User("Elegbede", "4321"));
    }
}
