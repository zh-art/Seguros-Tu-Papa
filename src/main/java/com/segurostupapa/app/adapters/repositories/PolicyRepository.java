package com.segurostupapa.app.adapters.repositories;

import com.segurostupapa.app.domain.entities.Policy;

import java.util.UUID;

public interface PolicyRepository {
    public void createUserPolicy(UUID id);
    public Policy getUserPolicyByUserId(UUID id);
    public Integer getNextTotalAmountToPay(UUID id);
    public Integer getTotalExpiredInstallments(UUID id);
}
