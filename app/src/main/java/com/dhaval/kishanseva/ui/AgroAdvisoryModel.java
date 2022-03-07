package com.dhaval.kishanseva.ui;

public class AgroAdvisoryModel {

    String advisorlocation;
    String advisorname;
    String advisornumber;

    public AgroAdvisoryModel() {
    }

    public AgroAdvisoryModel(String advisorlocation, String advisorname, String advisornumber) {
        this.advisorlocation = advisorlocation;
        this.advisorname = advisorname;
        this.advisornumber = advisornumber;
    }

    public String getAdvisorlocation() {
        return advisorlocation;
    }

    public void setAdvisorlocation(String advisorlocation) {
        this.advisorlocation = advisorlocation;
    }

    public String getAdvisorname() {
        return advisorname;
    }

    public void setAdvisorname(String advisorname) {
        this.advisorname = advisorname;
    }

    public String getAdvisornumber() {
        return advisornumber;
    }

    public void setAdvisornumber(String advisornumber) {
        this.advisornumber = advisornumber;
    }
}
