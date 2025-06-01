package com.mycompany.exercicioherancaclientecontas;

import java.util.*;

public class Cliente {
    private String nome;
    private String cpf;
    protected List<Conta> contas;
    
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        this.contas = new ArrayList<>();
    }
    
    public void criarConta(double saldo, boolean poupanca, String apelido){
        if (poupanca == true){
            this.contas.add(new ContaPoupanca(saldo, apelido));
        } else {
            this.contas.add(new ContaCorrente(saldo, apelido));
        }
    }
    
    public void perfil(){
        System.out.println("Cliente " + this.nome + "\n");
        for (Conta c : contas){
            c.saldo();
        }
    }
}
