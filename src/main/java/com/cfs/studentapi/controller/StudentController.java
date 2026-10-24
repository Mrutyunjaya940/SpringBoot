package com.cfs.studentapi.controller;


import com.cfs.studentapi.model.Student;
import com.cfs.studentapi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService)
    {
        this.studentService=studentService;
    }

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudent()
    {
        return studentService.getallStudent();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentbyId(@PathVariable int id)
    {
        Student student=studentService.getstudentbyId(id);
        if(student==null)
        {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Student Not Found");
        }
        return ResponseEntity.ok(student);
    }
}
