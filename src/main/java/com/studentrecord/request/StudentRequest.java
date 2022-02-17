package com.studentrecord.request;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import java.io.Serializable;

@ManagedBean
public class StudentRequest implements Serializable {

    private String studentFirstName;
    private String studentLastName;

    public StudentRequest() {
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }
}
