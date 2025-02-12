package dev.enkay.student_service.services;
import dev.enkay.student_service.entities.Student;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

  List<Student> students = new ArrayList<Student>();

  @Override
  public Student saveStudent(Student student) {
    students.add(student);
    return student;
  }

  @Override
  public Student getStudentById(long studentId) {
    return students.stream().filter(student -> student.getStudentId().equals(studentId)).findFirst().get();
  }

  public List<Student> getAllStudents() {
    return students;
  }
}