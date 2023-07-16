package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop,String>{

}
