package com.emp.demo;

public class Student {
    String name;
    String address;
//    public Student(String name, String address)
//    {
//        this.name=name;
//        this.address=address;
//    }
    public void setname(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
