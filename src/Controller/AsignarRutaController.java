
package Controller;
import Model.*;
import bd.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class AsignarRutaController {
    
    int idEmpleado;
    int idRuta;
    
    public ArrayList<String> ListarEmpleado() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        ArrayList lista = new ArrayList();
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from Empleado";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            lista.add(cdb.resultado.getString("Nombre"));
        }
        return lista;
    }
    
    public ArrayList<String> ListarRuta() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        ArrayList lista = new ArrayList();
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from Ruta";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            lista.add(cdb.resultado.getString("Nombre"));
        }
        return lista;
    }
    
    public void AsignarRuta(String nombre, String ruta, int precio, String fechaE, String fechaS, int gasto) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select idEmpleado from Empleado where Nombre = '"+nombre+"'";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        if (cdb.resultado.next()){
            idEmpleado = cdb.resultado.getInt("idEmpleado");
        
        }
        
        cdb.un_sql = "select idRuta from Ruta where Nombre = '"+ruta+"'";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        if (cdb.resultado.next()){
            idRuta = cdb.resultado.getInt("idRuta");
        
        }
        
        cdb.un_sql = "INSERT INTO Asignacion_rutas (Empleado_idEmpleado, Ruta_idRuta, Fecha_salida, Fecha_llegada, Observaciones, GastosTotal) VALUES ("+idEmpleado+", "+idRuta+", '"+fechaS+"', '"+fechaE+"', 'null', "+gasto+");";
        cdb.un_st.executeUpdate(cdb.un_sql);
        System.out.println(cdb.un_sql);
        
    }
    
}
