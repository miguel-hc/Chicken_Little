
package Controller;

import bd.Conexion;
import bd.factoriaServicio;
import java.sql.SQLException;
import java.util.ArrayList;


public class AsignarTransporteController {

    public ArrayList<String> ListarEmpleado() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        ArrayList lista = new ArrayList();
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from Empleado";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while (cdb.resultado.next()){
            lista.add(cdb.resultado.getString("Nombre"));
        }
        
        return lista;
        
    }
    
    public ArrayList<String> ListarTransporte() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        ArrayList lista = new ArrayList();
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from Transportes";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while (cdb.resultado.next()){
            lista.add(cdb.resultado.getString("Nombre_Transporte"));
        }
        
        return lista;
        
    }
    
    public void AsignarTransporte(String empleado, String transporte) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        int dniTransporte = 0;
        int dniEmpleado = 0;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select idEmpleado from Empleado where Nombre = '"+empleado+"'";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        if (cdb.resultado.next()){
            dniEmpleado = cdb.resultado.getInt("idEmpleado");
        }       
        
        cdb.un_sql = "select idTransportes from Transportes where Nombre_Transporte = '"+transporte+"'";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        if (cdb.resultado.next()){
            dniTransporte = cdb.resultado.getInt("idTransportes");
        }
        
        cdb.un_sql = "INSERT INTO Asignacion_Transporte (Transportes_idTransportes, Empleado_idEmpleado) VALUES ("+dniTransporte+", "+dniEmpleado+")";
        System.out.println(cdb.un_sql);
        cdb.un_st.executeUpdate(cdb.un_sql);
    }
    
}
