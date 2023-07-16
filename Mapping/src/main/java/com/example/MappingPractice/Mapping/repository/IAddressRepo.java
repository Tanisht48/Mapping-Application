package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {

}
