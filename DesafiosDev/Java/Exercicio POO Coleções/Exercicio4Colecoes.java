package com.mycompany.exercicio4colecoes;

public class Exercicio4Colecoes {

    public static void main(String[] args) {
        Editora jambo = new Editora("Jambô Editora", "jambo.editora@gameil.com");
        Editora hc = new Editora("H.C.", "hc@gameil.com");
        
        System.out.println("\n-----------------------\n");        
        System.out.println(jambo);
        System.out.println(hc);
        System.out.println("\n-----------------------\n");
        
        Livro l1 = new Livro("l1", 2025, jambo);
        Livro l2 = new Livro("l2", 2020, jambo);
        Livro l3 = new Livro("l3", 1997, hc);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("\n-----------------------\n");
               
        Autor a1 = new Autor("a1", "1");
        Autor a2 = new Autor("a2", "2");
        Autor a3 = new Autor("a3", "3");
        Autor a4 = new Autor("a4", "4");
        Autor a5 = new Autor("a5", "5");
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println("\n-----------------------\n");
        
        l1.adicionarAutor(a1);
        l1.adicionarAutor(a3);
        l1.adicionarAutor(a2);        
        l1.adicionarAutor(a4);
        l2.adicionarAutor(a1);
        l2.adicionarAutor(a2);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("\n-----------------------\n");
        
        a5.adicionarLivro(l1);
        a3.adicionarLivro(l2);
        a4.adicionarLivro(l2);
        a5.adicionarLivro(l2);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("\n-----------------------\n");
        
        a1.adicionarContato("telefone", "190");
        a1.adicionarContato("email", "soucorno@gemail.com.br");
        a2.adicionarContato("telefone", "082420177484");
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("\n-----------------------\n");
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println("\n-----------------------\n");
    }
}
