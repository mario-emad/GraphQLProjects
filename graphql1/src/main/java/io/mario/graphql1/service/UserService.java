package io.mario.graphql1.service;

import io.mario.graphql1.model.User;
import io.mario.graphql1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUser(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(String name, String email) {
        return userRepository.save(new User(name, email));
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
