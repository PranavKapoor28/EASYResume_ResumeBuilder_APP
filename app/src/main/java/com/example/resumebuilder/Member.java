package com.example.resumebuilder;

public class Member {
public String st;
public String st1;
public String st2;
public String st3;
public String st4;


    public Member() {

    }

    public Member(String name, String ph,String email, String add, String lang) {
        st = name;
        st1 = ph;
        st2 = email;
        st3 = add;
        st4 = lang;
    }

    public String getName() {
        return st;
    }

    public void setName(String name) {
        st = name;
    }

    public String getPh() {
        return st1;
    }

    public void setPh(String ph) {
        st1 = ph;
    }

    public String getEmail() {
        return st2;
    }

    public void setEmail(String email) {

        this.st2 = email;
    }

    public String getAdd() {
        return st3;
    }

    public void setAdd(String add) {

        this.st3 = add;
    }

    public String getLang() {
        return st4;
    }

    public void setLang(String lang) {

        this.st4 = lang;
    }
}
