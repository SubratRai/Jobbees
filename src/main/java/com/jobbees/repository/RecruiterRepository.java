package com.jobbees.repository;

import com.jobbees.entities.Recruiter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {
    Recruiter findByCompany(String email);
    Recruiter findByEmployeeId(String employeeId);
    Recruiter findByEmail(String email);
    Recruiter findByName(String name);
    Recruiter findByPhone(Long phone);
}
