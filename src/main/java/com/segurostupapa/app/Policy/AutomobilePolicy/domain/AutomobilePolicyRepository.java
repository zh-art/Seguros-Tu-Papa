package com.segurostupapa.app.Policy.AutomobilePolicy.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AutomobilePolicyRepository extends JpaRepository<AutomobilePolicy, UUID> {
//    @Query("SELECT a FROM AutomobilePolicy a LEFT JOIN FETCH a.policy WHERE a.id = :id")
//    Optional<AutomobilePolicy> findByIdTest(@Param("id") UUID id);
}
