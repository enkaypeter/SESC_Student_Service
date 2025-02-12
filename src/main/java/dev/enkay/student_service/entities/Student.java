package dev.enkay.student_service.entities;

import lombok.Data;


@Data
public class Student  {
    private Long studentId;
    private String firstName;
    private String lastName;
    private String email;
    private String qualification;
    private String university;
}