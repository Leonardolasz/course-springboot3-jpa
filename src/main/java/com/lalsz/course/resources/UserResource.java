package com.lalsz.course.resources;

import com.lalsz.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Steven Gerrard", "gerrard@email.com", "888888888", "1234");
        return ResponseEntity.ok().body(u);
    }
}
