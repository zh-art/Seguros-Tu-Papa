package com.segurostupapa.app.Policy.HomePolicy.infrastructure;

import com.segurostupapa.app.Policy.HomePolicy.application.FindHomePolicy;
import com.segurostupapa.app.Policy.HomePolicy.domain.HomePolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/home-policies")
public class FindHomePolicyController {
    private final FindHomePolicy findHomePolicy;

    @Autowired
    public FindHomePolicyController(FindHomePolicy findHomePolicy){
        this.findHomePolicy = findHomePolicy;
    }

    @GetMapping(path = "{homePolicyId}")
    public ResponseEntity<Optional<HomePolicy>> run(
            @PathVariable("homePolicyId") UUID homePolicyId
    ) {
        return ResponseEntity.ok(findHomePolicy.run(homePolicyId));
    }
}
