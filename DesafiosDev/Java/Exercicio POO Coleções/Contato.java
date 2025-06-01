package com.mycompany.exercicio4colecoes;

public class Contato {
    private String tipo;
    private String contato;
    private Autor autor;
    
    public Contato(String tipo, String contato, Autor autor){
        this.tipo = tipo;
        this.contato = contato;
        this.autor = autor;
    }
    
    public String toString(){
        return "Tipo: " + this.tipo + "\n" +
                "Contato: " + this.contato + "\n";
    }
}
