
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
        
        else if(e.getSource() == inicio.btnUpdateE){
            
            int rowDeleted = inicio.jEmpleados.getSelectedRow();
            int numFS = inicio.jEmpleados.getSelectedRowCount();
            
            if (rowDeleted >= 0 && numFS == 1){
                
            }
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
