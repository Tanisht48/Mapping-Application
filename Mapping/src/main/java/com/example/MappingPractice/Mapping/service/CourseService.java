package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Course;
import com.example.MappingPractice.Mapping.model.Student;
import com.example.MappingPractice.Mapping.model.dto.Apply;
import com.example.MappingPractice.Mapping.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private ICourseRepo courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public String addCourses(List<Course> courseList) {
         courseRepository.saveAll(courseList);
         return "Courses added";
    }

    public Course updateCourse(String id, Course updatedCourse) {
        Course existingCourse = courseRepository.findById(id).orElse(null);
        if (existingCourse != null) {
            existingCourse.setCourseTitle(updatedCourse.getCourseTitle());
            existingCourse.setCourseDescription(updatedCourse.getCourseDescription());

            return courseRepository.save(existingCourse);
        }
        return null;
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }


    public String addAStudent(Course course , Student student) {
        List<Student>studentList = new ArrayList<>();
        studentList.add(student);

        course.setStudentList(studentList);
        courseRepository.save(course);
        return "Welcome "+student.getStudentName()+" to "+course.getCourseTitle();

    }
}

