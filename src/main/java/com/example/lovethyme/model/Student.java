package com.example.lovethyme.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Student {
@NotNull(message = "is required please")
@Size(min=1, message = "is required")
    private String firstName="";


    private String lastName;
private String country;

    public void setCountry(String country) {
        this.country = country;
    }
    private String favoriteLanguage;

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }


    private List<String> favoriteSystems;

    public List<String> getFavoriteSystems() {
        return favoriteSystems;
    }

    public void setFavoriteSystems(List<String> favoriteSystems) {
        this.favoriteSystems = favoriteSystems;
    }

    public String getCountry() {
        return country;
    }

    public Student(){

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
