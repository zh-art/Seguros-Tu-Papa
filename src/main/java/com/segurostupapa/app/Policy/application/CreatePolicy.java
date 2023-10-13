package com.segurostupapa.app.Policy.application;

import com.segurostupapa.app.Policy.domain.Policy;
import com.segurostupapa.app.Policy.domain.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePolicy {

    private final PolicyRepository policyRepository;

    @Autowired
    public CreatePolicy(PolicyRepository policyRepository) { this.policyRepository = policyRepository; }

    public void run (Policy policy) {
        policyRepository.save(policy);
    }
}
