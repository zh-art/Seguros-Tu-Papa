package com.segurostupapa.app.Client.application;

import com.segurostupapa.app.Client.domain.Client;
import com.segurostupapa.app.Client.domain.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FindClient {

    private final ClientRepository clientRepository;

    public FindClient(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Optional<Client> run(UUID id) {
        return clientRepository.findById(id);
    }
}
