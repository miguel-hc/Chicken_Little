
package Model;

import bd.Conexion;
import bd.factoriaServicio;
import Controller.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Almacen {
 
    public ArrayList<AlmacenController> listaAlmacenes() throws ClassNotFoundException, ClassNotFoundException, InstantiationException, InstantiationException, IllegalAccessException, SQLException{
        
        ArrayList listaAlmacen = new ArrayList();
        AlmacenController almacenes;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select almacenes.Nombre_almacen, pollos.Cantidadad_vivos, pollos.Cantidad_muertos, pollos.Precio_unitario, pollos.Fecha_ingreso from almacenes inner join pollos on almacenes.idAlmacenes = pollos.Almacenes_idAlmacenes";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while (cdb.resultado.next()){     
            almacenes = new AlmacenController();
            almacenes.setNombre(cdb.resultado.getString(1));
            almacenes.setPolloVivos(cdb.resultado.getInt(2));
            almacenes.setPollosMuertos(cdb.resultado.getInt(3));
            almacenes.setPrecio(cdb.resultado.getInt(4));
            almacenes.setFecha(cdb.resultado.getString(5));
            listaAlmacen.add(almacenes);
        }
        return listaAlmacen;
    }
    
    public int getTotal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        int total = 0;
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select sum(Cantidadad_vivos) from pollos";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        if (cdb.resultado.next()){
            AlmacenController almacenes = new AlmacenController();
            almacenes.setTotalAves(cdb.resultado.getInt(1));
            total = cdb.resultado.getInt(1);
        }
        return total;
    }
    
    public ArrayList<AlmacenController>SearchAlmacen(String nombre) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        ArrayList lista = new ArrayList();
        
         AlmacenController almacenes;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select Nombre_almacen, Cantidadad_vivos, Cantidad_muertos from almacenes inner join Pollos on almacenes.idAlmacenes = pollos.Almacenes_idAlmacenes where Nombre_almacen like '%"+nombre+"%'";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while (cdb.resultado.next()){     
            almacenes = new AlmacenController();
            almacenes.setNombre(cdb.resultado.getString(1));
            almacenes.setPolloVivos(cdb.resultado.getInt(2));
            almacenes.setPollosMuertos(cdb.resultado.getInt(3));
            almacenes.setPrecio(cdb.resultado.getInt(4));
            almacenes.setFecha(cdb.resultado.getString(5));
            lista.add(almacenes);
        }
        
        return lista;
    }
     
    public void UpdateNuevoPollo(String nombre,int PollosVivos, int PollosMuertos,int Precio, String Fecha) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        int Dni = 0;
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "Select idAlmacenes from almacenes where Nombre_almacen = '"+nombre+"'";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);  
        if (cdb.resultado.next()){
            Dni = cdb.resultado.getInt(1);
            System.out.println(Dni);
        }
        
        cdb.un_sql = "UPDATE pollos SET Cantidadad_vivos = "+PollosVivos+", Cantidad_muertos = "+PollosMuertos+", Precio_unitario = "+Precio+" WHERE (Almacenes_idAlmacenes = "+Dni+")";
        cdb.un_st.executeUpdate(cdb.un_sql);  
        
    }
    
    public void DeleteAlmacen(String NombreAlmacen) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "";
        cdb.un_st.executeQuery(cdb.un_sql);  
    }
    
    public void InsertPollos(String Almacen, int PollosVivos, int PollosMuertos, int Precio) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "call almacenpollo ('"+Almacen+"', "+PollosVivos+", "+PollosMuertos+", "+Precio+")";
        try {
            cdb.un_st.executeUpdate(cdb.un_sql);
        } catch (SQLException ex) {
            Logger.getLogger(Almacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<AlmacenController> ListarTransporte() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        ArrayList listaAlmacen = new ArrayList();
        AlmacenController almacenes;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "Select * from transportes";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while (cdb.resultado.next()){     
            almacenes = new AlmacenController();
            almacenes.setDniTransporte(cdb.resultado.getInt(1));
            almacenes.setNombreTransporte(cdb.resultado.getString(2));
            almacenes.setDescripcionTransporte(cdb.resultado.getString(3));
            
            listaAlmacen.add(almacenes);
        }
        return listaAlmacen;
        
    }
    
    public void InsertTransporte(String Nombre, String Descripcion) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "insert into transportes values(0,'"+Nombre+"', '"+Descripcion+"')";  
        cdb.un_st.executeUpdate(cdb.un_sql);
    }
    
    public void UpdateTransporte(int Dni, String Nombre, String Descripcion) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "UPDATE transportes SET Nombre_Transporte = '"+Nombre+"', Descripcion = '"+Descripcion+"' WHERE (idTransportes = "+Dni+")";  
        cdb.un_st.executeUpdate(cdb.un_sql);
        System.out.println(cdb.un_sql);
    }
    
    public void DeleteTransporte(int Dni) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "delete from transportes where idTransportes = "+Dni+"";  
        cdb.un_st.executeUpdate(cdb.un_sql);
    }
    
}
