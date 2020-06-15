
package Model;

import Controller.RutasController;
import bd.Conexion;
import java.util.ArrayList;
import bd.*;
import java.sql.SQLException;

public class Rutas {
    
    public ArrayList<RutasController> ListaRejas() throws ClassNotFoundException, ClassNotFoundException, InstantiationException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList listaRejas = new ArrayList();
        RutasController rejas;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from Rejas";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            rejas = new RutasController();
            rejas.setDnireja(cdb.resultado.getInt(2));
            rejas.setNumero(cdb.resultado.getInt(3));
            rejas.setKg(cdb.resultado.getInt(4));
            rejas.setPrecio(cdb.resultado.getInt(5));
            rejas.setFecha(cdb.resultado.getString(6));
            listaRejas.add(rejas);
        }
        
        return listaRejas;
    }
    
    public ArrayList<RutasController> Asignar_Ruta() throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
        
        ArrayList ListaRutas = new ArrayList();
        RutasController aRutas;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select Empleado.Nombre, Ruta.Nombre, Asignacion_rutas.Precio_kg, Asignacion_rutas.Fecha_salida, Asignacion_rutas.Fecha_llegada from Empleado inner join Asignacion_rutas on Empleado.idEmpleado = Asignacion_rutas.Empleado_idEmpleado inner join Ruta on Ruta.idRuta = Asignacion_rutas.Ruta_idRuta";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            aRutas = new RutasController();
            aRutas.setNombreEmpleado(cdb.resultado.getString(1));
            aRutas.setNombreRuta(cdb.resultado.getString(2));
            aRutas.setPrecioEnKg(cdb.resultado.getInt(3));
            aRutas.setFechaSalida(cdb.resultado.getString(4));
            aRutas.setFechallegada(cdb.resultado.getString(5));
            ListaRutas.add(aRutas);
            System.out.println(aRutas.getNombreEmpleado());
        }
        
        return ListaRutas;
    }
    
     public ArrayList<RutasController> Asignar_Transporte() throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
        
        ArrayList ListaTransporte = new ArrayList();
        RutasController aTransporte;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select Transportes.Nombre_Transporte, Empleado.Nombre, Transportes.Descripcion from Transportes join Asignacion_Transporte on Transportes.idTransportes = Asignacion_Transporte.Transportes_idTransportes join Empleado on Empleado.idEmpleado = Asignacion_Transporte.Empleado_idEmpleado";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            aTransporte = new RutasController();
            aTransporte.setNombreTransporte(cdb.resultado.getString(1));
            aTransporte.setNombreEmpleado(cdb.resultado.getString(2));
            aTransporte.setDescripcion(cdb.resultado.getString(3));
            ListaTransporte.add(aTransporte);
        }
        
        return ListaTransporte;
    }
    
}
