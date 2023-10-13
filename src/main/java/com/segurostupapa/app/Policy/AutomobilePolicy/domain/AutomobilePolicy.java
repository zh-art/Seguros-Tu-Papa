package com.segurostupapa.app.Policy.AutomobilePolicy.domain;

import com.segurostupapa.app.Policy.domain.Policy;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table
public class AutomobilePolicy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String license;

    private String model;

    private String numberplate;

    private String vehicle_type;

    private Integer cylinder_capacity;

    private Integer passengers_capacity;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "policy_id", referencedColumnName = "id")
    Policy policy;

    @Column(name = "client_id")
    UUID client_id;

    @Column(name = "plan_id")
    UUID plan_id;


    public AutomobilePolicy() {
    }

    public AutomobilePolicy(String license, String model, String numberplate, String vehicle_type, Integer cylinder_capacity, Integer passengers_capacity) {
        this.license = license;
        this.model = model;
        this.numberplate = numberplate;
        this.vehicle_type = vehicle_type;
        this.cylinder_capacity = cylinder_capacity;
        this.passengers_capacity = passengers_capacity;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumberplate(String numberplate) {
        this.numberplate = numberplate;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public void setCylinder_capacity(Integer cylinder_capacity) {
        this.cylinder_capacity = cylinder_capacity;
    }

    public void setPassengers_capacity(Integer passengers_capacity) {
        this.passengers_capacity = passengers_capacity;
    }

    public UUID getId() {
        return id;
    }

    public String getLicense() {
        return license;
    }

    public String getModel() {
        return model;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public Integer getCylinder_capacity() {
        return cylinder_capacity;
    }

    public Integer getPassengers_capacity() {
        return passengers_capacity;
    }

    public void setClient_id(UUID client_id) {
        this.client_id = client_id;
    }

    public void setPlan_id(UUID plan_id) {
        this.plan_id = plan_id;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public Policy getPolicy() {
        return policy;
    }
}
