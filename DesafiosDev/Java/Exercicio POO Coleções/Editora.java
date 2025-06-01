package com.mycompany.exercicio4colecoes;

import java.util.*;

public class Editora {
    private String nome;
    private String email;
    private List<Livro> livros;
    
    public Editora(String nome, String email){
        this.nome = nome;
        this.email = email;
        this.livros = new ArrayList<>();
    }
    
    public void adicionarLivros(Livro livro){
        this.livros.add(livro);
    }
    
    public String toString(){
        return "Editora: " + this.nome + "\n" + 
                "Email: " + this.email + "\n";
    }
}
