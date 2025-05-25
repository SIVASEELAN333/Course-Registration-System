package com.example.course.registration.system.service;

import com.example.course.registration.system.model.Course;
import com.example.course.registration.system.model.CourseRegistry;
import com.example.course.registration.system.repository.CourseRegistryRepository;
import com.example.course.registration.system.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CourseService {

    @Autowired
    CourseRepository repo;

    @Autowired
    CourseRegistryRepository registryRepo;

    public List<Course> getAvailableCourse(){
        return repo.findAll();
    }

    public List<CourseRegistry> getEnrolledCourses() {
        return registryRepo.findAll();
    }

    public void enrollCourse(String name, String email, String courseName) {
        CourseRegistry enroll=new CourseRegistry(name,email,courseName);
        registryRepo.save(enroll);
    }
}
