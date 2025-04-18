package com.jobbees.controller;

import com.jobbees.dto.loginRequest;
import com.jobbees.entities.Admin;
import com.jobbees.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    //Injecting the AdminService so we can use its methods
    @Autowired
    private AdminService adminService;

    //1. API to register a new admin
    @PostMapping("/register")
    public ResponseEntity<Admin> registerAdmin(@RequestBody Admin admin){

        // call the service to save the admin
        Admin savedAdmin= adminService.saveAdmin(admin);

        // return a response with the saved admin and status 200 ok
        return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
    }

    //2. Api to login an admin
    @PostMapping("/login")
    public ResponseEntity<String> loginAdmin(@RequestBody loginRequest loginRequest){

        // check if login is valid
        boolean isValid = adminService.validateAdmin(loginRequest.getEmail(), loginRequest.getPassword());

        if (isValid){
            return ResponseEntity.ok("Login Successful!");
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");

        }
    }

}
