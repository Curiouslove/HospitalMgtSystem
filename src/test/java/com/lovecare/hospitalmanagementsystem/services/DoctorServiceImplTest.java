package com.lovecare.hospitalmanagementsystem.services;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoctorServiceImplTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void doctorCanDiagnosePatient() {
        Diagnose diagnose = new Diagnose();
        System.out.println(diagnose.getId());
        diagnose.setType("Malaria and Typhoid");

    }

    @Test
    void prescribeTest() {
    }
}