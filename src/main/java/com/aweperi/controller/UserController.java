package com.aweperi.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/users")
    public ArrayList<String> getUserId() {
        return users;
    }

    @PostMapping("/users/add")
    public ArrayList<String> addUser(@RequestBody String name) {
        this.users.add(name);
        return users;
    }

    @PutMapping("/users/update")
    public String update(@RequestBody String name, int index) {
        users.set(index, name);
       return users.get(index);
    }

    @DeleteMapping("/users/delete")
    public ArrayList<String> deleteUser(@RequestBody int index) {
        users.remove(index);
        return users;
    }

}
