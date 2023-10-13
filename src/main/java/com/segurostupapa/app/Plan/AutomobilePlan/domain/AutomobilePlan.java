package com.segurostupapa.app.Plan.AutomobilePlan.domain;

import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicy;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table
public class AutomobilePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private Double price;

    public AutomobilePlan() {}

    public AutomobilePlan(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "plan_id", referencedColumnName = "id")
    Set<AutomobilePolicy> automobile_policies = new HashSet<>();
}
