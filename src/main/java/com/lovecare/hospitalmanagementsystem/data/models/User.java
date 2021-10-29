package com.lovecare.hospitalmanagementsystem.data.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String phoneNumber;

    private String Address;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING)
    private UserType userType;
}
