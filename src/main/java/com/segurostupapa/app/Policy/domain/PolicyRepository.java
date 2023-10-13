package com.segurostupapa.app.Policy.domain;

import com.segurostupapa.app.Policy.domain.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PolicyRepository extends JpaRepository<Policy, UUID> {
//    public void createUserPolicy(UUID id);
//    public Policy getUserPolicyByUserId(UUID id);
//    public Integer getNextTotalAmountToPay(UUID id);
//    public Integer getTotalExpiredInstallments(UUID id);
}
