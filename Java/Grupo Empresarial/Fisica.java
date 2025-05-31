public class Fisica extends Cliente{
    private String nome;
    private String cpf;
    
    public Fisica(String nome, String cpf, String usuario){
        super(usuario);
        this.nome = nome;
        this.cpf = cpf;
        validarCPF(cpf);
        
    }
    
    public void validarCPF(String cpf){
        if (cpf.length() == 11){
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF ínválido!");
        }
    }
    
    @Override
    public void imprimir(){
        System.out.println(this.usuario + "\n" +
                "Nome: " + this.nome + "\n" +
                "CPF: " + this.cpf);
    }
}
