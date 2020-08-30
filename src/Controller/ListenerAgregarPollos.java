
package Controller;
import Model.Almacen;
import View.AgregarPollos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ListenerAgregarPollos implements ActionListener{

    Almacen almacen = new Almacen();
    AgregarPollos inicio = new AgregarPollos();
    
    public ListenerAgregarPollos(Almacen almacen, AgregarPollos inicio){
    
        this.almacen = almacen;
        this.inicio = inicio;
        this.inicio.btnAgregarPollos.addActionListener(this);
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == inicio.btnAgregarPollos){
            System.out.println("Agregar");
        }
        
    } 
}
