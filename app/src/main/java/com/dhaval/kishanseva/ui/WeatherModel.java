package com.dhaval.kishanseva.ui;

public class WeatherModel {

    String time;
    String temp;
    String img;
    String wind;

    public WeatherModel(String time, String temp, String img, String wind) {
        this.time = time;
        this.temp = temp;
        this.img = img;
        this.wind = wind;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }
}
