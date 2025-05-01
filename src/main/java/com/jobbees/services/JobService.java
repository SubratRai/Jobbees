package com.jobbees.services;

import com.jobbees.dto.JobDto;
import com.jobbees.entities.Job;

public interface JobService {
    Job saveJob(Job job);
    Job saveJob(JobDto jobDto);

    Job findByJobTitle(String jobTitle);
    Job findByJobLocation(String jobLocation);
}
