package com.segurostupapa.app.Policy.AutomobilePolicy.infrastructure;

import com.segurostupapa.app.Policy.AutomobilePolicy.application.CreateAutomobilePolicy;
import com.segurostupapa.app.Policy.AutomobilePolicy.domain.AutomobilePolicy;
import com.segurostupapa.app.Shared.domain.CustomHttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/api/v1/automobile-policies")
public class CreateAutomobilePolicyController {

    private final CreateAutomobilePolicy createAutomobilePolicy;

    @Autowired
    public CreateAutomobilePolicyController(CreateAutomobilePolicy createAutomobilePolicy){
        this.createAutomobilePolicy = createAutomobilePolicy;
    }

    @PostMapping
    public ResponseEntity<HashMap<String, Object>> run(@RequestBody AutomobilePolicy automobilePolicy) {
        createAutomobilePolicy.run(automobilePolicy);

        CustomHttpResponse response = new CustomHttpResponse(
                201,
                "Automobile Policy was Created"
        );

        return ResponseEntity.ok(response.getResponseObject());
    }
}
