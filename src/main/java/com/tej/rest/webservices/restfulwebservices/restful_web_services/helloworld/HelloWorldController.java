package com.tej.rest.webservices.restfulwebservices.restful_web_services.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    
    private MessageSource messageSource;
    
    HelloWorldController(MessageSource messageSource){
        this.messageSource = messageSource;
    }
    @GetMapping("/hello-world") //@RequestMapping(method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello-world1/path-variable/{name}") //@RequestMapping(method = RequestMethod.GET)
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World , %s", name));
    }

    @GetMapping("/hello-world-internationalized")
    public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale );
	}

}
