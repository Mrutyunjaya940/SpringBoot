package com.example.CRUD_SPRINGBOOT.repository;


import com.example.CRUD_SPRINGBOOT.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {












}
