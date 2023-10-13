package com.segurostupapa.app.Policy.HomePolicy.domain;

import com.segurostupapa.app.Policy.domain.Policy;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class HomePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Integer bathrooms;

    private String construction_type;

    private Integer bedrooms;

    private Double property_tax;

    private Double square_meters;

    private String address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "policy_id", referencedColumnName = "id")
    Policy policy;

    @Column(name = "client_id")
    UUID client_id;

    @Column(name = "plan_id")
    UUID plan_id;

    public HomePolicy(Integer bathrooms, String construction_type, Integer bedrooms, Double property_tax, Double square_meters, String address) {
        this.bathrooms = bathrooms;
        this.construction_type = construction_type;
        this.bedrooms = bedrooms;
        this.property_tax = property_tax;
        this.square_meters = square_meters;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }

    public String getConstruction_type() {
        return construction_type;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public Double getProperty_tax() {
        return property_tax;
    }

    public Double getSquare_meters() {
        return square_meters;
    }

    public String getAddress() {
        return address;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public void setConstruction_type(String construction_type) {
        this.construction_type = construction_type;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public void setProperty_tax(Double property_tax) {
        this.property_tax = property_tax;
    }

    public void setSquare_meters(Double square_meters) {
        this.square_meters = square_meters;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
