
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Wind {

    @SerializedName("speed")
    @Expose
    private double speed;
    @SerializedName("deg")
    @Expose
    private int deg;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Wind withSpeed(double speed) {
        this.speed = speed;
        return this;
    }

    public int getDeg() {
        return deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    public Wind withDeg(int deg) {
        this.deg = deg;
        return this;
    }

}
