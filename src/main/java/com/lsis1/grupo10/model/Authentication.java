package com.lsis1.grupo10.model;

public class Authentication {
    private String username;
    private String password;

    public Authentication(){
        this.username = "";
        this.password = "";
    }

    public Authentication(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}