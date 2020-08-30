
package Model;

import Controller.AsignarRutaController;
import Controller.RutasController;
import bd.Conexion;
import java.util.ArrayList;
import bd.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Rutas {
    
    int idEmpleado;
    int idRuta;
    
    public ArrayList<RutasController> getLista() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        ArrayList ruta = new ArrayList();
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "";
//        try {
//            cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(AsignarRutaController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        return ruta;
    }
    
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
    
    
    
    public void AsignarRuta(int Nreja, int Npollos, int Kg, int PrecioKg, String Ruta, int PrecioTotal) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "call AsignarPollos ("+Nreja+", "+Npollos+", "+Kg+", "+PrecioKg+", "+PrecioTotal+", '"+Ruta+"')";
        cdb.un_st.executeUpdate(cdb.un_sql);
    }
    
    public ArrayList<RutasController> Search(String Nombre){
    
        ArrayList lista = new ArrayList();
        
        
        return lista;
        
    }
     
    
    public void UpdateAsignarRuta(int Nreja, int Npollos, int Kg, int PrecioKg, String Transporte, String Empleado, int PrecioTotal){
    
        
    }
     
}
