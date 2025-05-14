package com.tej.rest.webservices.restfulwebservices.restful_web_services.user;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {

    private int id; 

    @Size(min = 2, message = "Name should have atleast two characters.")
    private String name; 

    @Past(message = "Birth date should be in the past")
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
