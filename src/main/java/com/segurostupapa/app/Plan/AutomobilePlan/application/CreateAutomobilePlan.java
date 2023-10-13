package com.segurostupapa.app.Plan.AutomobilePlan.application;

import com.segurostupapa.app.Plan.AutomobilePlan.domain.AutomobilePlan;
import com.segurostupapa.app.Plan.AutomobilePlan.domain.AutomobilePlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateAutomobilePlan {

    private final AutomobilePlanRepository automobilePlanRepository;

    @Autowired
    public CreateAutomobilePlan(AutomobilePlanRepository automobilePlanRepository) {
        this.automobilePlanRepository = automobilePlanRepository;
    }

    public void run (AutomobilePlan automobilePlan) {
        automobilePlanRepository.save(automobilePlan);
    }
}
