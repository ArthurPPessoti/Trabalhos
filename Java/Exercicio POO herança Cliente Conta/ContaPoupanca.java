package com.mycompany.exercicioherancaclientecontas;

public class ContaPoupanca extends Conta{
    private String apelido;
    private double taxaRendimento = 1.005;
    private double taxaSaque = 15.00;
    public ContaPoupanca(double saldo, String apelido){
        super(saldo);
        this.apelido = apelido;
    }    
    
    public void sacar(double valor){
        if (saldo >= (valor + taxaSaque)){
            saldo -= (valor + taxaSaque);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void aplicarRendimento(){
        saldo *= taxaRendimento;
    }
    
    public void saldo(){
        System.out.println("Conta corrente " + this.apelido + ", saldo: R$" + saldo + "\n");
    }
}
