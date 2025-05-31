package com.mycompany.exerciciogrupoempresarial;

public class Venda {
    private int id;
    private double valor;
    private Comercio comercio;
    
    public Venda(int id, double valor, Comercio comercio){
        this.id = id;
        this.valor = valor;
        this.comercio = comercio;
    }
    
    @Override           
    public String toString(){
        return "ID " + this.id + "\n" +
                "Valor: R$" + this.valor + "\n";
    }
}
