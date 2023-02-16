package dev.vinodkmr.controller;

import dev.vinodkmr.dao.user.UserRepository;
import dev.vinodkmr.model.product.Product;
import dev.vinodkmr.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author vinod.gangadhariah <br/>
 * created on 16-02-2023 <br/>
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getAllProducts(){
        return userRepository.findAll();
    }
}
