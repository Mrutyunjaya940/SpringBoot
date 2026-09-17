package com.emp.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   public static void main(String[] args) {
       ApplicationContext ac=new ClassPathXmlApplicationContext("file.xml");
        Student s1=(Student)ac.getBean("s1");

        System.out.println(s1);
    }
}