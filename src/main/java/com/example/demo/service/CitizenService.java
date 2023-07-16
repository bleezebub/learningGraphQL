package com.example.demo.service;

import com.example.demo.entity.Citizen;

import java.util.List;

public interface CitizenService {
    Citizen create(Citizen citizen);


    List<Citizen> getAll();

    Citizen get(int citizenId);

}
