package com.jobbees.controller;

import com.jobbees.dto.JobSeekerDto;
import com.jobbees.dto.LoginRequest;
import com.jobbees.entities.JobSeeker;
import com.jobbees.services.JobSeekerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobSeeker")
public class JobSeekerController {

    @Autowired
    private JobSeekerService jobSeekerService;
    @PostMapping("/saveEntity")
    public JobSeeker saveJobSeeker(@RequestBody JobSeeker jobSeeker){
        return jobSeekerService.saveJobSeeker(jobSeeker);
    }
    @PostMapping("/saveDto")
    public JobSeeker saveJobSeeker(@RequestBody @Valid JobSeekerDto jobSeekerDto){
        return jobSeekerService.saveJobSeeker(jobSeekerDto);
    }

    @PostMapping("/Register")
    public ResponseEntity<JobSeeker> register (@RequestBody JobSeeker jobSeeker){
        JobSeeker savedJobSeeker = jobSeekerService.register(jobSeeker);
        return new ResponseEntity<>(savedJobSeeker, HttpStatus.CREATED);
    }
    @PostMapping("/login")
    public ResponseEntity<String> loginJobSeeker(@RequestBody LoginRequest loginRequest){
        boolean isAuthenticated = jobSeekerService.loginJobSeeker(loginRequest);
        if(isAuthenticated){
            return ResponseEntity.ok("Login Successfull");
        }else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials");
        }
    }
    @GetMapping("/email/{email}")
    public JobSeeker findByEmail(@PathVariable String email){
        return jobSeekerService.findByEmail(email);
    }
    @GetMapping("/name/{name}")
    public JobSeeker findByName(@PathVariable String name){
        return jobSeekerService.findByName(name);
    }
    @GetMapping("/phone/{phone}")
    public JobSeeker findByPhone(@PathVariable Long phone){
        return jobSeekerService.findByPhone(phone);
    }


}