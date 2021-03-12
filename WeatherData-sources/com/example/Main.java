
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Main {

    @SerializedName("temp")
    @Expose
    private double temp;
    @SerializedName("feels_like")
    @Expose
    private double feelsLike;
    @SerializedName("temp_min")
    @Expose
    private double tempMin;
    @SerializedName("temp_max")
    @Expose
    private double tempMax;
    @SerializedName("pressure")
    @Expose
    private int pressure;
    @SerializedName("sea_level")
    @Expose
    private int seaLevel;
    @SerializedName("grnd_level")
    @Expose
    private int grndLevel;
    @SerializedName("humidity")
    @Expose
    private int humidity;
    @SerializedName("temp_kf")
    @Expose
    private int tempKf;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public Main withTemp(double temp) {
        this.temp = temp;
        return this;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Main withFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public Main withTempMin(double tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public Main withTempMax(double tempMax) {
        this.tempMax = tempMax;
        return this;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public Main withPressure(int pressure) {
        this.pressure = pressure;
        return this;
    }

    public int getSeaLevel() {
        return seaLevel;
    }

    public void setSeaLevel(int seaLevel) {
        this.seaLevel = seaLevel;
    }

    public Main withSeaLevel(int seaLevel) {
        this.seaLevel = seaLevel;
        return this;
    }

    public int getGrndLevel() {
        return grndLevel;
    }

    public void setGrndLevel(int grndLevel) {
        this.grndLevel = grndLevel;
    }

    public Main withGrndLevel(int grndLevel) {
        this.grndLevel = grndLevel;
        return this;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public Main withHumidity(int humidity) {
        this.humidity = humidity;
        return this;
    }

    public int getTempKf() {
        return tempKf;
    }

    public void setTempKf(int tempKf) {
        this.tempKf = tempKf;
    }

    public Main withTempKf(int tempKf) {
        this.tempKf = tempKf;
        return this;
    }

}
