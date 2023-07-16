package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Laptop;
import com.example.MappingPractice.Mapping.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private ILaptopRepo laptopRepository;

    public List<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    public Laptop getLaptopById(String id) {
        return laptopRepository.findById(id).orElse(null);
    }

    public Laptop createLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    public Laptop updateLaptop(String id, Laptop updatedLaptop) {
        Laptop existingLaptop = laptopRepository.findById(id).orElse(null);
        if (existingLaptop != null) {
            existingLaptop.setLaptopName(updatedLaptop.getLaptopName());
            existingLaptop.setLaptopBrand(updatedLaptop.getLaptopBrand());

            return laptopRepository.save(existingLaptop);
        }
        return null;
    }

    public void deleteLaptop(String id) {
        laptopRepository.deleteById(id);
    }
}

