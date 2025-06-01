package com.mycompany.exercicioherancaclientecontas;

public class ExercicioHerancaClienteContas {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("c1", "123");
        
        c1.perfil();
        System.out.println("\n-----------------------\n");
        
        c1.criarConta(250.50, true, "p1");
        c1.criarConta(1456.86, true, "p2");
        c1.criarConta(105.30, true, "p3");
        c1.criarConta(1234.95, false, "c1");
        c1.criarConta(0.01, false, "c2");
        c1.criarConta(12348.63, false, "c3");
        c1.criarConta(15.30, false, "c4");
        
        c1.perfil();
        System.out.println("\n-----------------------\n");
        
        c1.contas.get(0).sacar(100.00);
        c1.contas.get(1).sacar(100.00);
        c1.contas.get(2).sacar(100.00);
        c1.contas.get(3).sacar(100.00);
        c1.contas.get(4).sacar(100.00);
        c1.contas.get(5).sacar(100.00);
        c1.contas.get(6).sacar(100.00);
        
        c1.perfil();
        System.out.println("\n-----------------------\n");
        
        
        c1.contas.get(0).depositar(100.00);
        c1.contas.get(1).depositar(100.00);
        c1.contas.get(2).depositar(100.00);
        c1.contas.get(3).depositar(100.00);
        c1.contas.get(4).depositar(100.00);
        c1.contas.get(5).depositar(100.00);
        c1.contas.get(6).depositar(100.00);
        
        c1.perfil();
        System.out.println("\n-----------------------\n");
        
        c1.contas.get(0).aplicarRendimento();
        c1.contas.get(1).aplicarRendimento();
        c1.contas.get(2).aplicarRendimento();
        c1.contas.get(3).aplicarRendimento();
        c1.contas.get(4).aplicarRendimento();
        c1.contas.get(5).aplicarRendimento();
        c1.contas.get(6).aplicarRendimento();
        
        c1.perfil();
        System.out.println("\n-----------------------\n");
    }
}
