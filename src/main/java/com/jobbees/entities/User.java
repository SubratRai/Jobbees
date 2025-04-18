package com.jobbees.entities;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)// important
public class User {

    //primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //normal variables
    private String name;
    private String email;
    private String password;
    private Long phone;

    public User (){}

    public User(Long id, String name, String email, String password, Long phone){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.phone=phone;
    }

    //getter setter

    public Long getId(){
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
}
