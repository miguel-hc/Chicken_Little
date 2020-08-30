
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.*;
import View.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ControllerListener implements ActionListener, KeyListener{

    Inicio inicio = new Inicio();
    Almacen almacen = new Almacen();
    
    public ControllerListener(Inicio inicio, Almacen almacen){
        this.inicio = inicio;
        this.almacen = almacen;
        this.inicio.SearchAlmacen.addKeyListener(this);
        this.inicio.btnDeleteAlmacen.addActionListener(this);
        this.inicio.btnUpdateAlmacen.addActionListener(this);
        this.inicio.btnAgregarTransporte.addActionListener(this);
        this.inicio.btnNuevoTransporte.addActionListener(this);
        this.inicio.btnGuardarActualizacionTransporte.addActionListener(this);
        this.inicio.btnModificarTransporte.addActionListener(this);
        this.inicio.btnDeleteTransporte.addActionListener(this);
        this.inicio.btnAgregarPollos.addActionListener(this);
        this.inicio.brnGuardarUpdate.addActionListener(this);
    }
    
    public void llenarTablaAlmacen(JTable tablaD) throws ClassNotFoundException, IllegalAccessException, SQLException, InstantiationException
    {
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);
        
        modeloT.addColumn("Nombre Del Almacen");
        modeloT.addColumn("Pollos vivos");
        modeloT.addColumn("Pollos Muertos");
        modeloT.addColumn("Precio");
        modeloT.addColumn("Fecha");
        
        Object[] columna = new Object[5];
        
        int NumRegistro = almacen.listaAlmacenes().size();
        
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = almacen.listaAlmacenes().get(i).getNombre();
            columna[1] = almacen.listaAlmacenes().get(i).getPolloVivos();
            columna[2] = almacen.listaAlmacenes().get(i).getPollosMuertos();
            columna[3] = almacen.listaAlmacenes().get(i).getPrecio();
            columna[4] = almacen.listaAlmacenes().get(i).getFecha();
            modeloT.addRow(columna);
        }
    }
    
    
    public void llenarTablaTransporte() throws ClassNotFoundException, IllegalAccessException, SQLException, InstantiationException
    {
        DefaultTableModel modeloT = new DefaultTableModel();
        inicio.jListaTransporte.setModel(modeloT);
        
        modeloT.addColumn("DNI");
        modeloT.addColumn("Nombre Del Transporte");
        modeloT.addColumn("Descripcion");
        
        
        Object[] columna = new Object[3];
        
        int NumRegistro = almacen.ListarTransporte().size();
        
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = almacen.ListarTransporte().get(i).getDniTransporte();
            columna[1] = almacen.ListarTransporte().get(i).getNombreTransporte();
            columna[2] = almacen.ListarTransporte().get(i).getDescripcionTransporte();
            
            modeloT.addRow(columna);
        }
    }
    
   
    
    public void Search() throws ClassNotFoundException, IllegalAccessException, SQLException, InstantiationException
    {
        String Nombre = inicio.SearchAlmacen.getText();
        DefaultTableModel modeloT = new DefaultTableModel();
        inicio.jAlmacen.setModel(modeloT);
        
        modeloT.addColumn("Nombre Del Almacen");
        modeloT.addColumn("Pollos vivos");
        modeloT.addColumn("Pollos Muertos");
        modeloT.addColumn("Precio");
        modeloT.addColumn("Fecha");
        
        Object[] columna = new Object[5];
        
        int NumRegistro = almacen.SearchAlmacen(Nombre).size();
        
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = almacen.SearchAlmacen(Nombre).get(i).getNombre();
            columna[1] = almacen.SearchAlmacen(Nombre).get(i).getPolloVivos();
            columna[2] = almacen.SearchAlmacen(Nombre).get(i).getPollosMuertos();
            columna[3] = almacen.SearchAlmacen(Nombre).get(i).getPrecio();
            columna[4] = almacen.SearchAlmacen(Nombre).get(i).getFecha();
            modeloT.addRow(columna);
        }
    }
    
    
    public void totalpollos(JLabel label) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
            label.setText(almacen.getTotal()+""); 
        }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == inicio.btnUpdateAlmacen){
            
            int rowDelete = inicio.jAlmacen.getSelectedRow();
            if (rowDelete > 0){
                String Almacen = (String) inicio.jAlmacen.getValueAt(rowDelete, 0);
                int CantidadVivo = (int) inicio.jAlmacen.getValueAt(rowDelete, 1);
                int CantidadMuerto = (int) inicio.jAlmacen.getValueAt(rowDelete, 2);
                int Precio = (int) inicio.jAlmacen.getValueAt(rowDelete, 3);
                
                inicio.txtAlmacenNew.setText(Almacen);
                inicio.jPollosVivos.setValue(CantidadVivo);
                inicio.jPollosMuertos.setValue(CantidadMuerto);
                inicio.jPrecioPollos.setValue(Precio);  
            }
            
        }
        if (e.getSource() == inicio.btnDeleteAlmacen){
            
        }
        
        if (e.getSource() == inicio.btnAgregarTransporte){
        
            String Nombre;
            String Descripcion;
            Nombre = inicio.jNombreTransporte.getText();
            Descripcion = inicio.jDescripcionTransporte.getText();
            try {
                almacen.InsertTransporte(Nombre, Descripcion);
                llenarTablaTransporte();
                inicio.jNombreTransporte.setText("");
                inicio.jDescripcionTransporte.setText("");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (e.getSource() == inicio.btnNuevoTransporte){
            try {
                llenarTablaTransporte();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == inicio.btnGuardarActualizacionTransporte){
            System.out.println("Actualizacion");
            inicio.btnAgregarTransporte.setEnabled(true);
            inicio.btnDeleteTransporte.setEnabled(true);
            inicio.btnGuardarActualizacionTransporte.setEnabled(false);
            String Nombre = inicio.jNombreTransporte.getText();
            String Descripcion = inicio.jDescripcionTransporte.getText();
            int RowSelec = inicio.jListaTransporte.getSelectedRow();
            int Dni = (int) inicio.jListaTransporte.getValueAt(RowSelec, 0);
            try {
                almacen.UpdateTransporte(Dni, Nombre, Descripcion);
                llenarTablaTransporte();
                inicio.jNombreTransporte.setText("");
                inicio.jDescripcionTransporte.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(e.getSource() == inicio.btnModificarTransporte){
            System.out.println("Cargar datos");
            inicio.btnGuardarActualizacionTransporte.setEnabled(true);
            inicio.btnAgregarTransporte.setEnabled(false);
            inicio.btnGuardarActualizacionTransporte.setEnabled(true);
            inicio.btnDeleteTransporte.setEnabled(false);
            int RowSelec = inicio.jListaTransporte.getSelectedRow();
            if (RowSelec > 0){
                String Nombre = (String) inicio.jListaTransporte.getValueAt(RowSelec, 1);
                String Descripcion = (String) inicio.jListaTransporte.getValueAt(RowSelec, 2);
                inicio.jNombreTransporte.setText(Nombre);
                inicio.jDescripcionTransporte.setText(Descripcion);
            }else{
                JOptionPane.showMessageDialog(null, "No selecciono un Transporte");
            }
        }
        
        if (e.getSource() == inicio.btnDeleteTransporte){
            int RowSelec = inicio.jListaTransporte.getSelectedRow();
            if (RowSelec > 0){
                int Dni = (int) inicio.jListaTransporte.getValueAt(RowSelec, 0);
                int notif = JOptionPane.showConfirmDialog(null, "Desea eliminar el Empleado con dni "+Dni);
                    if (notif == 0){
                try {
                    almacen.DeleteTransporte(Dni);
                    llenarTablaTransporte();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
                }
                    }
            }else{
                JOptionPane.showMessageDialog(null, "No selecciono un Transporte");
            }
            
        }
        if (e.getSource() == inicio.btnAgregarPollos){
            String Almacen = inicio.txtAlmacenNew.getText();
            int PollosVivos = (int) inicio.jPollosVivos.getValue();
            int PollosMuertos = (int) inicio.jPollosMuertos.getValue();
            int Precio = (int) inicio.jPrecioPollos.getValue();
            try {
                almacen.InsertPollos(Almacen, PollosVivos, PollosMuertos, Precio);
                llenarTablaAlmacen(inicio.jAlmacen);
                inicio.txtAlmacenNew.setText("");
                inicio.jPollosVivos.setValue(0);
                inicio.jPollosMuertos.setValue(0);
                inicio.jPrecioPollos.setValue(0);
                JOptionPane.showMessageDialog(null, "Agregado Corectamente");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == inicio.brnGuardarUpdate){
        
            String Almacen = inicio.txtAlmacenNew.getText();
            int pVivos = (int) inicio.jPollosVivos.getValue();
            int pMuertos = (int) inicio.jPollosMuertos.getValue();
            int Precio = (int) inicio.jPrecioPollos.getValue();
            
            try {
                almacen.UpdateNuevoPollo(Almacen, pVivos, pMuertos, Precio, Almacen);
                llenarTablaAlmacen(inicio.jAlmacen);
                JOptionPane.showMessageDialog(null, "Corectamnete Ed");
                inicio.txtAlmacenNew.setText("");
                inicio.jPollosVivos.setValue(0);
                inicio.jPollosMuertos.setValue(0);
                inicio.jPrecioPollos.setValue(0);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == inicio.SearchAlmacen){
            System.out.println(inicio.SearchAlmacen.getText());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        try {
            Search();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ControllerListener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
