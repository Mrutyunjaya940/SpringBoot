package com.example.CRUD_SPRINGBOOT.service;


import com.example.CRUD_SPRINGBOOT.entity.Student;
import com.example.CRUD_SPRINGBOOT.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {


    private StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;


    }

    public Student createStudent(Student studentReq) {


        System.out.println("Inside studentservice");
        Student studentResp = studentRepository.save(studentReq);
        return studentResp;

    }

    public Student getStudent(Long id) {
        Optional<Student> studentResp = studentRepository.findById(id);

        if (studentResp.isPresent()) {
            return studentResp.get();
        }
        return null;
    }

    public List<Student> getAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        return studentList;

    }

    public Student updateStudent(Long id, Student studentReq) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isEmpty()) {

            return null;


        }

        Student studentToSave = existingStudent.get();
        studentToSave.setName(studentReq.getName());
        studentToSave.setRollNo(studentReq.getRollNo());
        studentToSave.setSubject(studentReq.getSubject());
        studentToSave.setEmail(studentReq.getEmail());
        studentToSave.setAge(studentReq.getAge());


        return studentRepository.save(studentToSave);
    }

    public Boolean deleteStudent(Long id) {
        Boolean isStudent = studentRepository.existsById(id);
        if (!isStudent) return false;
        studentRepository.deleteById(id);
        return true;

    }
}