package com.segurostupapa.app.adapters.controllers;

import com.segurostupapa.app.application.auth.AuthService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService){
        this.authService = authService;
    }


//    @GetMapping("/")
//    public String home(
//            Model model,
//            @AuthenticationPrincipal OidcUser principal
//            ) {
////        if (principal != null) {
////            model.addAttribute("profile", principal.getClaims());
////        }
//        System.out.println(model.getAttribute("profile"));
//        return "index";
//    }

//    @GetMapping("/logout")
//    public String logout(
//    ) {
//        return "Logut";
//    }

    @GetMapping("/secured")
    public String secured() { return "Hello form Secured"; }

}

