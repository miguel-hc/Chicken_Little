
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
        this.inicio.btnRutas.addActionListener(this);
        
        
    }
    
    public void llenarRejas(JTable tablarejas) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
    
        DefaultTableModel modelR = new DefaultTableModel();
        tablarejas.setModel(modelR);
        
        modelR.addColumn("Ruta");
        modelR.addColumn("Transporte");
        modelR.addColumn("Empleado");
        modelR.addColumn("N Reja");
        modelR.addColumn("Numero Pollos");
        modelR.addColumn("Kg");
        modelR.addColumn("Precio");
        modelR.addColumn("Fecha");
        
        Object[] columna = new Object[8];
       
        int NumRegistro = rutas.getLista().size();
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = rutas.getLista().get(i).getRuta();
            columna[1] = rutas.getLista().get(i).getTransporte();
            columna[2] = rutas.getLista().get(i).getEmpleado();
            columna[3] = rutas.getLista().get(i).getNumeroReja();
            columna[4] = rutas.getLista().get(i).getNumeroPollos();
            columna[5] = rutas.getLista().get(i).getKg();
            columna[6] = rutas.getLista().get(i).getPrecio();
            columna[7] = rutas.getLista().get(i).getFecha();
            
            modelR.addRow(columna);
        }
    }
    
     
     public void Search() throws ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException{
            
        DefaultTableModel modelR = new DefaultTableModel();
        inicio.listapolloreja.setModel(modelR);
        String fecha = inicio.jSearchPR.getText();

        modelR.addColumn("Ruta");
        modelR.addColumn("Transporte");
        modelR.addColumn("Empleado");
        modelR.addColumn("N Reja");
        modelR.addColumn("Numero Pollos");
        modelR.addColumn("Kg");
        modelR.addColumn("Precio");
        modelR.addColumn("Fecha");
        
        Object[] columna = new Object[8];
       
        int NumRegistro = rutas.getLista().size();
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = rutas.getLista().get(i).getRuta();
            columna[1] = rutas.getLista().get(i).getTransporte();
            columna[2] = rutas.getLista().get(i).getEmpleado();
            columna[3] = rutas.getLista().get(i).getNumeroReja();
            columna[4] = rutas.getLista().get(i).getNumeroPollos();
            columna[5] = rutas.getLista().get(i).getKg();
            columna[6] = rutas.getLista().get(i).getPrecio();
            columna[7] = rutas.getLista().get(i).getFecha();
            
            modelR.addRow(columna);
        }
        
     }
     
     
    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == inicio.btnRutas){
          System.out.println("ruta");
      }
      
      
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

    }
    
    
    
    
}
