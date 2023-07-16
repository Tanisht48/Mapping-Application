package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,String> {

}
