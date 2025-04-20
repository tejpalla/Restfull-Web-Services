package com.tej.rest.webservices.restfulwebservices.restful_web_services.user;

import java.time.LocalDate;

public class User {
    private int id; 
    private String name; 
    private LocalDate birthDate; 

    User(int id, String name, LocalDate birthDate){
        this.id = id;
        this.name = name; 
        this.birthDate = birthDate;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setBirthDate(LocalDate date){
        birthDate = date;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public String toString(){
        return "User id : " + id + "name : "+name + "birthDate : " + birthDate; 
    }
    
}
