package com.example.agendadecontatos;

public class DtoLogin {
    private String nome;
    private String usuario;
    private String senha;

    public DtoLogin(String nome, String usuario, String senha) {
        this.nome = nome;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autenticar(String usuario, String senha){
        if(this.usuario.equals(usuario)&&this.senha.equals(senha)){
            return true;
        }
       return false;
    }

}
