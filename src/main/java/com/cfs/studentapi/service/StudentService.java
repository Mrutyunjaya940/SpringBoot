package com.cfs.studentapi.service;

import com.cfs.studentapi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> studentList=new ArrayList<>();
    public StudentService() {
        studentList.add(new Student(101,"Litu",99));
        studentList.add(new Student(102,"Sangram",98));
        studentList.add(new Student(103,"Chinmaya",104));
    }

    public List<Student> getallStudent()
    {
        return studentList;
    }

    public Student getstudentbyId(int id)
    {
        for(Student student: studentList)
        {
            if(student.getId()==id)
            {
                return student;
            }
        }
        return null;
    }
}
