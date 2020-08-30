
package Controller;
import Controller.VentaController;
import View.Inicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class VentaListener implements ActionListener{
    
    VentaController controller = new VentaController();
    Inicio inicio = new Inicio();
    
    public VentaListener(VentaController controller, Inicio inicio){
    
        this.controller = controller;
        this.inicio = inicio;
        this.inicio.btnVentas.addActionListener(this);
    }
    
    public void llebarTabla() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        DefaultTableModel modeloT = new DefaultTableModel();
        inicio.jListaVenta.setModel(modeloT);
        
        modeloT.addColumn("Fecha");
        modeloT.addColumn("Ruta");
        modeloT.addColumn("Nombre Cliente");
        modeloT.addColumn("NUmero Reja");
        modeloT.addColumn("Numero Pollos");
        modeloT.addColumn("Kg");
        modeloT.addColumn("Precio");
        
        
        Object[] columna = new Object[7];
        
        int NumRegistro = controller.listaVentas().size();
  
        for (int i = 0; i < NumRegistro; i++){
            columna[0] = controller.listaVentas().get(i).getFecha();
            columna[1] = controller.listaVentas().get(i).getRuta();
            columna[2] = controller.listaVentas().get(i).getNombreCliente();
            columna[3] = controller.listaVentas().get(i).getNumeroRejas();
            columna[4] = controller.listaVentas().get(i).getNumeroPollos();
            columna[5] = controller.listaVentas().get(i).getKilogramo();
            columna[6] = controller.listaVentas().get(i).getPrecio();
            
            
            modeloT.addRow(columna);
       }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   
    }
    
    
}
