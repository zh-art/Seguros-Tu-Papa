package com.segurostupapa.app.Plan.HomePlan.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HomePlanRepository extends JpaRepository<HomePlan, UUID> {
}
