package com.mycompany.jogadortreinador;

import java.util.*;

public class Time {
    private String nome;
    private List<Jogador> jogadores;
    private Tecnico tecnico;
    
    public Time(String nome){
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }
    
    public void adicionarJogador(String nome, String cpf){
        this.jogadores.add(new Jogador(nome, cpf));
    }
    
    public void adicionarTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }
    
    public String jogadores(){
        String dados = "";
        for (Jogador j : jogadores){
            dados += j;
        }
        return dados;
    }
    
    public void jogar() {
        for (Jogador j : jogadores){
            j.jogar();
        }
    }   
              
    public String toString(){
        return "Nome do time: " + this.nome + "\n" + 
                "Tecnico: " + this.tecnico + "\n" + 
                "Jogadores:\n" + jogadores();
    }
}
