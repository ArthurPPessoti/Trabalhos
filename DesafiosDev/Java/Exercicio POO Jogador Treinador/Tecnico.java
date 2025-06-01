package com.mycompany.jogadortreinador;

public class Tecnico extends MembroTime implements Gerencia{
    public Tecnico(String nome, String cpf){
        super(nome, cpf);
    }
    
    @Override
    public void jogar(){
        System.out.println("Aposentado");
    }
    
    public void organizarTime(){
        System.out.println("Organizando time");
    }
    
    public void treinar(){
        System.out.println("Treinando time");
    }
}
