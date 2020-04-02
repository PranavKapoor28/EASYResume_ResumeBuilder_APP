package com.example.resumebuilder;

public class Member {
private String Name;
private String Ph;
private String email;
private String add;
private String lang;


    public Member() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPh() {
        return Ph;
    }

    public void setPh(String ph) {
        Ph = ph;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
