package com.mrdiipo.authentication_service.user.model.repository;

import com.mrdiipo.authentication_service.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
