package bd;

public class factoriaServicio {

    private Conexion cdb;
    
    private static factoriaServicio instancia;
    
    public static synchronized factoriaServicio getInstancia (){
        if(instancia == null){
            instancia = new factoriaServicio();
        }
        return instancia;
    }
    
    public Conexion getConexionDB() throws java.lang.ClassNotFoundException, java.lang.InstantiationException, java.lang.IllegalAccessException{
        
        if (cdb == null){
            String nombreClase = System.getProperty("databaseclass");
            cdb = (Conexion) Class.forName(nombreClase).newInstance();
        }
        return cdb;
    }
    
}
