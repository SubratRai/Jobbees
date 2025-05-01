package com.jobbees.services.Implimentetion;

import com.jobbees.dto.JobDto;
import com.jobbees.entities.Job;
import com.jobbees.repository.JobRepository;
import com.jobbees.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobServiceImp implements JobService {

    @Autowired
    private JobRepository jobRepository;

    @Override
    public Job saveJob (Job job){
        return jobRepository.save(job);
    }
    @Override
    public Job findByJobTitle(String jobTitle){
        System.out.println("finding job by title: " + jobTitle);
        return jobRepository.findByJobTitle(jobTitle);
    }
    @Override
    public Job findByJobLocation(String jobLocation){
        return jobRepository.findByJobLocation(jobLocation);
    }
    @Override
    public Job saveJob(JobDto jobDto){
        Job job = new Job();
        job.setJobTitle(job.getJobTitle());
        job.setJobLocation(job.getJobLocation());

        return jobRepository.save(job);
    }

}
