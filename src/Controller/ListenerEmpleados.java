
package Controller;

import View.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Empleado;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;

public class ListenerEmpleados implements ActionListener, KeyListener{

    Inicio inicio = new Inicio();
    EmpleadoController empleado = new EmpleadoController();
    Empleado empleadomodel = new Empleado();
    
    public ListenerEmpleados(Inicio inicio, EmpleadoController empleado){
        this.inicio = inicio;
        this.empleado = empleado;
        this.inicio.btnDeleteE.addActionListener(this);
        this.inicio.btnUpdateE.addActionListener(this);
        this.inicio.txtNombre.addKeyListener(this);
        this.inicio.txtApellidos.addKeyListener(this);
        this.inicio.txtDireccion.addKeyListener(this);
        this.inicio.jrHombre.addKeyListener(this);
        this.inicio.txtTelefono.addKeyListener(this);
        this.inicio.jSearch.addKeyListener(this);
        this.inicio.btnEditar.addActionListener(this);
        this.inicio.btnReporEmpleados.addActionListener(this);
        
    }
    
    public void llebarTabla(JTable tablaD) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);
        
        modeloT.addColumn("DNI");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Apellidos");
        modeloT.addColumn("Sexo");
        modeloT.addColumn("Direccion");
        modeloT.addColumn("Telefono");
        
        Object[] columna = new Object[6];
        
        int NumRegistro = empleado.getListaEmpleados().size();
  
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = empleado.getListaEmpleados().get(i).getDNI();
            columna[1] = empleado.getListaEmpleados().get(i).getNombre();
            columna[2] = empleado.getListaEmpleados().get(i).getApellidos();
            columna[3] = empleado.getListaEmpleados().get(i).getSexo();
            columna[4] = empleado.getListaEmpleados().get(i).getDireccion();
            columna[5] = empleado.getListaEmpleados().get(i).getTelefono();
            
            modeloT.addRow(columna);
       }
    }
    
    public void setDatosEpleados() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        empleadomodel.setNombre(inicio.txtNombre.getText());
        empleadomodel.setApellidos(inicio.txtApellidos.getText());
        empleadomodel.setDireccion(inicio.txtDireccion.getText());
        empleadomodel.setTelefono(inicio.txtDireccion.getText());
        
        empleado.AddEmpleado(0,inicio.txtNombre.getText(),inicio.txtApellidos.getText(),inicio.jrHombre.getText(), inicio.txtDireccion.getText(), inicio.txtTelefono.getText());
    }
    
    public void Search () throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        
        String nombre = inicio.jSearch.getText();
            DefaultTableModel modeloT = new DefaultTableModel();
            inicio.jEmpleados.setModel(modeloT);

            modeloT.addColumn("DNI");
            modeloT.addColumn("Nombre");
            modeloT.addColumn("Apellidos");
            modeloT.addColumn("Sexo");
            modeloT.addColumn("Direccion");
            modeloT.addColumn("Telefono");

            Object[] columna = new Object[6];

            int NumRegistro = empleado.Search(nombre).size();

            for (int i = 0; i < NumRegistro; i++){
                columna[0] = empleado.Search(nombre).get(i).getDNI();
                columna[1] = empleado.Search(nombre).get(i).getNombre();
                columna[2] = empleado.Search(nombre).get(i).getApellidos();
                columna[3] = empleado.Search(nombre).get(i).getSexo();
                columna[4] = empleado.Search(nombre).get(i).getDireccion();
                columna[5] = empleado.Search(nombre).get(i).getTelefono();

                modeloT.addRow(columna);
           }
    
    }
    
    public void Clear(){
        inicio.txtNombre.setText("");
        inicio.txtApellidos.setText("");
        inicio.txtDireccion.setText("");
        inicio.txtTelefono.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        if (e.getSource() == inicio.btnDeleteE){
            int rowDelete = inicio.jEmpleados.getSelectedRow();
            int numFS = inicio.jEmpleados.getSelectedRowCount();
            
            ArrayList<String> listaDni = new ArrayList();
            String dni = "";
            
            if (rowDelete > 0){
                for (int i = 0; i < numFS; i++){
                    dni = String.valueOf(inicio.jEmpleados.getValueAt(i+rowDelete, 0));
                    listaDni.add(dni);
                }
                for (int i = 0; i < numFS; i++ ){
                    int notif = JOptionPane.showConfirmDialog(null, "Desea eliminar el Empleado con dni "+dni);
                    if (notif == 0){
                        try {
                            empleado.DeleteEmpleado(dni);
                            llebarTabla(inicio.jEmpleados);
                        } catch (SQLException ex) {
                            Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }else {
                JOptionPane.showMessageDialog(null, "No selecciono un cliente");
            }
        }
        
        if(e.getSource() == inicio.btnUpdateE){
            
            int rowDelete = inicio.jEmpleados.getSelectedRow();
            if (rowDelete > 0){
                int dni = (int) inicio.jEmpleados.getValueAt(rowDelete, 0);
                System.out.println(dni);
                inicio.btnAgregareE.setEnabled(false);
                inicio.btnDeleteE.setEnabled(false);
                
                try {
                    int reditar = empleado.UpdateEmpleado(dni, inicio.txtNombre.getText(), inicio.txtApellidos.getText(), inicio.jrHombre.getText(), inicio.txtDireccion.getText(), inicio.txtTelefono.getText());
                    
                    if (reditar > 0){
                        JOptionPane.showMessageDialog(null, "Cliente Editado");
                        inicio.btnAgregareE.setEnabled(true);
                        inicio.btnDeleteE.setEnabled(true);
                        Clear();
                        llebarTabla(inicio.jEmpleados);
                        
                    }else {
                        JOptionPane.showMessageDialog(null, "Error en la edicion");
                    }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else {
                    JOptionPane.showMessageDialog(null, "No selecciono un cliente");
            }
        }
        
        if (e.getSource() == inicio.btnEditar){
            
            int rowDelete = inicio.jEmpleados.getSelectedRow();      
            
            if (rowDelete > 0){
                inicio.btnAgregareE.setEnabled(false);
                inicio.btnDeleteE.setEnabled(false);
                int dni = (int) inicio.jEmpleados.getValueAt(rowDelete, 0);
                String name = (String) inicio.jEmpleados.getValueAt(rowDelete, 1);
                String apellido = (String) inicio.jEmpleados.getValueAt(rowDelete, 2);
                String direccion = (String) inicio.jEmpleados.getValueAt(rowDelete, 4);
                String telefono = (String) inicio.jEmpleados.getValueAt(rowDelete, 5);
                inicio.txtNombre.setText(name);
                inicio.txtApellidos.setText(apellido);
                inicio.txtDireccion.setText(direccion);
                inicio.txtTelefono.setText(telefono);
            }else{
                JOptionPane.showMessageDialog(null, "No selecciono un cliente");
            }
        }
        
        if (e.getSource() == inicio.btnReporEmpleados){
        
            try {
                empleado.getReport(inicio.jSearch.getText());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JRException ex) {
                Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource() == inicio.txtNombre){
            System.out.println("Nombre");
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e){
        
        if (e.getSource() == inicio.jSearch){
            try {
                Search();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ListenerEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
