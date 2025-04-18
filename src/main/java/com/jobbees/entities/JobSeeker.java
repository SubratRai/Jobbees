package com.jobbees.entities;

import jakarta.persistence.Entity;


@Entity
public class JobSeeker extends User {

    private String resumeLink;
    private String skills;
    private String experience;

    public JobSeeker(){}

    public JobSeeker(Long id, String name,String email, String password, Long phone,String resumeLink, String skills, String experience ){
        super(id, name, email, password, phone);
        this.resumeLink=resumeLink;
        this.skills=skills;
        this.experience=experience;
    }

    //getter setter


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
