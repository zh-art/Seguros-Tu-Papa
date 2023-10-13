package com.segurostupapa.app.Client.infrastructure;

import com.segurostupapa.app.Client.application.FindClient;
import com.segurostupapa.app.Client.domain.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api/v1/clients/id")
public class FindClientController {

    private final FindClient findClient;

    @Autowired
    public FindClientController(FindClient findClient) { this.findClient = findClient; }

    @GetMapping(path = "{clientId}")
    public ResponseEntity<Optional<Client>> getClientById(@PathVariable("clientId") UUID id){
        return ResponseEntity.ok(this.findClient.run(id));
    }
}
