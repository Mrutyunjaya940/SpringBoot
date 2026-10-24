package com.cfs.SpringBootP03.dto;

public class StudentReqest {

        private int id;
        private String name;
        private int mark;

    public StudentReqest() {
    }

    public StudentReqest(int id, String name, int mark) {
            this.id = id;
            this.name = name;
            this.mark = mark;
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

        public int getMark() {
            return mark;
        }

        public void setMark(int mark) {
            this.mark = mark;
        }
    }
