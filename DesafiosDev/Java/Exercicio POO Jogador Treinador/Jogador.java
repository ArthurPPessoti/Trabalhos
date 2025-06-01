package com.mycompany.jogadortreinador;

public class Jogador extends MembroTime{
    public Jogador(String nome, String cpf){
        super(nome, cpf);
    }
    
    @Override
    public void jogar(){
        System.out.println("jogando...");
    }
}
