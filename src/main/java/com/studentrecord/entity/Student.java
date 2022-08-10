package com.studentrecord.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name ="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_generator")
    @SequenceGenerator(name = "student_generator", sequenceName = "student_seq", allocationSize = 50)
    private Integer id;

    @Column
    private String studentFirstName;

    @Column
    private String studentLastName;

    @Column
    private String studentUniqueCode;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setStudentUniqueCode(String studentId) {
        this.studentUniqueCode = studentId;
    }

    public String getStudentUniqueCode() {
        return studentUniqueCode;
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
                ", studentId=" + studentUniqueCode +
                ", studentMathGrade=" + studentMathGrade +
                ", studentEnglishGrade=" + studentEnglishGrade +
                ", studentBiologyGrade=" + studentBiologyGrade +
                ", studentScienceGrade=" + studentScienceGrade +
                ", studentComputerScienceGrade=" + studentComputerScienceGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Double.compare(student.getStudentMathGrade(), getStudentMathGrade()) == 0 && Double.compare(student.getStudentEnglishGrade(), getStudentEnglishGrade()) == 0 && Double.compare(student.getStudentBiologyGrade(), getStudentBiologyGrade()) == 0 && Double.compare(student.getStudentScienceGrade(), getStudentScienceGrade()) == 0 && Double.compare(student.getStudentComputerScienceGrade(), getStudentComputerScienceGrade()) == 0 && Objects.equals(getId(), student.getId()) && Objects.equals(getStudentFirstName(), student.getStudentFirstName()) && Objects.equals(getStudentLastName(), student.getStudentLastName()) && Objects.equals(getStudentUniqueCode(), student.getStudentUniqueCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getStudentFirstName(), getStudentLastName(), getStudentUniqueCode(), getStudentMathGrade(), getStudentEnglishGrade(), getStudentBiologyGrade(), getStudentScienceGrade(), getStudentComputerScienceGrade());
    }
}
