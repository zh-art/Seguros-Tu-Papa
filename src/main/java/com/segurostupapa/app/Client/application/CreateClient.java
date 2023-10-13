package com.segurostupapa.app.Client.application;

import com.segurostupapa.app.Client.domain.Client;
import com.segurostupapa.app.Client.domain.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CreateClient {

    private final ClientRepository clientRepository;

    @Autowired
    public CreateClient(ClientRepository clientrepository) { this.clientRepository = clientrepository; }

    public void run(Client client) {
        Optional<Client> response = clientRepository.findByEmail(client.getEmail());

        if(response.isEmpty()){
            clientRepository.save(client);
        }
    }
}
