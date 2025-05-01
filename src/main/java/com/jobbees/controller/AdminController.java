package com.jobbees.controller;


import com.jobbees.dto.AdminDto;
import com.jobbees.dto.LoginRequest;
import com.jobbees.entities.Admin;
import com.jobbees.services.AdminService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin") // base URL

public class AdminController {

    @Autowired //service injection
    private AdminService adminService;

    //saving admin
    @PostMapping("/saveEntity")
    public Admin saveAdmin(@RequestBody Admin admin){
        return adminService.saveAdmin(admin);
    }
    @PostMapping("/saveDto")
    public Admin saveAdmin(@RequestBody @Valid AdminDto adminDto){
        return adminService.saveAdmin(adminDto);
    }

    @PostMapping("/register")
    public ResponseEntity<Admin> register(@RequestBody Admin admin){
        Admin saveAdmin=adminService.register(admin);
        return new ResponseEntity<>(saveAdmin, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginAdmin(@RequestBody LoginRequest loginRequest){
        boolean isAuthenticated = adminService.loginAdmin(loginRequest);

        if(isAuthenticated){
            return ResponseEntity.ok("Login Successful");
        }
        else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
        }
    }

    //getting/retriving data of admin from DB using email
    @GetMapping("/getByEmail/{email}")
    public Admin findByEmail(@PathVariable String email){
        return adminService.findByEmail(email);
    }
    @GetMapping("/getByName/{name}")
    public Admin findByName(@PathVariable String name){
        return adminService.findByName(name);
    }


}
