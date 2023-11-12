package com.segurostupapa.app.Auth.application;

import com.segurostupapa.app.Client.application.CreateClient;
import com.segurostupapa.app.Client.application.FindClient;
import com.segurostupapa.app.Client.application.FindClientByEmail;
import com.segurostupapa.app.Client.domain.Client;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.http.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    private final CreateClient createClient;
    private final FindClientByEmail findClientByEmail;

    @Autowired
    public CustomAuthenticationSuccessHandler(
            CreateClient createClient,
            FindClientByEmail findClientByEmail
    ) {
        this.createClient = createClient;
        this.findClientByEmail = findClientByEmail;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        OAuth2AuthenticationToken authenticationToken = (OAuth2AuthenticationToken) authentication;
        Map<String, Object> userDetails = authenticationToken.getPrincipal().getAttributes();

        String clientEmail = (String) userDetails.get("email");

        Optional<Client> clientFound = findClientByEmail.run(clientEmail);

        if (clientFound.isEmpty()) {
            UUID clientUUID = UUID.randomUUID();

            Client client = new Client(
                    clientUUID,
                    (String) userDetails.get("name"),
                    (String) userDetails.get("email")
            );

            createClient.run(client);

            // Redirect to the default URL after successful authentication
            response.sendRedirect("/api/v1/clients/id/" + clientUUID);

            return;
        }

        // Redirect to the default URL after successful authentication
        response.sendRedirect("/api/v1/clients/email/" + clientEmail);
    }
}
