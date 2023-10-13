package com.segurostupapa.app.Client.domain;

import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicy;
import com.segurostupapa.app.Policy.HomePolicy.domain.HomePolicy;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table
public class Client {
    @Id
    private UUID id;

    @Column(nullable = true)
    private String identification_card;

    private String name;

    @Column(nullable = true)
    private String city;

    private String email;

    @Column(nullable = true)
    private String cellphone;

    public Client() {}

    public Client(UUID id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    Set<HomePolicy> home_policies = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id", referencedColumnName = "id")
    Set<AutomobilePolicy> automobile_policies = new HashSet<>();

    public String getEmail() {
        return email;
    }

    public UUID getId() {
        return id;
    }
}
