package com.example.beasiswaapps.model;

import com.example.beasiswaapps.base.BaseModel;

// Pewarisan
public class User extends BaseModel {
    private String username;
    private String password;

    // Enkapsulasi
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
