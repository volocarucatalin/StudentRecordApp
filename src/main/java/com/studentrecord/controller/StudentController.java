package com.studentrecord.controller;

import com.studentrecord.entity.Student;
import com.studentrecord.request.StudentRequest;
import com.studentrecord.response.StudentResponse;
import com.studentrecord.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

   @Autowired
    public StudentController(StudentService studentService){
       this.studentService = studentService;
   }

   @PostMapping("/add")
    public ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest studentRequest){
       StudentResponse studentResponse = new StudentResponse(studentService.createStudent(studentRequest));
       return new ResponseEntity<>(studentResponse, HttpStatus.CREATED);

   }

   @GetMapping("/all")
    public ResponseEntity<List<Student>>getAllStudents(){
       List<Student> students = new ArrayList<>();
       return new ResponseEntity<>(studentService.getAllStudents(),HttpStatus.OK);
   }

    @GetMapping("/find")
    public ResponseEntity<Student>getStudentById(@PathParam("studentId") Integer studentId){
        if(studentId != null){
            return new ResponseEntity<>(studentService.getStudentById(studentId),HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    @PutMapping("/update")
    public ResponseEntity<Student>updateStudent(@RequestBody Student student){
       if(student != null) {
           return new ResponseEntity<>(studentService.updateStudent(student), HttpStatus.OK);
       }else{
               return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
           }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteStudent(@PathVariable(value="id") Integer studentId){
       if(studentId != null){
           studentService.deleteStudent(studentId);
           return new ResponseEntity<>(HttpStatus.OK);
       }else{
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }

    }
}
