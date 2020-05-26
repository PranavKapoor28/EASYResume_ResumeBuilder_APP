package com.example.resumebuilder;

public class ResumeHelperClass {

    String name,phone,email,address,language;


    public ResumeHelperClass(){
    }

    public ResumeHelperClass(String name,String phone,String email,String address,String language){

        this.name=name;
        this.phone=phone;
        this.email=email;
        this.address=address;
        this.language=language;

    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
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
}
