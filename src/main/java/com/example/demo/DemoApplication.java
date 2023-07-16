package com.example.demo;

import com.example.demo.entity.Citizen;
import com.example.demo.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Autowired
	private CitizenService citizenService;
	@Override
	public void run(String... args) throws Exception {
		Citizen citizen = new Citizen();
		citizen.setAadharId("123a");
		citizen.setFirstName("Rishabh");
		citizen.setFatherName("Kamal");
		citizen.setMotherName("Meenu");
		citizen.setLicenseNumber("avc");
		citizen.setPanCard("bas1");
		citizen.setSecondName("temp");


		Citizen citizen2 = new Citizen();
		citizen2.setAadharId("12a3sagda");
		citizen2.setFirstName("Risahabh");
		citizen2.setFatherName("Kamsafdsal");
		citizen2.setMotherName("Meenusagd");
		citizen2.setLicenseNumber("avasgdc");
		citizen2.setPanCard("bas1asgdf");
		citizen2.setSecondName("temasfgdfhp");


		citizenService.create(citizen);
		citizenService.create(citizen2);

	}
}
