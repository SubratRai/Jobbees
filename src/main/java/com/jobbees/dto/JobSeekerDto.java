package com.jobbees.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

public class JobSeekerDto {
    @NotBlank(message ="name should not blank")
    private String name;

    @Email(message ="email should not null")
    private String email;
    @NotBlank(message ="password should not blank")
    private String password;
    @NotNull(message = "phone number should not null")
    private Long phone;
    @NotNull(message="resumelink should not be null")
    private String resumeLink;
    @NotNull(message = "skill necessary")
    private String skills;
    @NotNull(message = "Experience required")
    private String experience;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public Long getPhone(){
        return phone;
    }
    public void setPhone(Long phone){
        this.phone= phone;
    }
    public String getResumeLink(){
        return resumeLink;
    }
    public void setResumeLink(String resumeLink){
        this.resumeLink=resumeLink;
    }
    public String getSkills(){
        return skills;
    }
    public void setSkills(String skills){
        this.skills=skills;
    }
    public String getExperience(){
        return experience;
    }
    public void setExperience(){
        this.experience=experience;
    }

}
