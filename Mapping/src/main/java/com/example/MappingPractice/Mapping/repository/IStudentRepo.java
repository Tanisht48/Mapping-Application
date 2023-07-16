package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,String> {

}
