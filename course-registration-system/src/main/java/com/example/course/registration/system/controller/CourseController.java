package com.example.course.registration.system.controller;

import com.example.course.registration.system.model.Course;
import com.example.course.registration.system.model.CourseRegistry;
import com.example.course.registration.system.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.origin.Origin;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class CourseController {
    @Autowired
    CourseService service;

    @GetMapping("/courses")
    public List<Course> getAvailableCourse(){
        return service.getAvailableCourse();
    }

    @GetMapping("/courses/enrolled")
    public List<CourseRegistry> getEnrolledCourses(){
        return service.getEnrolledCourses();
    }

    @PostMapping("/courses/register")
    public String enrollCourse(@RequestParam("name") String name,
                               @RequestParam("email") String email,
                               @RequestParam("courseName") String courseName){
        service.enrollCourse(name,email,courseName);
        return "Congratulations! "+name+" enrollment successful for "+courseName;
    }
}
