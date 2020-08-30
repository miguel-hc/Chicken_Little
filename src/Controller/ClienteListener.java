
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controller.ClienteController;
import View.Inicio;
import Model.Cliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

public class ClienteListener implements ActionListener{

    Inicio inicio = new Inicio();
    ClienteController controller = new ClienteController();
    Cliente cliente = new Cliente();
    
    public ClienteListener(Inicio inicio, ClienteController controller){
    
        this.inicio = inicio;
        this.controller = controller;
        this.inicio.btnAgrgarClienteCredito.addActionListener(this);
        this.inicio.btnCargarDatosCliente.addActionListener(this);
        this.inicio.btnGuargarActualizacionCliente.addActionListener(this);
        this.inicio.btnEliminarCliente.addActionListener(this);
        this.inicio.btnReporteCliente.addActionListener(this);
        this.inicio.btnGuargarActualizacionCliente.addActionListener(this);
        
    
    }
    
    
    public void llebarTabla() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        DefaultTableModel modeloT = new DefaultTableModel();
        inicio.jClienteCredito.setModel(modeloT);
        
        modeloT.addColumn("Dni");
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Apellidos");
        modeloT.addColumn("Sexo");
        modeloT.addColumn("Direcion");
        modeloT.addColumn("Telefono");
        modeloT.addColumn("Credito1");
        modeloT.addColumn("Credito2");
        modeloT.addColumn("Credito3");
        modeloT.addColumn("Total_Credito");
        modeloT.addColumn("Ruta");
        
        
        Object[] columna = new Object[11];
        
        int NumRegistro = controller.listarCliente().size();
  
