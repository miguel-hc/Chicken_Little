package bd;

public class Error extends Exception {
    private int codigo;
    private String mensaje;
    
    public Error (int codigo, String mensaje){
        this.codigo = codigo;
        this.mensaje = mensaje;
    }
    
    public int codigo (){
        return codigo;
    }
    
    public String mensaje (){
        return mensaje;
    }
    
}
