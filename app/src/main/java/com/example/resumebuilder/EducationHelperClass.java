package com.example.resumebuilder;

public class EducationHelperClass {

    String degree,instName,marks;


    public EducationHelperClass(){
    }

    public EducationHelperClass(String degree,String instName,String marks){

        this.degree=degree;
        this.instName=instName;
        this.marks=marks;
    }

    public String getDegree(){
        return degree;
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
