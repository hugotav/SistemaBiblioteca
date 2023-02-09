package com.mycompany.desafiodevtechlead;

import java.util.ArrayList;

public class Livro {
    
    private String nome;
    private int ano;
    private String editora;
    private int codigoCadastro;
    
    public Livro() {
        
}
    public Livro(String nome, int ano, String editora, int codigoCadastro){
        this.nome = nome;
        this.ano = ano;
        this.editora = editora;
        this.codigoCadastro = codigoCadastro;
        
    }
    
    public String getNome() {
        return nome;
    }
    public int getAno() {
        return ano;
    }
    public String getEditora() {
        return editora;
    }
    public int getCodigoCadastro() {
        return codigoCadastro;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public void setCodigoCadastro(int codigoCadastro) {
        this.codigoCadastro = codigoCadastro;
    }
    
    @Override
    public String toString(){
    
        return "\nNome: " + this.getNome() + " " + 
                "\nAno: " + this.getAno()+
                "\nEditora: " + this.getEditora();
    
    }

}
