package com.github.mgzu.system.repository;

import com.github.mgzu.system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
