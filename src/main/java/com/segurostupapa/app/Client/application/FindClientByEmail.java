package com.segurostupapa.app.Client.application;

import com.segurostupapa.app.Client.domain.Client;
import com.segurostupapa.app.Client.domain.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FindClientByEmail {

    private final ClientRepository clientRepository;

    @Autowired
    public FindClientByEmail(ClientRepository clientRepository) { this.clientRepository = clientRepository; }

    public Optional<Client> run(String email) {
        return clientRepository.findByEmail(email);
    }
}
