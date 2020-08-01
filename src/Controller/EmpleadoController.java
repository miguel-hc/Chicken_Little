
package Controller;

import Model.Empleado;
import bd.*;
import java.sql.SQLException;
import java.util.ArrayList;
import View.Inicio;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpleadoController {
    
    Conexion conexion;
    public boolean estaddclient = false;
   

    public ArrayList<Empleado> getListaEmpleados() throws 
            ClassNotFoundException, ClassNotFoundException, 
            InstantiationException, InstantiationException, 
            IllegalAccessException, SQLException{
        
        ArrayList ListaEmpleados = new ArrayList();
        Empleado empleados;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from Empleado";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while (cdb.resultado.next()){
            empleados = new Empleado();
            empleados.setDNI(cdb.resultado.getInt(1));
            empleados.setNombre(cdb.resultado.getString(2));
            empleados.setApellidos(cdb.resultado.getString(3));
            empleados.setSexo(cdb.resultado.getString(4));
            empleados.setDireccion(cdb.resultado.getString(5));
            empleados.setTelefono(cdb.resultado.getString(6));
            
            ListaEmpleados.add(empleados);
            
        }
            
        return ListaEmpleados;
        
    }
    
    public void AddEmpleado(int id, String nombre, String apellidos, String sexo, String direccion, String telefono) 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        if (!"".equals(nombre) && !"".equals(apellidos) && !"".equals(direccion) && !"".equals(telefono)){
            Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
            cdb.un_sql = "insert into Empleado values ("+id+",'"+nombre+"','"+apellidos+"','"+sexo+"', '"+direccion+"', '"+telefono+"')";
            cdb.un_st.executeUpdate(cdb.un_sql);
            estaddclient = true;
            System.out.println("Empleado registrado");
        }else {
            System.out.println("Error datos vacios");
            estaddclient = false;
        }
    }
    
    public boolean getStatusAddClient(){
        return estaddclient;
    }
    
    public void DeleteEmpleado(String dni) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "delete from Empleado where idEmpleado = "+dni+"";
        cdb.un_st.executeUpdate(cdb.un_sql);
        
    }
    
}
