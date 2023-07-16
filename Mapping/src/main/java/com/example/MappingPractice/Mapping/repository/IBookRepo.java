package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepo extends JpaRepository<Book,String> {
}
