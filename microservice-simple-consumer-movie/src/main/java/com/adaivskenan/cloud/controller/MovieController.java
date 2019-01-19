package com.adaivskenan.cloud.controller;

import com.adaivskenan.cloud.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by adaivskenan on 19/01/2019.
 */

@RequestMapping("/movies")
@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("users/{id}")
    public User findById(@PathVariable Long id){
        User user = this.restTemplate.getForObject("http://localhost:8081/users/{id}",User.class, id);
        return user;
    }

}
