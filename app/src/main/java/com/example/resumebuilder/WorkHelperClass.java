package com.example.resumebuilder;

public class WorkHelperClass {

    String company,role,sdate,edate,responsibility;

    public WorkHelperClass(){
    }

    public WorkHelperClass(String company,String role,String sdate,String edate,String responsibility){

   this.company=company;
   this.role=role;
   this.sdate=sdate;
   this.edate=edate;
   this.responsibility=responsibility;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(String responsibility) {
        this.responsibility = responsibility;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }
}

