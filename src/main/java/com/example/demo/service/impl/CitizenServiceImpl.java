package com.example.demo.service.impl;

import com.example.demo.entity.Citizen;
import com.example.demo.repositories.CitizenRepo;
import com.example.demo.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenServiceImpl implements CitizenService {
    private CitizenRepo citizenRepo;

    @Autowired
    public CitizenServiceImpl(CitizenRepo citizenRepo) {
        this.citizenRepo = citizenRepo;
    }

    @Override
    public Citizen create(Citizen citizen) {
        return this.citizenRepo.save(citizen);
    }


    @Override
    public List<Citizen> getAll() {
        return this.citizenRepo.findAll();
    }

    @Override
    public Citizen get(int citizenId) {
        return this.citizenRepo.findById(citizenId).orElseThrow(() -> new RuntimeException("Citizen doesn't exist"));
    }
}
