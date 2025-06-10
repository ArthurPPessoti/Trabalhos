package com.mycompany.exercicioherancaingresso;

public class Vip extends Ingresso{
    private double taxa = 100.00;
    public Vip(double valor){
        super(valor);
    }
    
    @Override
    public void imprimirValor(){
        System.out.println("Este ingresso eh vip com valor de " + (valor + taxa));
    }
}
