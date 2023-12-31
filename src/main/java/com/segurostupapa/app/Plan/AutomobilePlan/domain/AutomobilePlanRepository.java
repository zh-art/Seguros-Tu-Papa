package com.segurostupapa.app.Plan.AutomobilePlan.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AutomobilePlanRepository extends JpaRepository<AutomobilePlan, UUID> {
}
