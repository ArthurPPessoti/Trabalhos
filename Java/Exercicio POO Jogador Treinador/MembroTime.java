package com.mycompany.jogadortreinador;

public abstract class MembroTime {
    private String nome;
    private String cpf;
    
    public MembroTime(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        System.out.println(validarCPF());
    }
    
    private String validarCPF(){
        String validez;
        if (this.cpf.length() == 11){
            validez = this.nome + " possui CPF valido";
        } else {
            validez = this.nome + " possui CPF invalido";
        }
        return validez;
    }
    
    public abstract void jogar();
    
    public String toString(){
        return "Nome: " + this.nome + "\n" + "CPF: " + this.cpf + "\n";
    }
}
