package com.hanniel.todolist.services;

import com.hanniel.todolist.domain.userRelationship.UserRelationship;
import com.hanniel.todolist.repositories.TaskRepository;
import com.hanniel.todolist.repositories.UserRelationshipRepository;
import com.hanniel.todolist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRelationshipService {

    @Autowired
    UserRelationshipRepository userRelationshipRepository;

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    public List<UserRelationship> getAll(){
        return userRelationshipRepository.findAll();
    }

}
