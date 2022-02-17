package com.studentrecord.service;

import com.studentrecord.entity.Student;
import com.studentrecord.repository.StudentRepository;
import com.studentrecord.request.StudentRequest;
import com.studentrecord.util.RandomId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {
    private StudentRepository studentRepository;



    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public int  createStudent(StudentRequest studentRequest) {
        List<Student> students = studentRepository.findAll();

        Student student = new Student();
        student.setStudentFirstName(studentRequest.getStudentFirstName());
        student.setStudentLastName(studentRequest.getStudentLastName());
        Character ch = student.getStudentFirstName().toCharArray()[0];
        Character ch1 = student.getStudentLastName().toCharArray()[0];
        StringBuilder id  = new StringBuilder();
        id .append(ch);
        id .append(ch1);
        id .append(RandomId.randomId());
        student.setStudentId(String.valueOf(id));
        return studentRepository.save(student).getId();
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        students.addAll(studentRepository.findAll());

        return students;
    }

    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentById(int id) {
        Student student = studentRepository.getById(id);
        return student;
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(int id){
        studentRepository.deleteById(id);

    }
}
