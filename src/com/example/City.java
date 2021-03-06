
package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {

    @SerializedName("id")
    @Expose
    private double id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("coord")
    @Expose
    private Coord coord;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("population")
    @Expose
    private double population;
    @SerializedName("timezone")
    @Expose
    private double timezone;
    @SerializedName("sunrise")
    @Expose
    private double sunrise;
    @SerializedName("sunset")
    @Expose
    private double sunset;

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City withName(String name) {
        this.name = name;
        return this;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public City withCoord(Coord coord) {
        this.coord = coord;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public City withCountry(String country) {
        this.country = country;
        return this;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public City withPopulation(int population) {
        this.population = population;
        return this;
    }

    public double getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public City withTimezone(int timezone) {
        this.timezone = timezone;
        return this;
    }

    public double getSunrise() {
        return sunrise;
    }

    public void setSunrise(int sunrise) {
        this.sunrise = sunrise;
    }

    public City withSunrise(int sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public double getSunset() {
        return sunset;
    }

    public void setSunset(int sunset) {
        this.sunset = sunset;
    }

    public City withSunset(int sunset) {
        this.sunset = sunset;
        return this;
    }

}
