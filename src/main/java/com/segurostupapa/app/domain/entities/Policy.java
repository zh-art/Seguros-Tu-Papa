package com.segurostupapa.app.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Boolean is_active;

    private LocalDate cutoff_date;

    private LocalDate payment_due_date;

    public Policy(
            UUID id,
            Boolean is_active,
            LocalDate cutoff_date,
            LocalDate payment_due_date
    ) {
        this.id = id;
        this.is_active = is_active;
        this.cutoff_date = cutoff_date;
        this.payment_due_date = payment_due_date;
    }
}
