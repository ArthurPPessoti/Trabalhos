package com.mycompany.exercicioherancaingresso;

public class Normal extends Ingresso{
    public Normal(double valor){
        super(valor);
    }
    
    @Override
    public void imprimirValor(){
        System.out.println("Este ingresso eh normal com valor de " + valor);
    }
}
