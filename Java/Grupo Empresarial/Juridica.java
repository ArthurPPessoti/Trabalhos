public class Juridica extends Cliente{
    protected String nomeFantasia;
    protected String cnpj;
    
    public Juridica(String nomeFantasia, String cnpj, String usuario){
        super(usuario);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        validarCNPJ(cnpj);
        
    }
    
    private void validarCNPJ(String cnpj){
        if (cnpj.length() == 14){
            System.out.println("CNPJ válido!");
        } else {
            System.out.println("CNPJ ínválido!");
        }
    }
    
    @Override
    public void imprimir(){
        System.out.println(this.usuario + "\n" +
                "Nome Fantasia: " + this.nomeFantasia + "\n" +
                "CNPJ: " + this.cnpj);
    }
}
