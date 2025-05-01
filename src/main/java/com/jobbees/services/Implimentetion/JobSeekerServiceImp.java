package com.jobbees.services.Implimentetion;

import com.jobbees.dto.JobSeekerDto;
import com.jobbees.dto.LoginRequest;
import com.jobbees.entities.JobSeeker;
import com.jobbees.services.JobSeekerService;
import com.jobbees.repository.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class JobSeekerServiceImp implements JobSeekerService {

    @Autowired
    private JobSeekerRepository jobSeekerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public JobSeeker register(JobSeeker jobSeeker){
        String encodedPassword = passwordEncoder.encode(jobSeeker.getPassword());
        jobSeeker.setPassword(encodedPassword);

        return jobSeekerRepository.save(jobSeeker);
    }
    @Override
    public boolean loginJobSeeker(@RequestBody LoginRequest loginRequest){
        JobSeeker jobSeeker = jobSeekerRepository.findByEmail(loginRequest.getEmail());
        if(jobSeeker == null){
            return false;
        }else{
            return passwordEncoder.matches(loginRequest.getPassword(), jobSeeker.getPassword());
        }
    }

    @Override
    public JobSeeker saveJobSeeker(JobSeeker jobSeeker){
        System.out.println("saving jobSeeker: " + jobSeeker);
        return jobSeekerRepository.save(jobSeeker);
    }


    @Override
    public JobSeeker findBySkills(String skills)
    {
        return jobSeekerRepository.findBySkills(skills);
    }
    @Override
    public JobSeeker findByExperience(String experience){
        return jobSeekerRepository.findByExperience(experience);
    }
    @Override
    public JobSeeker findByEmail(String email){
        return jobSeekerRepository.findByEmail(email);
    }
    @Override
    public JobSeeker findByName(String name){
        return jobSeekerRepository.findByName(name);
    }
    @Override
    public JobSeeker findByPhone(Long phone){
        return jobSeekerRepository.findByPhone(phone);
    }
    @Override
    public JobSeeker saveJobSeeker(JobSeekerDto jobSeekerDto){
        JobSeeker jobSeeker=new JobSeeker();

        jobSeeker.setExperience(jobSeekerDto.getExperience());
        jobSeeker.setSkills(jobSeekerDto.getSkills());
        jobSeeker.setName(jobSeekerDto.getName());
        jobSeeker.setEmail(jobSeekerDto.getEmail());
        jobSeeker.setPassword(jobSeekerDto.getPassword());
        jobSeeker.setResumeLink(jobSeekerDto.getResumeLink());
        jobSeeker.setPhone(jobSeekerDto.getPhone());


        return jobSeekerRepository.save(jobSeeker);
    }

}
