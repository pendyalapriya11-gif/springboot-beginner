package com.laxmipriya.WebProject.model;

public class User {
    private String name;
    private String image;
    private String gender;
    private Integer id;

    //default constuctor
    public User() {
    }
    //parameterised constructor
    public User(String name, String image, String gender, Integer id) {
        this.name = name;
        this.image = image;
        this.gender = gender;
        this.id = id;
    }
    //GETTERS AND SETTERS
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getGender() {
        return this.gender;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }

}