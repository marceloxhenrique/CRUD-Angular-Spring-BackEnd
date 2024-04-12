package com.courses.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.courses.crudspring.model.Course;

@Repository                                           //Entity, Primary key
public interface CourseRepository extends JpaRepository<Course, Long>{
  
}
