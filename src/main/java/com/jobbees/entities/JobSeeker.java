package com.jobbees.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class JobSeeker  {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    private Long phone;
    private String resumeLink;
    private String skills;
    private String experience;

    public JobSeeker(){}

    public JobSeeker(Long id, String name,String email, String password, Long phone,String resumeLink, String skills, String experience ){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.phone=phone;
        this.resumeLink=resumeLink;
        this.skills=skills;
        this.experience=experience;
    }

    //getter setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Long getPhone() {
        return phone;}
    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getResumeLink() {
        return resumeLink;
    }
    public String getSkills(){
        return skills;
    }
    public String getExperience(){
        return experience;
    }

    public void setResumeLink(String resumeLink) {
        this.resumeLink = resumeLink;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
