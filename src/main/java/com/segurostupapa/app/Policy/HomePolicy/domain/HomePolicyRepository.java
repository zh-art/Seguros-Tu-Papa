package com.segurostupapa.app.Policy.HomePolicy.domain;

import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HomePolicyRepository extends JpaRepository<HomePolicy, UUID> {
}
