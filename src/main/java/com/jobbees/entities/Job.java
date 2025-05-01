package com.jobbees.entities;

import jakarta.persistence.*;

@Entity
@Table(name="jobsTable")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String jobName;
    private String jobTitle;
    private String jobType;
    private String jobLocation;
    private String jobInfo;
    private String company;

    // no args constructor
    public Job (){}

    // all args constructor
    public Job(Long id, String jobName, String jobTitle, String jobType, String jobLocation, String jobInfo, String company){
         this.id=id;
         this.jobName=jobName;
         this.jobTitle=jobTitle;
         this.jobType =jobType;
         this.jobLocation=jobLocation;
         this.jobInfo=jobInfo;
         this.company=company;
    }

    public Long getId(){
        return id;
    }

    public String getJobName() {
        return jobName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getJobType() {
        return jobType;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public String getJobInfo() {
        return jobInfo;
    }

    public String getCompany() {
        return company;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setJobType(String jobType){
        this.jobType = jobType;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }
    public void setJobInfo(String jobInfo){
        this.jobInfo = jobInfo;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
