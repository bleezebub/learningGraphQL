package com.example.demo.controller;

import com.example.demo.entity.Citizen;
import com.example.demo.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {
    @Autowired
    private CitizenService citizenService;
    @PostMapping
    public Citizen create(@RequestBody Citizen citizen){
        return citizenService.create(citizen);
    }

    @GetMapping
    public List<Citizen> getAll(){
        return citizenService.getAll();
    }

    @GetMapping("/{citizenId}")
    public Citizen getCitizen(@PathVariable int citizenId){
        return citizenService.get(citizenId);
    }
}
