package com.cfs.studentapi.model;

public class Student {
    private int id;
    private String name;
    private int maek;

    public Student(int id, String name, int maek) {
        this.id = id;
        this.name = name;
        this.maek = maek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaek() {
        return maek;
    }

    public void setMaek(int maek) {
        this.maek = maek;
    }
}
