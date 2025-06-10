package com.mycompany.exercicioherancaclientecontas;

public abstract class Conta {
    protected double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    public abstract void sacar(double valor);
    public abstract void aplicarRendimento();
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    
    public abstract void saldo();
}
