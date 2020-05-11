package com.example.resumebuilder;

public class ResumeModel {

    private String name, phone, email, address, language, ed1, institute1, marks1, pskills, tskills, fskills;

    public ResumeModel() {
    }

    public ResumeModel(String name, String phone, String email, String address, String language, String ed1, String institute1, String marks1, String pskills, String tskills, String fskills) {

        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.language = language;
        this.ed1 = ed1;
        this.institute1 = institute1;
        this.marks1 = marks1;
        this.pskills = pskills;
        this.tskills = tskills;
        this.fskills = fskills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEd1() {
        return ed1;
    }

    public void setEd1(String ed1) {
        this.ed1 = ed1;
    }

    public String getInstitute1() {
        return institute1;
    }

    public void setInstitute1(String institute1) {
        this.institute1 = institute1;
    }

    public String getMarks1() {
        return marks1;
    }

    public void setMarks1(String marks1) {
        this.marks1 = marks1;
    }

    public String getPskills() {
        return pskills;
    }

    public void setPskills(String pskills) {
        this.pskills = pskills;
    }

    public String getTskills() {
        return tskills;
    }

    public void setTskills(String tskills) {
        this.tskills = tskills;
    }

    public String getFskills() {
        return fskills;
    }

    public void setFskills(String fskills) {
        this.fskills = fskills;
    }

    @Override
    public String toString() {
        return "ResumeData{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}


