package com.cfs.SpringBootP03.controller;

import com.cfs.SpringBootP03.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@RestController
public class StudentController {

    @GetMapping("/students")
    public Student getstudent()
    {
        return new Student(101,"Litu",20);
    }
    
    /*@GetMapping("/student/{id}")
    public String getbyid(@PathVariable int id)
    {
        return "Student id is: "+id;
    }*/

    @GetMapping("/product/search")
    public String product(@RequestParam String cat,@RequestParam Double price)
    {
        return "Product is: "+cat+" "+price;
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<String> getStudent(@PathVariable int id)
    {
        if(id <=0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Invalid Student id");
        }

        return ResponseEntity.ok("Student Found");
    }
}