        for (int i = 0; i < NumRegistro; i++){
            
            columna[0] = controller.listarCliente().get(i).getDni();
            columna[1] = controller.listarCliente().get(i).getNombre();
            columna[2] = controller.listarCliente().get(i).getApellidos();
            columna[3] = controller.listarCliente().get(i).getSexo();
            columna[4] = controller.listarCliente().get(i).getDirecion();
            columna[5] = controller.listarCliente().get(i).getTelefono();
            columna[6] = controller.listarCliente().get(i).getCredito1();
            columna[7] = controller.listarCliente().get(i).getCredito2();
            columna[8] = controller.listarCliente().get(i).getCredito3();
            columna[9] = controller.listarCliente().get(i).getSuma();
            columna[10] = controller.listarCliente().get(i).getRuta();
            
            modeloT.addRow(columna);
       }
    }
    
    public void limpiarCampo(){
    
        inicio.txtNombreCliente.setText("");
        inicio.txtApellidoCliente.setText("");
        inicio.txtSexoCliente.setText("");
        inicio.txtDirecionCliente.setText("");
        inicio.txtTelefonoCliente.setText("");
        inicio.jCredito1.setValue(0);
        inicio.jCredito2.setValue(0);
        inicio.jCredito3.setValue(0);
        inicio.jRutaCreditoCliente.setSelectedItem("");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inicio.btnAgrgarClienteCredito){
            String Nombre = inicio.txtNombreCliente.getText();
            String Apellidos = inicio.txtApellidoCliente.getText();
            String Sexo = inicio.txtSexoCliente.getText();
            String Direcion = inicio.txtDirecionCliente.getText();
            String Telefono = inicio.txtTelefonoCliente.getText();
            int Credito1 = (int) inicio.jCredito1.getValue();
            int Credito2 = (int) inicio.jCredito2.getValue();
            int Credito3 = (int) inicio.jCredito3.getValue();
            String Ruta = (String) inicio.jRutaCreditoCliente.getSelectedItem();
            
            try {
                controller.InsertClienteCredito(Nombre, Apellidos, Sexo, Direcion, Telefono, Credito1, Credito2, Credito3, Ruta);
                JOptionPane.showMessageDialog(null, "Cliente registrado");
                llebarTabla();
                limpiarCampo();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (e.getSource() == inicio.btnCargarDatosCliente){
            int rowDelete = inicio.jClienteCredito.getSelectedRow();      
            
            if (rowDelete > 0){
                
                inicio.txtNombreCliente.setEditable(false);
                inicio.txtApellidoCliente.setEditable(false);
                inicio.txtSexoCliente.setEditable(false);
                inicio.txtDirecionCliente.setEditable(false);
                inicio.txtTelefonoCliente.setEditable(false);
                
                String Nombre = (String) inicio.jClienteCredito.getValueAt(rowDelete, 1);
                String Apellidos = (String) inicio.jClienteCredito.getValueAt(rowDelete, 2);
                String Sexo = (String) inicio.jClienteCredito.getValueAt(rowDelete, 3);
                String Direccion = (String) inicio.jClienteCredito.getValueAt(rowDelete, 4);
                String Telefono = (String) inicio.jClienteCredito.getValueAt(rowDelete, 5);
                int Credito1 = (int) inicio.jClienteCredito.getValueAt(rowDelete, 6);
                int Credito2 = (int) inicio.jClienteCredito.getValueAt(rowDelete, 7);
                int Credito3 = (int) inicio.jClienteCredito.getValueAt(rowDelete, 8);
                String Ruta = (String) inicio.jClienteCredito.getValueAt(rowDelete, 10);
                
                inicio.txtNombreCliente.setText(Nombre);
                inicio.txtApellidoCliente.setText(Apellidos);
                inicio.txtSexoCliente.setText(Sexo);
                inicio.txtDirecionCliente.setText(Direccion);
                inicio.txtTelefonoCliente.setText(Telefono);
                inicio.jCredito1.setValue(Credito1);
                inicio.jCredito2.setValue(Credito2);
                inicio.jCredito3.setValue(Credito3);
                inicio.jRutaCreditoCliente.setSelectedItem(Ruta);
                
            }else{
                JOptionPane.showMessageDialog(null, "No selecciono un cliente");
            }
        }
        
        if (e.getSource() == inicio.btnGuargarActualizacionCliente){
        
                int rowDelete = inicio.jClienteCredito.getSelectedRow();   
                int Dni = (int) inicio.jClienteCredito.getValueAt(rowDelete, 0);
                
                String Nombre = inicio.txtNombreCliente.getText();
                String Apellidos = inicio.txtApellidoCliente.getText();
                String Sexo = inicio.txtSexoCliente.getText();
                String Direccion = inicio.txtDirecionCliente.getText();
                String Telefono = inicio.txtTelefonoCliente.getText();
                int Credito1 = (int) inicio.jCredito1.getValue();
                int Credito2 = (int) inicio.jCredito2.getValue();
                int Credito3 = (int) inicio.jCredito3.getValue();
                String Ruta = (String) inicio.jRutaCreditoCliente.getSelectedItem();
            try {
                controller.UpdateClienteCredito(Dni,Nombre, Apellidos, Sexo, Direccion, Telefono, Credito1, Credito2, Credito3, Ruta);
                llebarTabla();
                JOptionPane.showMessageDialog(null, "Cliente Editado");
                limpiarCampo();
                inicio.txtNombreCliente.setEditable(true);
                inicio.txtApellidoCliente.setEditable(true);
                inicio.txtSexoCliente.setEditable(true);
                inicio.txtDirecionCliente.setEditable(true);
                inicio.txtTelefonoCliente.setEditable(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (e.getSource() == inicio.btnEliminarCliente){
        
            int rowDelete = inicio.jClienteCredito.getSelectedRow();   
            int Dni = (int) inicio.jClienteCredito.getValueAt(rowDelete, 0);
            try {
                int notif = JOptionPane.showConfirmDialog(null, "Desea eliminar el Cliente con dni "+Dni);
                if (notif == 0){
                    controller.DeleteCliente(Dni);
                    llebarTabla();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == inicio.btnReporteCliente){
            try {
                controller.getReporte();
            } catch (JRException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ClienteListener.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
