package com.segurostupapa.app.Policy.HomePolicy.application;

import com.segurostupapa.app.Policy.HomePolicy.domain.HomePolicy;
import com.segurostupapa.app.Policy.HomePolicy.domain.HomePolicyRepository;
import com.segurostupapa.app.Policy.application.CreatePolicy;
import com.segurostupapa.app.Policy.domain.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class CreateHomePolicy {

    private final HomePolicyRepository homePolicyRepository;

    private final CreatePolicy createPolicy;

    @Autowired
    public CreateHomePolicy(
        HomePolicyRepository homePolicyRepository,
                CreatePolicy createPolicy
    ){
        this.homePolicyRepository = homePolicyRepository;
        this.createPolicy = createPolicy;

    }

    public void run(HomePolicy homePolicy){
        UUID policy_id = UUID.randomUUID();

        Policy policy = new Policy(
                policy_id,
                true,
                LocalDate.now(),
                LocalDate.now()
        );

        homePolicy.setPolicy(policy);

        homePolicyRepository.save(homePolicy);
    }

}
