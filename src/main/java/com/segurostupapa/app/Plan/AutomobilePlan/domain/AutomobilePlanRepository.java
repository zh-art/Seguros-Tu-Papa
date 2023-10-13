package com.segurostupapa.app.Plan.AutomobilePlan.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutomobilePlanRepository extends JpaRepository<AutomobilePlan, UUID> {
}
