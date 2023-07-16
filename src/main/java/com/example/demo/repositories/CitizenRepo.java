package com.example.demo.repositories;

import com.example.demo.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepo extends JpaRepository<Citizen, Integer> {
}
