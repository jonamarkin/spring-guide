package com.ato.demo.controller;

import com.ato.demo.dto.CourseDto;
import com.ato.demo.model.ApiResponse;
import com.ato.demo.model.Course;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

  @RequestMapping("/course")
  public ResponseEntity<ApiResponse<Course>> getCourse() {
    Course course = new Course("Java", 2, 4.5, "Ranga");
    ApiResponse<Course> response = new ApiResponse<>(course, "200", "success");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
