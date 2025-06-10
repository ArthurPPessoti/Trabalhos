package com.mycompany.exercicioherancaingresso;

public class Ingresso {
    protected double valor;
    public Ingresso(double valor){
        this.valor = valor;
    }
    
    public void imprimirValor(){
        System.out.println("O valor do ingresso eh " + this.valor);
    }
    
}
