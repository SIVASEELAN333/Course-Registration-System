package com.example.course.registration.system.repository;

import com.example.course.registration.system.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepository extends JpaRepository<CourseRegistry, Integer> {
}
