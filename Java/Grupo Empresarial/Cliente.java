public abstract class Cliente {
    protected String usuario;
    
    public Cliente(String usuario){
        this.usuario = usuario; 
    }
    
    public abstract void imprimir();
}
