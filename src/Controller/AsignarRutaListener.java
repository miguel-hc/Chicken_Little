/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Controller.AsignarRutaController;
import View.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

/**
 *
 * @author miguel
 */
public class AsignarRutaListener implements ActionListener
{
    
    AsignarRutaController controller = new AsignarRutaController();
    Inicio inicio = new Inicio();
    
    public AsignarRutaListener(AsignarRutaController controller, Inicio inicio){
        this.controller = controller;
        this.inicio = inicio;
        this.inicio.btnAsignarRuta.addActionListener(this);
    }
    
     public void llebarTabla(JTable tablaD) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);
        
        modeloT.addColumn("Ruta");
        modeloT.addColumn("Empleado");
        modeloT.addColumn("Transporte");
        modeloT.addColumn("NumeroReja");
        modeloT.addColumn("CantidadPollos");
        modeloT.addColumn("Kg");
        modeloT.addColumn("Precio");
        modeloT.addColumn("Fecha");
        
        Object[] columna = new Object[8];
        
        int NumRegistro = controller.ListaRejas().size();
  
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = controller.ListaRejas().get(i).getNombreRuta();
            columna[1] = controller.ListaRejas().get(i).getNombreEmpleado();
            columna[2] = controller.ListaRejas().get(i).getNombreTransporte();
            columna[3] = controller.ListaRejas().get(i).getNumeroreja();
            columna[4] = controller.ListaRejas().get(i).getNumeroPollos();
            columna[5] = controller.ListaRejas().get(i).getKg();
            columna[6] = controller.ListaRejas().get(i).getPrecio();
            columna[7] = controller.ListaRejas().get(i).getFecha();
            
            modeloT.addRow(columna);
       }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == inicio.btnAsignarRuta){
            
            int Numeroreja = (int) inicio.jNPollo.getValue();
            int NumeroPollo = (int) inicio.jNPollo.getValue();
            int Kg = (int) inicio.jKg.getValue();
            int Precio = (int) inicio.jPrecioKg.getValue();
            int Total = (int) inicio.jPrecioTotal.getValue();
            String Ruta = (String) inicio.jAsignarRuta.getSelectedItem();
            String NombreEmpleado = (String) inicio.jTrabajador.getSelectedItem();
            String Transporte = (String) inicio.jTransporte.getSelectedItem();
            
            try {
                controller.Asignar_Ruta(Numeroreja, NumeroPollo, Kg, Precio, Precio, Ruta, NombreEmpleado, Transporte);
                JOptionPane.showMessageDialog(null, "Agregado Corectamente");
                controller.getTicket();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AsignarRutaListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(AsignarRutaListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(AsignarRutaListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(AsignarRutaListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(AsignarRutaListener.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }

    }
}
