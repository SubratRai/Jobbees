package com.jobbees.controller;

import com.jobbees.dto.JobDto;
import com.jobbees.entities.Job;
import com.jobbees.services.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/job")//pathh creation of url
public class JobController {

    @Autowired// injection
    private JobService jobService;

    //saving data
    @PostMapping("/saveEntity")
    public Job saveJob(@RequestBody Job job){
        return jobService.saveJob(job);
    }
    @PostMapping("/saveDto")
    public Job saveJob(@RequestBody @Valid JobDto jobDto){
        return jobService.saveJob(jobDto);
    }

    //retriving data
    @GetMapping("/getByJobTitle/{jobTitle}")
    public Job findByJobTitle(@PathVariable String jobTitle){
        return jobService.findByJobTitle(jobTitle);
    }
    @GetMapping("/getByJobLocation/{jobLocation}")
    public Job findByJobLocation(@PathVariable String jobLocation){
        return jobService.findByJobLocation(jobLocation);
    }

}
