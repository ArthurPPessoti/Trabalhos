import java.util.ArrayList;
import java.util.List;

public class Comercio extends Juridica{
    private String ramoOperacional;
    private List<Venda> vendas;
    
    public Comercio(String nomeFantasia, String cnpj, String usuario, String ramoOperacional){
        super(nomeFantasia, cnpj, usuario);
        this.ramoOperacional = ramoOperacional;
        this.vendas = new ArrayList<>();
    }
    
    public void criarVendas(int id, double valor){
        this.vendas.add(new Venda(id, valor, this));
        
    }
    
    public String imprimirVendas(){
        String dados = "";
        for (Venda v : vendas){
            dados += v;
        }
        return dados;
    }
    
    @Override
    public void imprimir(){
        System.out.println(this.usuario + "\n" +
                "Nome Fantasia: " + this.nomeFantasia + "\n" +
                "CNPJ: " + this.cnpj + "\n" +
                "Ramo Operacional: " + this.ramoOperacional + "\n" + 
                "Vendas: \n" + imprimirVendas());
    }
}
