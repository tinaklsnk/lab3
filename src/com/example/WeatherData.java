
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherData {

    @SerializedName("cod")
    @Expose
    private String cod;
    @SerializedName("message")
    @Expose
    private double message;
    @SerializedName("cnt")
    @Expose
    private double cnt;
    @SerializedName("list")
    @Expose
    private java.util.List<com.example.List> list = null;
    @SerializedName("city")
    @Expose
    private City city;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public WeatherData withCod(String cod) {
        this.cod = cod;
        return this;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public WeatherData withMessage(int message) {
        this.message = message;
        return this;
    }

    public double getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public WeatherData withCnt(int cnt) {
        this.cnt = cnt;
        return this;
    }

    public java.util.List<com.example.List> getList() {
        return list;
    }

    public void setList(java.util.List<com.example.List> list) {
        this.list = list;
    }

    public WeatherData withList(java.util.List<com.example.List> list) {
        this.list = list;
        return this;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public WeatherData withCity(City city) {
        this.city = city;
        return this;
    }

}
