package com.aweperi.controller;

import com.aweperi.model.User;
import com.aweperi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> fetchUsers() {
        var users = userService.findAll();
        return users;
    }

    @PostMapping("/users/add")
    public List<User> addUser(@RequestBody User user) {
       userService.addUser(user);
       return fetchUsers();
    }
//
//    @PutMapping("/users/update")
//    public String update(@RequestBody String name, int index) {
//        users.set(index, name);
//       return users.get(index);
//    }
//
//    @DeleteMapping("/users/delete")
//    public ArrayList<String> deleteUser(@RequestBody int index) {
//        users.remove(index);
//        return users;
//    }

}
