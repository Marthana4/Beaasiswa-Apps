package com.example.beasiswaapps.controller;

import com.example.beasiswaapps.model.User;

// Polimorfisme: Metode overloading dan Metode overriding
public class AuthController {
    private static final String ADMIN_USERNAME = "marthanadiva";
    private static final String ADMIN_PASSWORD = "uaspbounsia";

    // Metode Overloading
    public boolean authenticate(String username, String password) {
        return ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password);
    }

    public boolean authenticate(User user) {
        return authenticate(user.getUsername(), user.getPassword());
    }
}
