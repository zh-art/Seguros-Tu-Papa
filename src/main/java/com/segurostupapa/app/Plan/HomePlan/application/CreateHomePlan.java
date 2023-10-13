package com.segurostupapa.app.Plan.HomePlan.application;

import com.segurostupapa.app.Plan.HomePlan.domain.HomePlan;
import com.segurostupapa.app.Plan.HomePlan.domain.HomePlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateHomePlan {

    private final HomePlanRepository homePlanRepository;

    @Autowired
    public CreateHomePlan(HomePlanRepository homePlanRepository) {
        this.homePlanRepository = homePlanRepository;
    }

    public void run (HomePlan homePlan) { homePlanRepository.save(homePlan);}
}
