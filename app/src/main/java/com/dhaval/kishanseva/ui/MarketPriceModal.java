package com.dhaval.kishanseva.ui;

public class MarketPriceModal {
    String cropname;
    String date;
    String location;
    String price;
    public MarketPriceModal(){

    }

    public MarketPriceModal(String cropname, String date, String location, String price) {
        this.cropname = cropname;
        this.date = date;
        this.location = location;
        this.price = price;
    }

    public String getCropname() {
        return cropname;
    }

    public void setCropname(String cropname) {
        this.cropname = cropname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
