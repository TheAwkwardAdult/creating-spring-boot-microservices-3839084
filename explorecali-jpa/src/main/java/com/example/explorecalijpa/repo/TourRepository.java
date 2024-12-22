package com.example.explorecalijpa.repo;

import com.example.explorecalijpa.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TourRepository extends JpaRepository<Tour, Integer> {
}