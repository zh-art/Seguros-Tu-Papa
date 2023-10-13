package com.segurostupapa.app.Policy.HomePolicy.infrastructure;


import com.segurostupapa.app.Policy.HomePolicy.application.CreateHomePolicy;
import com.segurostupapa.app.Policy.HomePolicy.domain.HomePolicy;
import com.segurostupapa.app.Shared.domain.CustomHttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(path = "/api/v1/home-policies")
public class CreateHomePolicyController {
    private final CreateHomePolicy createHomePolicy;

    @Autowired
    public CreateHomePolicyController(CreateHomePolicy createHomePolicy){
        this.createHomePolicy = createHomePolicy;
    }

    @PostMapping
    public ResponseEntity<HashMap<String, Object>> run(@RequestBody HomePolicy homePolicy) {
        createHomePolicy.run(homePolicy);

        CustomHttpResponse response = new CustomHttpResponse(
                201,
                "Home Policy was created"
        );

        return ResponseEntity.ok(response.getResponseObject());
    }

}
