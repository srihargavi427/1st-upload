package com.org.hpp.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation= "bittu")

public class Subject {
    private int subjectid;
/*
    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubWing() {
        return subWing;
    }

    public void setSubWing(String subWing) {
        this.subWing = subWing;
    }

    public int getSubCode() {
        return subCode;
    }

    public void setSubCode(int subCode) {
        this.subCode = subCode;
    }*/

    private String subName;
    private String subWing;
    private int subCode;
    private double subSalary;

    /*public double getSubSalary() {
        return subSalary;
    }

    public void setSubSalary(double subSalary) {
        this.subSalary = subSalary;
    }

    public String getSubLocation() {
        return subLocation;
    }

    public void setSubLocation(String subLocation) {
        this.subLocation = subLocation;
    }

    public String getSubDesignation() {
        return subDesignation;
    }

    public void setSubDesignation(String subDesignation) {
        this.subDesignation = subDesignation;
    }
*/
    private String subLocation;
    private String subDesignation;


}
