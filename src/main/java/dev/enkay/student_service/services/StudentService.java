package dev.enkay.student_service.services;

import java.util.List;
import dev.enkay.student_service.entities.Student;


public interface StudentService {

  Student saveStudent(Student student);

  Student getStudentById(long studentId);

  List<Student> getAllStudents();
}
