package com.hanniel.todolist.repositories;

import com.hanniel.todolist.domain.userRelationship.UserRelationship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRelationshipRepository extends JpaRepository<UserRelationship, Long> {
}
