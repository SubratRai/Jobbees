package com.jobbees.repository;

import com.jobbees.entities.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Long> {
    JobSeeker findByEmail(String email);   //custom query to find jobseeker by email
}
