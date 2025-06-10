package com.mycompany.exercicio4colecoes;

import java.util.*;

public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Editora editora;
    private List<Autor> autores;
    
    public Livro(String titulo, int anoPublicacao, Editora editora){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.autores = new ArrayList<>();
        editora.adicionarLivros(this);
    }
    
    public void adicionarAutor(Autor autor){
        if (this.autores.contains(autor)){
            System.out.println("Autor adicionado!");
        } else {
            this.autores.add(autor);
            autor.adicionarLivro(this);
        }
    }

    public String imprimirAutores() {
        String dados = "";
        for (Autor a : autores){
            dados += a;
        }
        return dados;
    }
    
    public String toString(){
        return "Titulo: " + this.titulo + "\n" + 
                "Ano de Publicação: " + this.anoPublicacao + "\n" + 
                "Editora: " + this.editora + "\n" + 
                "Autor(es): \n" + 
                imprimirAutores() + "\n";
    }
}
