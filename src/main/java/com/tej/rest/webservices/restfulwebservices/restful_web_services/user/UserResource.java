package com.tej.rest.webservices.restfulwebservices.restful_web_services.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    private UserDaoService service;
    
    UserResource(UserDaoService service){
        this.service = service;
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return service.findAll();
    }

    @GetMapping("/users/{id}")
    public User findOne(@PathVariable int id){
        return service.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
        service.save(user);
    }

}
