package com.segurostupapa.app.Policy;

import java.util.UUID;

public interface PolicyRepository {
    public void createUserPolicy(UUID id);
    public PolicyEntiy getUserPolicyByUserId(UUID id);
    public Integer getNextTotalAmountToPay(UUID id);
    public Integer getTotalExpiredInstallments(UUID id);
}
