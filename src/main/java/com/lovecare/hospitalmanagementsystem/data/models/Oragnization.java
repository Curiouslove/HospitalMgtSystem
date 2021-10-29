package com.lovecare.hospitalmanagementsystem.data.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Oragnization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String industry;

    @OneToOne
    private User user;
}
