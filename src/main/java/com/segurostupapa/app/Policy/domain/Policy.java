package com.segurostupapa.app.Policy.domain;

import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicy;
import com.segurostupapa.app.Policy.HomePolicy.domain.HomePolicy;
import jakarta.persistence.*;
import net.minidev.json.annotate.JsonIgnore;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class Policy {
    @Id
    private UUID id;

    private Boolean is_active;

    private LocalDate cutoff_date;

    private LocalDate payment_due_date;

    public Policy() {}

    public Policy(UUID id, Boolean is_active, LocalDate cutoff_date, LocalDate payment_due_date) {
        this.id = id;
        this.is_active = is_active;
        this.cutoff_date = cutoff_date;
        this.payment_due_date = payment_due_date;
    }

    @JsonIgnore
    @OneToOne(mappedBy = "policy")
    AutomobilePolicy automobile_policy;

    @JsonIgnore
    @OneToOne(mappedBy = "policy")
    HomePolicy home_policy;
}
