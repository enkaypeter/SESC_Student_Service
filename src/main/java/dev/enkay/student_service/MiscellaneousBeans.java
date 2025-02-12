package dev.enkay.student_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import dev.enkay.student_service.model.Course;
import dev.enkay.student_service.model.ICourse;

import org.springframework.context.annotation.Bean;

@Configuration
public class MiscellaneousBeans {

  @Bean
  CommandLineRunner initDatabase(ICourse courseRepository) {
    return args -> {
      Course myCourse = new Course();
      myCourse.setTitle("SESC");
      myCourse.setDescription("Software Engineering for Service Computing");
      myCourse.setFee(10.00);
      courseRepository.save(myCourse);
    };
  }
}
