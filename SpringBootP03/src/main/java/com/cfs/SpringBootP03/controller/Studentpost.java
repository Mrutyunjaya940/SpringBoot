package com.cfs.SpringBootP03.controller;

import com.cfs.SpringBootP03.dto.StudentReqest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Studentpost {

    @PostMapping("/create")
    public String createStuent(@RequestBody StudentReqest reqest)
    {

        return "Student created: "+reqest.getName();
    }
}
