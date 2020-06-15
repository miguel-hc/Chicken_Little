
package Controller;

import Model.Rutas;
import View.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListenerRutas implements ActionListener{

    Inicio inicio = new Inicio();
    Rutas rutas = new Rutas();
    
    public ListenerRutas(Inicio inicio, Rutas rutas){
        this.inicio = inicio;
        this.rutas = rutas;
    }
    
    public void llenarRejas(JTable tablarejas) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        DefaultTableModel modelR = new DefaultTableModel();
        tablarejas.setModel(modelR);
        
        modelR.addColumn("N de Reja");
        modelR.addColumn("Numero");
        modelR.addColumn("KG");
        modelR.addColumn("Precio");
        modelR.addColumn("Fecha");
        
        Object[] columna = new Object[5];
       
        int NumRegistro = rutas.ListaRejas().size();
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = rutas.ListaRejas().get(i).getDnireja();
            columna[1] = rutas.ListaRejas().get(i).getNumero();
            columna[2] = rutas.ListaRejas().get(i).getKg();
            columna[3] = rutas.ListaRejas().get(i).getPrecio();
            columna[4] = rutas.ListaRejas().get(i).getFecha();
            modelR.addRow(columna);
        }
    }
    
    public void llenarRutasAsignadas(JTable tablaRutas) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        DefaultTableModel modelR = new DefaultTableModel();
        tablaRutas.setModel(modelR);
        
        modelR.addColumn("Nombre Empleado");
        modelR.addColumn("Ruta");
        modelR.addColumn("Precio KG");
        modelR.addColumn("Fecha Entrada");
        modelR.addColumn("Fecha salida");
        
        Object[] columna = new Object[5];
       
        int NumRegistro = rutas.Asignar_Ruta().size();
        
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = rutas.Asignar_Ruta().get(i).getNombreEmpleado();
            columna[1] = rutas.Asignar_Ruta().get(i).getNombreRuta();
            columna[2] = rutas.Asignar_Ruta().get(i).getPrecioEnKg();
            columna[3] = rutas.Asignar_Ruta().get(i).getFechaSalida();
            columna[4] = rutas.Asignar_Ruta().get(i).getFechallegada();
            modelR.addRow(columna);
        }
        
    }
    
    
     public void llenarTrasporte(JTable tablaRutas) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        DefaultTableModel modelR = new DefaultTableModel();
        tablaRutas.setModel(modelR);
        
        modelR.addColumn("Nombre Trasporte");
        modelR.addColumn("Nombre Empleado");
        modelR.addColumn("Desceipcion");
       
        Object[] columna = new Object[3];
       
        int NumRegistro = rutas.Asignar_Transporte().size();
        
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = rutas.Asignar_Transporte().get(i).getNombreTransporte();
            columna[1] = rutas.Asignar_Transporte().get(i).getNombreEmpleado();
            columna[2] = rutas.Asignar_Transporte().get(i).getDescripcion();
            modelR.addRow(columna);
        }
     }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      
    }
    
    
    
    
}
