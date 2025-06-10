
package com.mycompany.exercicioherancaingresso;

public class ExercicioHerancaIngresso {

    public static void main(String[] args) {
        Vip vip = new Vip(600.99);
        vip.imprimirValor();
        
        Normal normal = new Normal(600.99);
        normal.imprimirValor();
    }
}
