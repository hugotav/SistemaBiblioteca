package com.mycompany.desafiodevtechlead;

public class Cliente {
    
    private String nome;
    private int tipoConta;
    private int id;
    private int login;
    private int senha;
    
    public Cliente(){
    
    }
    
    public Cliente(String nome, int tipoConta, int id, int senha){
        this.nome = nome;
        this.tipoConta = tipoConta;
        this.id = id;
        //this.login = id;
        this.senha = senha;
    }
   
    public String getNome() {
        return nome;
    }
    public int getTipoConta() {
        return tipoConta;
    }
    public int getId() {
        return id;
    }
    
    

    public int getSenha() {
        return senha;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
      
    @Override
    public String toString(){
    
        return "\nNome: " + this.getNome() + " " + 
                "\nIdentidade: " + this.getId() +
                "\nLogin: " + this.getId();
    
    }
    
    
}
