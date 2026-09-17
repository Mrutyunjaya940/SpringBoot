package com.example.CRUD_SPRINGBOOT.controller;


import com.example.CRUD_SPRINGBOOT.entity.Student;
import com.example.CRUD_SPRINGBOOT.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

private StudentService studentService;

public StudentController(StudentService studentService){

    this.studentService=studentService;
}


@PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student)
    {
        System.out.println("Inside student controller");
        Student createdStudent=studentService.createStudent(student);
        System.out.println("exit student controller");

        return ResponseEntity.status
                (HttpStatus.CREATED).
                body(createdStudent);
    }


    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Long id)
    {
        Student studentResp=studentService.getStudent(id);

        if (studentResp==null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResp);
    }


    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent()
    {



        List<Student> studentList=studentService.getAllStudent();
        if (studentList.isEmpty())
        {

            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentList);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentReq)

    {


        Student studentRsp=studentService.updateStudent(id,studentReq);
        if(studentRsp==null)
        {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(studentRsp);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id)
        {
    Boolean isDeleted=studentService.deleteStudent(id);
    if(!isDeleted)
        {
        return ResponseEntity.notFound().build();
        }

    return ResponseEntity.ok("Deleted");
        }



}
