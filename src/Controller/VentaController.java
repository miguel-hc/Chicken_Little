
package Controller;

import Model.Empleado;
import Model.Venta;
import bd.Conexion;
import bd.factoriaServicio;
import java.sql.SQLException;
import java.util.ArrayList;


public class VentaController {
    
    public ArrayList<Venta> listaVentas() throws 
            ClassNotFoundException, ClassNotFoundException, 
            InstantiationException, InstantiationException, 
            IllegalAccessException, SQLException{
        
        ArrayList ListaVenta = new ArrayList();
        Venta venta;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select asignacion_pollo.fecha, ruta.Nombre as ruta, cliente.NombreCliente as Nombre_del_cliente, rejas.Numero_reja, rejas.Numero_pollo,rejas.Kilogramo,rejas.Precio from asignacion_pollo inner join rejas on rejas.idRejas=asignacion_pollo.Rejas_idRejas inner join ruta on ruta.idRuta=asignacion_pollo.Ruta_idRuta inner join cliente on ruta.idRuta=cliente.Ruta_idRuta";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while (cdb.resultado.next()){
            venta = new Venta();
            
            venta.setFecha(cdb.resultado.getString(1));
            venta.setRuta(cdb.resultado.getString(2));
            venta.setNombreCliente(cdb.resultado.getString(3));
            venta.setNumeroRejas(cdb.resultado.getInt(4));
            venta.setNumeroPollos(cdb.resultado.getInt(5));
            venta.setKilogramo(cdb.resultado.getInt(6));
            venta.setPrecio(cdb.resultado.getInt(7));
            
            ListaVenta.add(venta);
            
        }           
        return ListaVenta;        
    }
}
