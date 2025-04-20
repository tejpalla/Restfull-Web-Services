package com.tej.rest.webservices.restfulwebservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping("/hello-world") //@RequestMapping(method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello-world1/path-variable/{name}") //@RequestMapping(method = RequestMethod.GET)
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World , %s", name));
    }

}
