
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.*;
import View.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;


public class ControllerListener implements ActionListener{

    Inicio inicio = new Inicio();
    Almacen almacen = new Almacen();
    
    public ControllerListener(Inicio inicio, Almacen almacen){
        this.inicio = inicio;
        this.almacen = almacen;
    }
    
    public void llenarTabla(JTable tablaD) throws ClassNotFoundException, IllegalAccessException, SQLException, InstantiationException
    {
        DefaultTableModel modeloT = new DefaultTableModel();
        tablaD.setModel(modeloT);
        
        modeloT.addColumn("Nombre");
        modeloT.addColumn("Pollos vivos");
        modeloT.addColumn("Pollos Muertos");
        
        Object[] columna = new Object[3];
        
        int NumRegistro = almacen.listaAlmacenes().size();
        
        
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = almacen.listaAlmacenes().get(i).getNombre();
            columna[1] = almacen.listaAlmacenes().get(i).getPolloVivos();
            columna[2] = almacen.listaAlmacenes().get(i).getPollosMuertos();
            modeloT.addRow(columna);
        }
    }
    
    public void totalpollos(JLabel label) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        label.setText(almacen.getTotal()+""); 
        }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
    
}
