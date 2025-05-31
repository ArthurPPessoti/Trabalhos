
package com.mycompany.exerciciogrupoempresarial;

import java.util.*;

public class Administradora extends Juridica implements InstituicaoFinanceira{
    private double taxaCorretagem;
    private boolean plataformaOnline;
    private List<Investimento> investimentos;
    
    public Administradora(String nomeFantasia, String cnpj, String usuario, double taxaCorretagem, boolean plataformaOnline){
        super(nomeFantasia, cnpj, usuario);
        this.taxaCorretagem = taxaCorretagem;
        this.plataformaOnline = plataformaOnline;
        this.investimentos = new ArrayList<>();
    }
    
    public void criarInvestimento(int id, double valor){
        this.investimentos.add(new Investimento(id, valor, this));
    }
    
    @Override
    public void calcularAtivosFinanceiros(){
        double total = 0;
        if (!investimentos.isEmpty()){
            for (Investimento i : investimentos) {
                total += i.getValor();
            }
        } else {
            System.out.println("Não existe investimetnos");
        }
        System.out.println("Total de investimento: R$" + total);
    }
    
    private String imprimirInvestimentos(){
        String dados = "";
        for (Investimento i : investimentos){
            dados += i;
        }
        return dados;
    }
    
    @Override
    public void imprimir(){
        System.out.println(this.usuario + "\n" +
                "Nome Fantasia: " + this.nomeFantasia + "\n" +
                "CNPJ: " + this.cnpj + "\n" +
                "Taxa de Corretagem: " + this.taxaCorretagem + "\n" + 
                "Possui platafor online? " + this.plataformaOnline + "\n" +
                "Investimentos: \n" + imprimirInvestimentos());
    }
    
}
