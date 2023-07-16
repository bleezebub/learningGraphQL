package com.example.demo.controller;

import com.example.demo.controller.model.CitizenInput;
import com.example.demo.entity.Citizen;
import com.example.demo.service.CitizenService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@Log4j2
public class CitizenControllerGraphQL {
    @Autowired
    private CitizenService citizenService;

    @MutationMapping("createCitizen")
    public Citizen create(@Argument(name = "citizen") CitizenInput c) {
        log.info(c);
        Citizen citizen1 = new Citizen();
        citizen1.setAadharId(c.getAadharId());
        citizen1.setFirstName(c.getFirstName());
        citizen1.setFatherName(c.getFatherName());
        citizen1.setMotherName(c.getMotherName());
        citizen1.setLicenseNumber(c.getLicenseNumber());
        citizen1.setPanCard(c.getPanCard());
        citizen1.setSecondName(c.getSecondName());
        return citizenService.create(citizen1);
    }

    @QueryMapping("allCitizens")
    public List<Citizen> getAll() {
        return citizenService.getAll();
    }

    @QueryMapping("getCitizen")

    public Citizen getCitizen(@Argument int citizenId) {
        return citizenService.get(citizenId);
    }
}
