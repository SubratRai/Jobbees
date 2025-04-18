package com.jobbees.repository;

import com.jobbees.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
    Job findByJobTitle(String jobTitle);

    Job findByJobLocation(String jobLocation);

}