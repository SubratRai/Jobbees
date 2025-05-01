package com.jobbees.controller;

import com.jobbees.dto.LoginRequest;
import com.jobbees.dto.RecruiterDto;
import com.jobbees.entities.Recruiter;
import com.jobbees.services.RecruiterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recruiter")
public class RecruiterController {

    @Autowired
    private RecruiterService recruiterService;

    @PostMapping("/saveEntity")
    public Recruiter saveRecruiter(@RequestBody Recruiter recruiter){
        return recruiterService.saveRecruiter(recruiter);
    }
    @PostMapping("/saveDto")
    public Recruiter saveRecruiter(@RequestBody @Valid RecruiterDto recruiterDto){
        return recruiterService.saveRecruiter(recruiterDto);
    }
    @PostMapping("/Register")
    public ResponseEntity<Recruiter> register(@RequestBody Recruiter recruiter){
        Recruiter savedRecruiter = recruiterService.register(recruiter);
        return new ResponseEntity<>(savedRecruiter, HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public ResponseEntity<String> loginRequest(@RequestBody LoginRequest loginRequest){
        boolean isAuthenticated = recruiterService.loginRecruiter(loginRequest);
        if(isAuthenticated){
            return ResponseEntity.ok("Login Successfull");
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
        }
    }

    @GetMapping("/name/{name}")
    public Recruiter findByName(@PathVariable String name){
        return recruiterService.findByName(name);
    }
    @GetMapping("/employeeId/{employeeId}")
    public Recruiter findByEmployeeId(@PathVariable String employeeId){
        return recruiterService.findByEmployeeId(employeeId);
    }
    @GetMapping("/company/{company}")
    public Recruiter findByCompany(@PathVariable String company){
        return recruiterService.findByCompany(company);
    }
    @GetMapping("/email/{email}")
    public Recruiter findByEmail(@PathVariable String email){
        return recruiterService.findByEmail(email);
    }
    @GetMapping("/phone/{phone}")
    public Recruiter findByPhone(@PathVariable Long phone){
        return recruiterService.findByPhone(phone);
    }
}
