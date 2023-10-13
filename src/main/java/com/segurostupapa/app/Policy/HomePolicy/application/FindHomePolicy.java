package com.segurostupapa.app.Policy.HomePolicy.application;

import com.segurostupapa.app.Policy.HomePolicy.domain.HomePolicy;
import com.segurostupapa.app.Policy.HomePolicy.domain.HomePolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FindHomePolicy {

    private final HomePolicyRepository homePolicyRepository;

    @Autowired
    public FindHomePolicy(
            HomePolicyRepository homePolicyRepository
    ){
        this.homePolicyRepository = homePolicyRepository;
    }

    public Optional<HomePolicy> run(UUID id) {
        return homePolicyRepository.findById(id);
    }
}
