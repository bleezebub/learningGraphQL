package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="project_citizen")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String secondName;
    private String fatherName;
    private String motherName;
    private String aadharId;
    private String panCard;
    private String licenseNumber;
}
