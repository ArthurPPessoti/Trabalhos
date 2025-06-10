package com.mycompany.exercicio4colecoes;

import java.util.*;

public class Autor {
    private String nome;
    private String abreviatura;
    private List<Livro> livros;
    private List<Contato> contatos;
    
    public Autor(String nome, String abreviatura){
        this.nome = nome;
        this.abreviatura = abreviatura;
        this.livros = new ArrayList<>();
        this.contatos = new ArrayList<>();
    }
    
    public void adicionarContato(String tipo, String contato){
        this.contatos.add(new Contato(tipo, contato, this));
    }
    
    public void adicionarLivro(Livro livro){
        if (this.livros.contains(livro)){
            System.out.println("Livro adicionado");
        } else {
            this.livros.add(livro);
            livro.adicionarAutor(this);
        }
    }
    
    private String imprimirContatos(){
        String dados = "";
        for (Contato c : contatos){
            dados += c; 
        }
        return dados;
    }
    
    public String toString(){
        return "Nome: " + this.nome + " [" + this.abreviatura + "]\n" + 
                imprimirContatos() + "\n";
    }
}
