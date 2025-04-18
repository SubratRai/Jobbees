package com.jobbees.entities;

import jakarta.persistence.Entity;


@Entity
public class Recruiter extends User {

    private String company;
    private String employeeId;
    private String post;

    public Recruiter(){}
    public Recruiter(Long id, String name, String email, String password, Long phone, String company, String employeeId, String post){
         super(id, name, email, password, phone);
         this.company = company;
         this.employeeId=employeeId;
         this.post=post;
    }

    //getter setter



   public String getCompany(){
        return company;
   }
   public String getEmployeeId(){
        return employeeId;
   }
   public String getPost(){
        return post;
   }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setPost(String post) {
        this.post = post;
    }
}
