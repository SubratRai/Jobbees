package com.jobbees.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class RecruiterDto {

    //required feild leni hai bss jiski jarurat hai

    @NotBlank(message="companey required")
    private String company;

    @NotNull(message = "EmployeeId required")
    private String employeeId;

    @Email
    private String email;
    @NotNull(message = "phone number required")
    private Long phone;
    @NotBlank(message="name required")
    private String name;



    //fir getter setter bnao


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}
