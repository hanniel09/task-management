package com.hanniel.todolist.repositories;

import com.hanniel.todolist.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
