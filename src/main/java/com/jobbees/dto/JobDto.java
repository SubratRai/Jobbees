package com.jobbees.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class JobDto {
    @NotNull(message = "job title requires")
    private String jobLocation;
    @NotBlank(message = "job title requires")
    private String jobTitle;

    public String getJobTitle(){
        return jobTitle;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
    }
    public String getJobLocation(){
        return jobLocation;
    }
    public void setJobLocation(String jobLocation){
        this.jobLocation=jobLocation;    }
}
