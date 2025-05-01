package com.jobbees.services;

import com.jobbees.dto.AdminDto;
import com.jobbees.dto.LoginRequest;
import com.jobbees.entities.Admin;

public interface AdminService {
    Admin saveAdmin(Admin admin);
    Admin saveAdmin(AdminDto adminDto);
    Admin register(Admin admin);
    boolean loginAdmin(LoginRequest loginRequest);
    Admin findByEmail(String email);
    Admin findByName(String name);
}
