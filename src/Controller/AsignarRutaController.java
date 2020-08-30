
package Controller;
import Model.*;
import bd.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class AsignarRutaController {
    
    ////////////////////////
    public ArrayList<AsignarRutaModel> ListaRejas() throws ClassNotFoundException, ClassNotFoundException, InstantiationException, InstantiationException, IllegalAccessException, SQLException{
        ArrayList listaRejas = new ArrayList();
        AsignarRutaModel rejas;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select ruta.Nombre as NombreRuta, empleado.Nombre as NombreEmpleado, transportes.Nombre_Transporte as NombreTransporte, rejas.Numero_reja, rejas.Numero_pollo, rejas.Kilogramo, rejas.Precio, rejas.Fecha from ruta inner join asignacion_rutas on ruta.idRuta = asignacion_rutas.Ruta_idRuta inner join empleado on asignacion_rutas.empleado_idEmpleado inner join asignacion_transporte on empleado.idEmpleado = asignacion_transporte.Empleado_idEmpleado inner join transportes on asignacion_transporte.Empleado_idEmpleado = empleado.idEmpleado inner join asignacion_pollo on ruta.idRuta = asignacion_pollo.Ruta_idRuta inner join rejas on asignacion_pollo.Rejas_idRejas = rejas.idRejas";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            rejas = new AsignarRutaModel();
            rejas.setNombreRuta(cdb.resultado.getString(1));
            rejas.setNombreEmpleado(cdb.resultado.getString(2));
            rejas.setNombreTransporte(cdb.resultado.getString(3));
            rejas.setNumeroreja(cdb.resultado.getInt(4));
            rejas.setNumeroPollos(cdb.resultado.getInt(5));
            rejas.setKg(cdb.resultado.getInt(6));
            rejas.setPrecio(cdb.resultado.getInt(7));
            rejas.setFecha(cdb.resultado.getString(8));
            listaRejas.add(rejas);
        }
        
        return listaRejas;
    }
    
    public void Asignar_Ruta(int numeroreja, int numeropollo, int kg, int precio, int precioTotal, String nombreruta, String nombreempleado, String nombretransporte) throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "call AsignarPollos("+numeroreja+","+numeropollo+","+kg+", "+precio+", "+precioTotal+", '"+nombreruta+"', '"+nombreempleado+"','"+nombretransporte+"')";
        cdb.un_st.executeUpdate(cdb.un_sql);
        
    }
    
     public ArrayList<RutasController> Asignar_Transporte() throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
        
        ArrayList ListaTransporte = new ArrayList();
        AsignarRutaModel aTransporte;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select Transportes.Nombre_Transporte, Empleado.Nombre, Transportes.Descripcion from Transportes join Asignacion_Transporte on Transportes.idTransportes = Asignacion_Transporte.Transportes_idTransportes join Empleado on Empleado.idEmpleado = Asignacion_Transporte.Empleado_idEmpleado";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            aTransporte = new AsignarRutaModel();
            aTransporte.setNombreTransporte(cdb.resultado.getString(1));
            aTransporte.setNombreEmpleado(cdb.resultado.getString(2));
            aTransporte.setDescripcion(cdb.resultado.getString(3));
            ListaTransporte.add(aTransporte);
        }
        
        return ListaTransporte;
    }
     
     public ArrayList<RutasController> SearchPR(String fecha) throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
        
        ArrayList listaRejas = new ArrayList();
        AsignarRutaModel rejas;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from Rejas where Fecha like '%"+fecha+"%'";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            rejas = new AsignarRutaModel();
            rejas.setDnireja(cdb.resultado.getInt(2));
            //rejas.setNumero(cdb.resultado.getInt(3));
            rejas.setKg(cdb.resultado.getInt(4));
            rejas.setPrecio(cdb.resultado.getInt(5));
            rejas.setFecha(cdb.resultado.getString(6));
            listaRejas.add(rejas);
        }
        
        return listaRejas;
    }
     
     
     public ArrayList<AsignarRutaModel> SearchAsignarRuta(String tabla, String condicion) throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
        
        ArrayList listaRejas = new ArrayList();
        AsignarRutaModel rejas;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select Empleado.Nombre, Ruta.Nombre, Asignacion_rutas.GastosTotal, Asignacion_rutas.Fecha_salida, Asignacion_rutas.Fecha_llegada from Empleado inner join Asignacion_rutas on Empleado.idEmpleado = Asignacion_rutas.Empleado_idEmpleado inner join Ruta on Ruta.idRuta = Asignacion_rutas.Ruta_idRuta where "+tabla+" like '%"+condicion+"%'";
        System.out.println(cdb.un_sql);
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            rejas = new AsignarRutaModel();
            rejas.setNombreEmpleado(cdb.resultado.getString(1));
            rejas.setNombreRuta(cdb.resultado.getString(2));
            rejas.setPrecio(cdb.resultado.getInt(3));
            rejas.setFechaSalida(cdb.resultado.getString(4));
            rejas.setFechallegada(cdb.resultado.getString(5));
            listaRejas.add(rejas);
        }
        
        return listaRejas;
    }
    
     
     public void getTicket() throws JRException, ClassNotFoundException, InstantiationException, IllegalAccessException{
     
         Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        JasperReport report= null;
        
        String path = "src/Reporte/Ticket.jasper";
        
        report = (JasperReport) JRLoader.loadObjectFromFile(path);
        
        JasperPrint jprint = JasperFillManager.fillReport(report,null, cdb.getConexion());
        
        JasperViewer view = new JasperViewer(jprint, false);
        
        view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        view.setVisible(true);
     
     }
}
