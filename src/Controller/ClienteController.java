
package Controller;
import Model.Cliente;
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

public class ClienteController {
    
    public ArrayList<Cliente> listarCliente() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        ArrayList lista = new ArrayList();
        Cliente cliente;
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "SELECT idCliente,NombreCliente,Apellido,Sexo,Direccion,Telefono,Credito1,Credito2,Credito3,sum(Credito1+Credito2+Credito3) as total,ruta.Nombre  FROM cliente inner join ruta on ruta.idRuta=cliente.Ruta_idRuta group by idCliente";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while (cdb.resultado.next()){
        
           cliente = new Cliente();
           cliente.setDni(cdb.resultado.getInt(1));
           cliente.setNombre(cdb.resultado.getString(2));
           cliente.setApellidos(cdb.resultado.getString(3));
           cliente.setSexo(cdb.resultado.getString(4));
           cliente.setDirecion(cdb.resultado.getString(5));
           cliente.setTelefono(cdb.resultado.getString(6));
           cliente.setCredito1(cdb.resultado.getInt(7));
           cliente.setCredito2(cdb.resultado.getInt(8));
           cliente.setCredito3(cdb.resultado.getInt(9));
           cliente.setSuma(cdb.resultado.getInt(10));
           cliente.setRuta(cdb.resultado.getString(11));
           
           lista.add(cliente);
        }
        return lista;
    }
    
    public void UpdateClienteCredito(int Dni,String Nombre, String Apellidos, String Sexo, String Direcion, String Telefono, int Credito1, int Credito2, int Credito3, String Ruta) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "UPDATE cliente SET Credito1 = "+Credito1+", Credito2 = "+Credito2+", Credito3 = "+Credito3+" WHERE (idCliente = "+Dni+")";
        try {
            cdb.un_st.executeUpdate(cdb.un_sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public ArrayList<String> listaRuta() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        ArrayList lista = new ArrayList();
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from ruta";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        while (cdb.resultado.next()){
            lista.add(cdb.resultado.getString("Nombre"));
            System.out.println(cdb.resultado.getString("Nombre"));
        }
        
        return lista;
    }
    
    public ArrayList<String> listaEmpleado() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        ArrayList lista = new ArrayList();
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from empleado";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        while (cdb.resultado.next()){
            lista.add(cdb.resultado.getString("Nombre"));
            System.out.println(cdb.resultado.getString("Nombre"));
        }
        
        return lista;
    }
    
    public ArrayList<String> ListaTransporte() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        ArrayList lista = new ArrayList();
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "select * from transportes";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);
        
        while(cdb.resultado.next()){
            lista.add(cdb.resultado.getString("Nombre_Transporte"));
        }
        return lista;
    }
    
    public void DeleteCliente(int Dni) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "delete from cliente where idCliente = "+Dni+"";
        try {
            cdb.un_st.executeUpdate(cdb.un_sql);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void InsertClienteCredito(String Nombre, String Apellidos, String Sexo, String Direcion, String Telefono, int Credito1, int Credito2, int Credito3, String Ruta) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        cdb.un_sql = "call GenerarCredito('"+Nombre+"', '"+Apellidos+"', '"+Sexo+"', '"+Direcion+"', '"+Telefono+"', "+Credito1+","+Credito2+","+Credito3+", '"+Ruta+"')";
        cdb.un_st.executeUpdate(cdb.un_sql);
    }
    
    public void getReporte() throws JRException, ClassNotFoundException, InstantiationException, IllegalAccessException{
    
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        JasperReport report= null;
        
        String path = "src/Reporte/ReportCliente.jasper";
        
        report = (JasperReport) JRLoader.loadObjectFromFile(path);
        
        JasperPrint jprint = JasperFillManager.fillReport(report, null, cdb.getConexion());
        
        JasperViewer view = new JasperViewer(jprint, false);
        
        view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        view.setVisible(true);
    }
    
}
