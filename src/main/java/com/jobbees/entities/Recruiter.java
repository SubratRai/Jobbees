package com.jobbees.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Recruiter  {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String employeeId;
    private String post;
    private String name;
    private String email;
    private String password;
    private Long phone;

    public Recruiter(){}
    public Recruiter(Long id, String name, String email, String password, Long phone, String company, String employeeId, String post){
         this.id=id;
         this.name=name;
         this.email=email;
         this.password=password;
         this.phone=phone;
         this.company = company;
         this.employeeId=employeeId;
         this.post=post;
    }

    //getter setter

    public Long getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public Long getPhone(){
        return phone;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhone(Long phone) {
        this.phone = phone;
    }
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
