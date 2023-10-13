package com.segurostupapa.app.adapters.controllers;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @GetMapping("/hello")
    String sayHello(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Hello, %s!", jwt.getSubject());
    }

    @GetMapping("/profile")
    @PreAuthorize("hasAuthority('SCOPE_profile')")
    ResponseEntity<String> userDetails(OAuth2AuthenticationToken authentication) throws UnirestException {
        HttpResponse<String> response = Unirest.post("https://segurostupapa.us.auth0.com/oauth/token")
                .header("content-type", "application/x-www-form-urlencoded")
                .body("grant_type=client_credentials&client_id=nxLbMfydKo96sw6cmIbBn3IWMnouQQ7W&client_secret=NJtZEWg6hOGTN7OaRO5GnEGEg5vXPFyGA7zxLWoZkdU46RN1pfwF18Z-6rKXV8SE&audience=https://segurostupapa.us.auth0.com/api/v2/")
                .asString();
        return ResponseEntity.ok(response.getBody());
    }
}