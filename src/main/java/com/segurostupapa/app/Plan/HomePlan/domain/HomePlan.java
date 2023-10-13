package com.segurostupapa.app.Plan.HomePlan.domain;

import com.segurostupapa.app.Policy.HomePolicy.domain.HomePolicy;
import jakarta.persistence.*;
import java.util.Set;
import java.util.HashSet;
import java.util.UUID;

@Entity
@Table
public class HomePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private Double price;

    public HomePlan() {
    }

    public HomePlan(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "plan_id", referencedColumnName = "id")
    Set<HomePolicy> home_policies = new HashSet<>();
}
