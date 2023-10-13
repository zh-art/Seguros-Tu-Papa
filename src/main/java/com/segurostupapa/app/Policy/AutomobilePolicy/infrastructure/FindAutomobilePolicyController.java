package com.segurostupapa.app.Policy.AutomobilePolicy.infrastructure;

import com.segurostupapa.app.Policy.AutomobilePolicy.application.FindAutomobilePolicy;
import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/automobile-policies")
public class FindAutomobilePolicyController {

    private final FindAutomobilePolicy findAutomobilePolicy;

    @Autowired
    public FindAutomobilePolicyController(FindAutomobilePolicy findAutomobilePolicy) {
        this.findAutomobilePolicy = findAutomobilePolicy;
    }

    @GetMapping(path = "{automobilePolicyId}")
    public ResponseEntity<Optional<AutomobilePolicy>> run(
            @PathVariable("automobilePolicyId") UUID automobilePolicyId
    ) {
        return ResponseEntity.ok(findAutomobilePolicy.run(automobilePolicyId));
    }
}
