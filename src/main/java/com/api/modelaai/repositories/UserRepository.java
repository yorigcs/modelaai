package com.api.modelaai.repositories;

import com.api.modelaai.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
