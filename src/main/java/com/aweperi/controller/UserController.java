package com.aweperi.controller;

import com.aweperi.model.User;
import com.aweperi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<User> fetchUsers() {
        var users = userService.findAll();
        return users;
    }

//    @PostMapping("/users/add")
//    public ArrayList<String> addUser(@RequestBody String name) {
//        this.users.add(name);
//        return users;
//    }
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
