package com.jobbees.repository;

import com.jobbees.entities.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
    JobSeeker findBySkills(String skills);//custom query to find jobseeker by experience
    JobSeeker findByExperience(String experience);
    JobSeeker findByEmail(String email);
    JobSeeker findByName(String name);
    JobSeeker findByPhone(Long phone);

}
