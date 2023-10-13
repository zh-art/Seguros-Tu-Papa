package com.segurostupapa.app.domain.entities;

import com.segurostupapa.app.domain.entities.Policy;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class HomePolicy extends Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String license;

    private String model;

    private String numberplate;

    private String vehicle_type;

    private Integer cylinder_capacity;

    private Integer passengers_capacity;

    public HomePolicy(
            UUID id,
            Boolean is_active,
            LocalDate cutoff_date,
            LocalDate payment_due_date
    ) {
        super(id, is_active, cutoff_date, payment_due_date);
    }
}
