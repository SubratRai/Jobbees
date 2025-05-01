package com.jobbees.services;

import com.jobbees.dto.LoginRequest;
import com.jobbees.dto.RecruiterDto;
import com.jobbees.entities.Recruiter;

public interface RecruiterService {
    Recruiter saveRecruiter(Recruiter recruiter);
    boolean loginRecruiter(LoginRequest loginRequest);
    Recruiter register(Recruiter recruiter);
    Recruiter saveRecruiter(RecruiterDto recruiterDto);

    Recruiter findByCompany(String company);
    Recruiter findByEmployeeId(String employeeId);
    Recruiter findByEmail(String email);
    Recruiter findByName(String name);
    Recruiter findByPhone(Long phone);
}
