package userservices.controller;

import userservices.entity.User;
import userservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController

public class UserController  {

    @Autowired
    private UserService userService;

    @GetMapping("/users")

    public Page<User> getUsers(Pageable pageable){
     //return Page<>userService.getUsers(pageable);
        return null;
    }

    @GetMapping("/users/{id}")
    public Optional<User> getById(@PathVariable("id") Long id){
        return userService.getById(id);
    }

    @PostMapping("/addusers")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
//
//    @DeleteMapping()
//    public String deleteUser(){
//        return "DELETE request";
//    }
//
//    @PutMapping
//    public String updateUser(){
//        return "PUT request";
//    }

}
