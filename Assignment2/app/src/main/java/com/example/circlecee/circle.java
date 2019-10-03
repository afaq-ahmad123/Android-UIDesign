package com.example.circlecee;

public class circle {
    String name;
    String Description;
    String city;
    String uni_name;
    int thumbnail;

    public circle() {
    }

    public circle(String name, String description, String city, String uni_name,int thumbnail) {
        this.name = name;
        Description = description;
        this.city = city;
        this.uni_name = uni_name;
        this.thumbnail=thumbnail;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setUni_name(String uni_name) {
        this.uni_name = uni_name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public String getCity() {
        return city;
    }

    public String getUni_name() {
        return uni_name;
    }
}
