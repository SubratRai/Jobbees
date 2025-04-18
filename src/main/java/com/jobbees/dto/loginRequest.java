package com.jobbees.dto;

public class loginRequest {

    // this class is used to capture login request data (from the user)
     private String email;
     private String password;

     //Getters and setters
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    private void setEmail(String email){
        this.email=email;
    }
    private void setPassword(String password){
        this.password=password;
    }
}
