package io.mario.graphql1.controller;

import io.mario.graphql1.model.User;
import io.mario.graphql1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @QueryMapping
    public User getUser(@Argument Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @QueryMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @MutationMapping
    public User createUser(@Argument String name, @Argument String email) {
        return userRepository.save(new User(name, email));
    }

    @MutationMapping
    public void deleteUser(@Argument Long id) {
        userRepository.deleteById(id);
    }
}
