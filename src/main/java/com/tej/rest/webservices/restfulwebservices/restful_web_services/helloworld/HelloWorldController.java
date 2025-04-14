package com.tej.rest.webservices.restfulwebservices.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    @GetMapping("/hello-world") //@RequestMapping(method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }

}
