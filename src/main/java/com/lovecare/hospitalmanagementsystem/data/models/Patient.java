package com.lovecare.hospitalmanagementsystem.data.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private User user;

    @OneToOne
    private MedicalRecord medicalRecord;
}
