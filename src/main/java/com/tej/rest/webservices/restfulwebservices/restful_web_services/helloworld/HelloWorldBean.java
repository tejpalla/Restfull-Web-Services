package com.tej.rest.webservices.restfulwebservices.restful_web_services.helloworld;

public class HelloWorldBean {

    private String message;

    HelloWorldBean(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    @Override
    public String toString(){
        return "Hello World Bean Message : " + message;
    }
}
