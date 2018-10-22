/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.Ecommerse;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bigza
 */
@RestController
@CrossOrigin(origins = "http://localhost:8080",allowCredentials = "true")
public class EcommerseController {
    @Autowired
    UserRepository userRepository;
    
    @GetMapping("/")
    public String test(){
        return userRepository.findById(1l).get().getMessage();
    }
}
