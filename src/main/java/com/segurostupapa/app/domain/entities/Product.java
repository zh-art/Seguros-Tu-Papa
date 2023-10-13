package com.segurostupapa.app.domain.entities;

import jakarta.persistence.*;


import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

@Entity
@Table

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)

    private UUID id;

    @Column(unique = true)
    private String name;
    private float price;
    private LocalDate fecha;

    @Transient
    private int antiguedad;

    public Product() {
    }

    public Product(UUID id, String name, float price, LocalDate fecha) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.fecha = fecha;
    }

    public Product(String name, float price, LocalDate fecha) {
        this.name = name;
        this.price = price;
        this.fecha = fecha;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getAntiguedad() {
        return Period.between(this.fecha,LocalDate.now()).getYears();
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
