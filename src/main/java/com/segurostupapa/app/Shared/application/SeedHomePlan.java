package com.segurostupapa.app.Shared.application;

import com.segurostupapa.app.Plan.HomePlan.application.CreateHomePlan;
import com.segurostupapa.app.Plan.HomePlan.domain.HomePlan;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeedHomePlan {
    private final CreateHomePlan createHomePlan;

    @Autowired
    public SeedHomePlan(CreateHomePlan createHomePlan){
        this.createHomePlan = createHomePlan;
    }

    @PostConstruct
    public void run() {
        HomePlan bronze = new HomePlan("Bronze Plan", 99.99);
        HomePlan silver = new HomePlan("Silver Plan", 119.99);
        HomePlan gold = new HomePlan("Gold Plan", 149.99);
        HomePlan platinum = new HomePlan("Platinum Plan", 199.99);

        createHomePlan.run(bronze);
        createHomePlan.run(silver);
        createHomePlan.run(gold);
        createHomePlan.run(platinum);
    }
}
