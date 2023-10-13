package com.segurostupapa.app.Policy.AutomobilePolicy.application;

import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicy;
import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicyRepository;
import com.segurostupapa.app.Policy.application.CreatePolicy;
import com.segurostupapa.app.Policy.domain.Policy;
import com.segurostupapa.app.Product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Service
public class CreateAutomobilePolicy {

    private final AutomobilePolicyRepository automobilePolicyRepository;
    private final CreatePolicy createPolicy;

    @Autowired
    public CreateAutomobilePolicy(
            AutomobilePolicyRepository automobilePolicyRepository,
            CreatePolicy createPolicy
    ){
        this.automobilePolicyRepository = automobilePolicyRepository;
        this.createPolicy = createPolicy;
    }

    public void run(AutomobilePolicy automobilePolicy) {
        UUID policy_id = UUID.randomUUID();

        Policy policy = new Policy(
                policy_id,
                true,
                LocalDate.now(),
                LocalDate.now()
        );

        automobilePolicy.setPolicy(policy);

        automobilePolicyRepository.save(automobilePolicy);
    }
}
