public class Investimento {
    private int id;
    private double valor;
    private Administradora administradora;
    
    public Investimento(int id, double valor, Administradora administradora){
        this.id = id;
        this.valor = valor;
        this.administradora = administradora;
    }

    public double getValor() {
        return valor;
    }   
    
    public int getId(){
        return id;
    }
    
    @Override           
    public String toString(){
        return "ID " + this.id + "\n" +
                "Valor: R$" + this.valor + "\n";
    }
}
