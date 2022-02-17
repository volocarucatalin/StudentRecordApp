package com.studentrecord.response;

import java.io.Serializable;

public class StudentResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private String studentId;
    private int id;

    public StudentResponse( int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
