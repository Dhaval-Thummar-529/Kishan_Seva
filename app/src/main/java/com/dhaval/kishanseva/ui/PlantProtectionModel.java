package com.dhaval.kishanseva.ui;

public class PlantProtectionModel {

    String schemeassistance;
    String schemeby;
    String schemename;

    public PlantProtectionModel() {
    }

    public PlantProtectionModel(String schemeassistance, String schemeby, String schemename) {
        this.schemeassistance = schemeassistance;
        this.schemeby = schemeby;
        this.schemename = schemename;
    }

    public String getSchemeassistance() {
        return schemeassistance;
    }

    public void setSchemeassistance(String schemeassistance) {
        this.schemeassistance = schemeassistance;
    }

    public String getSchemeby() {
        return schemeby;
    }

    public void setSchemeby(String schemeby) {
        this.schemeby = schemeby;
    }

    public String getSchemename() {
        return schemename;
    }

    public void setSchemename(String schemename) {
        this.schemename = schemename;
    }
}
