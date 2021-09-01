package com.example.ppdm;

public class Usuario {
    String user;
    String senha;
    public Usuario(String user, String senha){
        this.user = user;
        this.senha = senha;
    }
    public boolean auth(String user, String senha){
        if(user.equals(this.user) && senha.equals(this.senha)){
            return true;
        }
        return false;
    }
}
