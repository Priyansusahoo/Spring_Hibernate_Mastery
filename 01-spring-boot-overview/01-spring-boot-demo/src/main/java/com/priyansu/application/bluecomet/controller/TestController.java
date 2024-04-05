package com.priyansu.application.bluecomet.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * NOTE 1:
 * Here @Controller + @ResponseBody = @RestController
 * This annotation is a specialization of @Controller.
 * It is used to create REST-ful web services that return JSON/XML responses directly to the client
 * instead of rendering a view.
 * Essentially, @RestController combines @Controller and @ResponseBody,
 * where every method implicitly serializes return objects into
 * JSON/XML and sends it as an HTTP response.
 *
 * We can also use @Controller for the CLASS and for that specific METHOD we can use @ResponseBody.
 */
@Controller // refer to NOTE 1.
public class TestController {

    /**
     * NOTE 2:
     * "TestController.name" is defined in "application.properties" and by
     * using @Value springboot injects the value of "TestController.name" i.e. "Priyansu" to field "name".
     */
    @Value("${TestController.name}") // refer to NOTE 2.
    private String name;

    @GetMapping("/")
    @ResponseBody
    public String test(){
        return this.name; // Here we return the "name" field injected by springboot from "application.properties"
    }
}
