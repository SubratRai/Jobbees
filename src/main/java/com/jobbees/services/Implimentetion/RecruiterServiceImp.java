package com.jobbees.services.Implimentetion;

import com.jobbees.dto.LoginRequest;
import com.jobbees.dto.RecruiterDto;
import com.jobbees.entities.Recruiter;
import com.jobbees.repository.RecruiterRepository;
import com.jobbees.services.RecruiterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RecruiterServiceImp implements RecruiterService {

    @Autowired
    private RecruiterRepository recruiterRepository;

    //jo hamne bean bnai thi config file me usko inject krte hue
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Recruiter register (Recruiter recruiter){
        //password ho encode (hash) krr rhe hai
        String encodedPassword = passwordEncoder.encode(recruiter.getPassword());
        // ab orignal password ki jgah ham encoded password set krr rhe hai
        recruiter.setPassword(encodedPassword);

        // ab db me recruiter ko save krr rhe hai (jo ab secure password ke sath hoga)
        return recruiterRepository.save(recruiter);
    }
    @Override
    public boolean loginRecruiter(LoginRequest loginRequest){
        //pahle recruiter ko data base se email ki held se nekal rhe hai
        Recruiter recruiter = recruiterRepository.findByEmail(loginRequest.getEmail());
        // agar nai mila recruiter to exception throw krenge ki nai mila
        if(recruiter == null){
            return false;
        }
        // ab password ke sath check
        else{
            return passwordEncoder.matches(loginRequest.getPassword(), recruiter.getPassword());
        }


    }

    @Override
    public Recruiter saveRecruiter(Recruiter recruiter){
        System.out.println("saving recruiter: " + recruiter);
        return recruiterRepository.save(recruiter);
    }

    @Override
    public Recruiter findByEmail(String email){
        return recruiterRepository.findByEmail(email);
    }
    @Override
    public Recruiter findByName(String name){
        return recruiterRepository.findByName(name);
    }
    @Override
    public Recruiter findByPhone(Long phone){
        return recruiterRepository.findByPhone(phone);
    }
    @Override
    public Recruiter findByCompany(String company){
        return recruiterRepository.findByCompany(company);
    }
    @Override
    public Recruiter findByEmployeeId(String employeeId){
        return recruiterRepository.findByEmployeeId(employeeId);
    }

    @Override
    public Recruiter saveRecruiter(RecruiterDto recruiterDto){
       Recruiter recruiter = new Recruiter();

       //manual mapping from dto to entity
        recruiter.setCompany(recruiterDto.getCompany());
        recruiter.setEmployeeId(recruiterDto.getEmployeeId());
        recruiter.setName(recruiterDto.getName());
        recruiter.setPhone(recruiterDto.getPhone());
        recruiter.setEmail(recruiterDto.getEmail());




        return recruiterRepository.save(recruiter);
    }

}
