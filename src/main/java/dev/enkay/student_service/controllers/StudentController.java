package dev.enkay.student_service.controllers;

import dev.enkay.student_service.entities.Student;
import dev.enkay.student_service.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
      this.studentService = studentService;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
      List<Student> studentList = studentService.getAllStudents();
      return new ResponseEntity<>(studentList, HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
      Student createdStudent = studentService.saveStudent(student);
      return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable long studentId) {
      Student student = studentService.getStudentById(studentId);
      return new ResponseEntity<>(student, HttpStatus.OK);
    }

}