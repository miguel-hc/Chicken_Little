
package Controller;

import Model.Rutas;
import View.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListenerRutas implements ActionListener, KeyListener{

    Inicio inicio = new Inicio();
    Rutas rutas = new Rutas();
    
    public ListenerRutas(Inicio inicio, Rutas rutas){
        this.inicio = inicio;
        this.rutas = rutas;
        this.inicio.jSearchPR.addKeyListener(this);
        this.inicio.jarSeach.addKeyListener(this);
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
     
     public void Search() throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
            
        DefaultTableModel modelR = new DefaultTableModel();
        inicio.listapolloreja.setModel(modelR);
        String fecha = inicio.jSearchPR.getText();

        modelR.addColumn("N de Reja");
        modelR.addColumn("Numero");
        modelR.addColumn("KG");
        modelR.addColumn("Precio");
        modelR.addColumn("Fecha");

        Object[] columna = new Object[5];

        int NumRegistro = rutas.SearchPR(fecha).size();

        for (int i = 0; i < NumRegistro; i++){
            columna[0] = rutas.SearchPR(fecha).get(i).getDnireja();
            columna[1] = rutas.SearchPR(fecha).get(i).getNumero();
            columna[2] = rutas.SearchPR(fecha).get(i).getKg();
            columna[3] = rutas.SearchPR(fecha).get(i).getPrecio();
            columna[4] = rutas.SearchPR(fecha).get(i).getFecha();
            modelR.addRow(columna);
        }
     }
     
     public void AsignarRutaSearch() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        String condicion = inicio.jarSeach.getText();
        String  tabla = "";
        inicio.jarc.addActionListener(this);
        if (inicio.jarc.getSelectedIndex() != 0 ){
            tabla = "Empleado.Nombre";
        }else {
            tabla = "Asignacion_rutas.Fecha_salida";
        }
        System.out.println(inicio.jarc.getSelectedItem());

        DefaultTableModel modelR = new DefaultTableModel();
        inicio.listaruta.setModel(modelR);
        
        modelR.addColumn("Nombre Empleado");
        modelR.addColumn("Ruta");
        modelR.addColumn("Precio KG");
        modelR.addColumn("Fecha Entrada");
        modelR.addColumn("Fecha salida");
        
        Object[] columna = new Object[5];
       
        int NumRegistro = rutas.SearchAsignarRuta(tabla, condicion).size();
        
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = rutas.SearchAsignarRuta(tabla, condicion).get(i).getNombreEmpleado();
            columna[1] = rutas.SearchAsignarRuta(tabla, condicion).get(i).getNombreRuta();
            columna[2] = rutas.SearchAsignarRuta(tabla, condicion).get(i).getPrecio();
            columna[3] = rutas.SearchAsignarRuta(tabla, condicion).get(i).getFechaSalida();
            columna[4] = rutas.SearchAsignarRuta(tabla, condicion).get(i).getFechallegada();
            modelR.addRow(columna);
        }
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
      
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == inicio.jSearchPR){
            //System.out.println(inicio.jSearchPR.getText());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getSource() == inicio.jSearchPR){
            try {
                Search();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ListenerRutas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ListenerRutas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ListenerRutas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ListenerRutas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == inicio.jarSeach){
            try {
                AsignarRutaSearch();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ListenerRutas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ListenerRutas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ListenerRutas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ListenerRutas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
    
    
    
}
