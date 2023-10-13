package com.segurostupapa.app.Policy.AutomobilePolicy.application;

import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicy;
import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FindAutomobilePolicy {

    private final AutomobilePolicyRepository automobilePolicyRepository;

    @Autowired
    public FindAutomobilePolicy(
            AutomobilePolicyRepository automobilePolicyRepository
    ){
        this.automobilePolicyRepository = automobilePolicyRepository;
    }

    public Optional<AutomobilePolicy> run(UUID id) {
        return automobilePolicyRepository.findById(id);
    }
}
