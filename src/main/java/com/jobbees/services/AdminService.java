package com.jobbees.services;

import com.jobbees.entities.Admin;
import com.jobbees.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    public Admin registerAdmin(Admin admin){
        return adminRepository.save(admin);
    }
    public Admin findAdminByEmail(String email){
        return adminRepository.findByEmail(email);
    }
    public Admin saveAdmin(Admin admin){
        return adminRepository.save(admin);

    }
    public boolean validateAdmin(String email, String password){

       //find the admin using email from the database
        Admin admin=adminRepository.findByEmail(email);

        //check if admin exist and password is matched or not
        if(admin!=null && admin.getPassword().equals(password)){
            return true;// login successful
        }
        else{
            return false;// invalid credentials
        }

    }
}
