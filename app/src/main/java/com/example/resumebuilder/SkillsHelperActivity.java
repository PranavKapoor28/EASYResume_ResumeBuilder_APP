package com.example.resumebuilder;

public class SkillsHelperActivity {
 String personalskills,technicalskills,functionaskills;
    public SkillsHelperActivity(){
    }

    public SkillsHelperActivity(String personalskills,String technicalskills,String functionaskills){

        this.personalskills=personalskills;
        this.technicalskills=technicalskills;
        this.functionaskills=functionaskills;
    }

    public String getFunctionaskills() {
        return functionaskills;
    }

    public void setFunctionaskills(String functionaskills) {
        this.functionaskills = functionaskills;
    }

    public String getPersonalskills() {
        return personalskills;
    }

    public void setPersonalskills(String personalskills) {
        this.personalskills = personalskills;
    }

    public String getTechnicalskills() {
        return technicalskills;
    }

    public void setTechnicalskills(String technicalskills) {
        this.technicalskills = technicalskills;
    }
}
