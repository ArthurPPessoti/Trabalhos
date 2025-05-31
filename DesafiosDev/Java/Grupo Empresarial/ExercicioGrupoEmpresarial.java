public class ExercicioGrupoEmpresarial {

    public static void main(String[] args) {
        Comercio c1 = new Comercio("Petrobras", "12345678901234", "Governo", "Exploração de petroleo");
        Comercio c2 = new Comercio("Vale", "43210987654321", "Antonio Fagundes", "Exploração de minério de ferro");
        
        c1.criarVendas(1, 10.00);
        c1.criarVendas(2, 20.00);
        c2.criarVendas(3, 30.00);
        c2.criarVendas(4, 40.00);
        
        Fisica f1 = new Fisica("Antonio Bandeiras", "00000000000", "f1");
        Fisica f2 = new Fisica("Bob Dylan", "12312312312", "f2");
        
        Administradora a1 = new Administradora("Inteligencia LTDA", "99999999999999", "Vilela", 0.05, false);
        Administradora a2 = new Administradora("monark Talks", "14204204204201", "Monark", 0.1, true);
        
        a1.criarInvestimento(5, 1000.99);
        a2.criarInvestimento(6, 4.20);
        a1.criarInvestimento(7, 540.99);
        a2.criarInvestimento(8, 159.56);      
        
        c1.imprimir();
        c2.imprimir();
        f1.imprimir();
        f2.imprimir();
        a1.imprimir();
        a1.calcularAtivosFinanceiros();
        a2.imprimir();
        a2.calcularAtivosFinanceiros();
        
    }
}
