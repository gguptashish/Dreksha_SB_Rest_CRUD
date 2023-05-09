package com.luv2Code.springbootRESTcrud.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Dreksha")
public class DemoRestController {

    @GetMapping("/getFirst")
    public String getMethod() {
        return "Hello World";
    }
}
