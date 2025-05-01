package com.jobbees.repository;

import com.jobbees.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByEmail(String email);//custom query to find Admin by email
    Admin findByName(String name);
}
