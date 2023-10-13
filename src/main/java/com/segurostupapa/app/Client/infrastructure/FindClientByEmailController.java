package com.segurostupapa.app.Client.infrastructure;

import com.segurostupapa.app.Client.application.FindClientByEmail;
import com.segurostupapa.app.Client.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/clients/email")
public class FindClientByEmailController {

    private final FindClientByEmail findClientByEmail;

    @Autowired
    public FindClientByEmailController(FindClientByEmail findClientByEmail) { this.findClientByEmail = findClientByEmail; }

    @GetMapping(path = "{email}")
    public ResponseEntity<Optional<Client>> getClientByEmail(@PathVariable("email") String email){
        return ResponseEntity.ok(this.findClientByEmail.run(email));
    }
}
