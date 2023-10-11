package com.segurostupapa.app.Client;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String identification_card;

    private String name;

    private String last_name;

    private String city;

    private String email;

    private String cellphone;
}
