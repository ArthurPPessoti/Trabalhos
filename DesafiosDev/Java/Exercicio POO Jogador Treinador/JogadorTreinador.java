package com.mycompany.jogadortreinador;

public class JogadorTreinador {

    public static void main(String[] args) {
        Tecnico t1 = new Tecnico("t1", "12345678910");
        Tecnico t2 = new Tecnico("t2", "01987654321");
        Tecnico t3 = new Tecnico("t3", "01470258369");
        
        System.out.println("\n-----------------------\n");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println("\n-----------------------\n");
        
        Time time1 = new Time("time 1");
        Time time2 = new Time("time 2");
        
        System.out.println("\n-----------------------\n");
        System.out.println(time1);
        System.out.println(time2);
        System.out.println("\n-----------------------\n");
        
        time1.adicionarJogador("j1", "11111111111");
        time1.adicionarJogador("j2", "22222222222");
        time1.adicionarJogador("j3", "33333333333");
        time2.adicionarJogador("j4", "44444444444");
        time2.adicionarJogador("j5", "0");
        
        System.out.println("\n-----------------------\n");
        System.out.println(time1);
        System.out.println(time2);
        System.out.println("\n-----------------------\n");
        
        time1.adicionarTecnico(t1);
        time2.adicionarTecnico(t2);
        
        System.out.println("\n-----------------------\n");
        System.out.println(time1);
        System.out.println(time2);
        System.out.println("\n-----------------------\n");
        
        time1.adicionarTecnico(t3);
        
        System.out.println("\n-----------------------\n");
        System.out.println(time1);
        System.out.println(time2);
        System.out.println("\n-----------------------\n");
        
        time1.jogar();        
    }
}
