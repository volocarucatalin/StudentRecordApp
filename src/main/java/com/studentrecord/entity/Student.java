package com.studentrecord.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_generator")
    @SequenceGenerator(name = "student_generator", sequenceName = "student_seq", allocationSize = 50)
    private int id;

    @Column
    private String studentFirstName;
    @Column
    private String studentLastName;


    @Column
    private String studentId ;

    @Column
    private double studentMathGrade;

    @Column
    private double studentEnglishGrade;

    @Column
    private double studentBiologyGrade;

    @Column
    private double studentScienceGrade;

    @Column
    private double studentComputerScienceGrade;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int ID) {
        this.id = ID;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
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

    public double getStudentMathGrade() {
        return studentMathGrade;
    }

    public void setStudentMathGrade(double studentMathGrade) {
        this.studentMathGrade = studentMathGrade;
    }

    public double getStudentEnglishGrade() {
        return studentEnglishGrade;
    }

    public void setStudentEnglishGrade(double studentEnglishGrade) {
        this.studentEnglishGrade = studentEnglishGrade;
    }

    public double getStudentBiologyGrade() {
        return studentBiologyGrade;
    }

    public void setStudentBiologyGrade(double studentBiologyGrade) {
        this.studentBiologyGrade = studentBiologyGrade;
    }

    public double getStudentScienceGrade() {
        return studentScienceGrade;
    }

    public void setStudentScienceGrade(double studentScienceGrade) {
        this.studentScienceGrade = studentScienceGrade;
    }

    public double getStudentComputerScienceGrade() {
        return studentComputerScienceGrade;
    }

    public void setStudentComputerScienceGrade(double studentComputerScienceGrade) {
        this.studentComputerScienceGrade = studentComputerScienceGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentId=" + studentId +
                ", studentMathGrade=" + studentMathGrade +
                ", studentEnglishGrade=" + studentEnglishGrade +
                ", studentBiologyGrade=" + studentBiologyGrade +
                ", studentScienceGrade=" + studentScienceGrade +
                ", studentComputerScienceGrade=" + studentComputerScienceGrade +
                '}';
    }
}
