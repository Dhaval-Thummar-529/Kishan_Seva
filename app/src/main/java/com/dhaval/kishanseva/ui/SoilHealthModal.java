package com.dhaval.kishanseva.ui;

public class SoilHealthModal {

    String LabName;
    long PhoneNumber;
    int SerialNumber;

    public SoilHealthModal() {

    }

    public SoilHealthModal(String labName, long phoneNumber, int serialNumber) {
        LabName = labName;
        PhoneNumber = phoneNumber;
        SerialNumber = serialNumber;
    }

    public String getLabName() {
        return LabName;
    }

    public void setLabName(String labName) {
        LabName = labName;
    }

    public long getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        SerialNumber = serialNumber;
    }
}
