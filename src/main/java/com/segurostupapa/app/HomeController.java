package com.segurostupapa.app;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    String home(OAuth2AuthenticationToken authentication) {
        return "home";
    }
    @GetMapping("/payment-page")
    public String model(Model model){
        return "index";
    }



}