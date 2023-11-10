package com.hanniel.todolist.services;

import com.hanniel.todolist.Dtos.UserDTO;
import com.hanniel.todolist.domain.user.User;
import com.hanniel.todolist.exceptions.RecordNotFoundException;
import com.hanniel.todolist.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
    }

    public User createUser(UserDTO data) {
        User user = new User(data);
        BCryptPasswordEncoder cryptPassword = new BCryptPasswordEncoder();
        String passwordCrypt = cryptPassword.encode(user.getPassword());
        user.setPassword(passwordCrypt);
        return userRepository.save(user);
    }

    public User updateUser(UserDTO data, Long id) {
        User savedUser = getUserById(id);
        User user = new User(data);
        user.setId(savedUser.getId());
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
