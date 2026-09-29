package com.cfs.SpringBootP03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/Hello")
    public String hello()
    {
        return "Hello from GetMapping";
    }

    @GetMapping("/Student")
    public List<String> getSttudents()
    {
        return List.of("Litu, Rosan, Pabitra");
    }
}
