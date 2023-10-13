package com.segurostupapa.app.domain.entities;

import com.segurostupapa.app.domain.entities.Policy;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table
public class AutomobilePolicy extends Policy {
    private Integer bathrooms;

    private String construction_type;

    private Integer bedrooms;

    private Float property_tax;

    private Float square_meters;

    private String address;

    public AutomobilePolicy(
            UUID id,
            Boolean is_active,
            LocalDate cutoff_date,
            LocalDate payment_due_date
    ) {
        super(id, is_active, cutoff_date, payment_due_date);
    }
}
