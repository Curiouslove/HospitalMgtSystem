package com.lovecare.hospitalmanagementsystem.data.models;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class Doctor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToOne
    private User user;

    private String specialization;

    @Enumerated(EnumType.STRING)
    private TreatmentFacility facility;

    private String facilityName;

    private String facilityAddress;

    @OneToOne
    private MedicalRecord medicalRecord;
}
