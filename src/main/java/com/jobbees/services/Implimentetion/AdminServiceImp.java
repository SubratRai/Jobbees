package com.jobbees.services.Implimentetion;

import com.jobbees.dto.AdminDto;
import com.jobbees.dto.LoginRequest;
import com.jobbees.entities.Admin;
import com.jobbees.repository.AdminRepository;
import com.jobbees.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImp implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Admin register(Admin admin){

       String encodedPassword = passwordEncoder.encode(admin.getPassword());
        admin.setPassword(encodedPassword);

        return adminRepository.save(admin);
    }
    @Override
    public boolean loginAdmin(LoginRequest loginRequest){
        Admin admin = adminRepository.findByEmail(loginRequest.getEmail());
        if(admin == null){
            return false;
        }else{
            return passwordEncoder.matches(loginRequest.getPassword(), admin.getPassword());
        }
    }

    @Override
    public Admin saveAdmin(Admin admin){
        System.out.println("Saving admin: " + admin);
        return adminRepository.save(admin);
    }
    @Override
    public Admin findByEmail(String email){
        return adminRepository.findByEmail(email);
    }
    @Override
    public Admin findByName(String name){
        System.out.println("Admin name: " + name);
        return adminRepository.findByName(name);
    }
    @Override
    public Admin saveAdmin(AdminDto adminDto){
        Admin admin=new Admin();

        //mannual mapping
        admin.setName(adminDto.getName());
        admin.setEmail(adminDto.getEmail());

        return adminRepository.save(admin);
    }

}
