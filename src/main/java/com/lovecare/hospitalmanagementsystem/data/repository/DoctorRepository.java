package com.lovecare.hospitalmanagementsystem.data.repository;

import com.lovecare.hospitalmanagementsystem.data.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {


}
