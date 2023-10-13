package com.segurostupapa.app.Shared.application;

import com.segurostupapa.app.Plan.AutomobilePlan.application.CreateAutomobilePlan;
import com.segurostupapa.app.Plan.AutomobilePlan.domain.AutomobilePlan;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeedAutomobilePlan {
    private final CreateAutomobilePlan createAutomobilePlan;

    @Autowired
    public SeedAutomobilePlan(CreateAutomobilePlan createAutomobilePlan) {
        this.createAutomobilePlan = createAutomobilePlan;
    }

    @PostConstruct
    public void run () {
        AutomobilePlan bronze = new AutomobilePlan("Bronze Plan", 100.99);
        AutomobilePlan silver = new AutomobilePlan("Silver Plan", 120.99);
        AutomobilePlan gold = new AutomobilePlan("Gold Plan", 140.99);
        AutomobilePlan platinum = new AutomobilePlan("Platinum Plan", 199.99);

        createAutomobilePlan.run(bronze);
        createAutomobilePlan.run(silver);
        createAutomobilePlan.run(gold);
        createAutomobilePlan.run(platinum);
    }
}
