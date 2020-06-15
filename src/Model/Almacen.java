
package Model;

import bd.Conexion;
import bd.factoriaServicio;
import Controller.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class Almacen {
 
    public ArrayList<AlmacenController> listaAlmacenes() throws ClassNotFoundException, ClassNotFoundException, InstantiationException, InstantiationException, IllegalAccessException, SQLException{
        
        ArrayList listaAlmacen = new ArrayList();
        AlmacenController almacenes;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select Nombre_almacen, Cantidadad_vivos, Cantidad_muertos from Almacenes inner join Pollos on Almacenes.idAlmacenes = Pollos.Almacenes_idAlmacenes";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while (cdb.resultado.next()){     
            almacenes = new AlmacenController();
            almacenes.setNombre(cdb.resultado.getString(1));
            almacenes.setPolloVivos(cdb.resultado.getInt(2));
            almacenes.setPollosMuertos(cdb.resultado.getInt(3));
            listaAlmacen.add(almacenes);
        }
        return listaAlmacen;
    }
    
    public int getTotal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        int total = 0;
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select sum(Cantidadad_vivos) from Pollos";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        if (cdb.resultado.next()){
            AlmacenController almacenes = new AlmacenController();
            almacenes.setSuma(cdb.resultado.getInt(1));
            total = cdb.resultado.getInt(1);
        }
        return total;
    }
    
    
}
