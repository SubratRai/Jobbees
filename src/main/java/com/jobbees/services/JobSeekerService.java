package com.jobbees.services;

import com.jobbees.dto.JobSeekerDto;
import com.jobbees.dto.LoginRequest;
import com.jobbees.entities.JobSeeker;

public interface JobSeekerService {
    JobSeeker saveJobSeeker(JobSeeker jobSeeker);
    JobSeeker saveJobSeeker(JobSeekerDto jobSeekerDto);
    JobSeeker register(JobSeeker jobSeeker);
    boolean loginJobSeeker(LoginRequest loginRequest);

    JobSeeker findBySkills(String skills);
    JobSeeker findByExperience(String experience);
    JobSeeker findByEmail(String email);
    JobSeeker findByName(String name);
    JobSeeker findByPhone(Long phone);
}
