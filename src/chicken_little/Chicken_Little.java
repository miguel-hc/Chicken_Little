
package chicken_little;

import View.*;
import bd.*;
import Model.*;
import Controller.*;
import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Chicken_Little {

    public static void main(String[] args) throws java.lang.ClassNotFoundException, 
            java.lang.InstantiationException, 
            java.lang.IllegalAccessException, 
            SQLException, 
            FileNotFoundException, 
            IOException 
    {
        Component dialog = null;
        try{
            FileInputStream propFile = new FileInputStream(System.getProperty("user.dir")+"/src/chicken_little/configdatabase.txt");
            Properties p = new Properties(System.getProperties());
            p.load(propFile);
            System.setProperties(p);
            if (System.getProperty("mostrarproperties").compareTo("si") == 0){
                System.getProperties().list(System.out);
            }
            
        }catch(java.io.FileNotFoundException e){
            System.out.println("No se encontro el Archivo");
            JOptionPane.showMessageDialog(dialog,"No se encontro el Archivo "+e);
            System.exit(-1);
        }
        catch(java.io.IOException e){
            System.out.println("Ocurio algun error de I/O");
            JOptionPane.showMessageDialog(dialog,"Ocurio algun error de I/O "+e);
            System.exit(-1);
        }
       
        try{
            Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        }catch(java.lang.ClassNotFoundException e){
            System.out.println("Ocurrio la exepcion "+ e.toString());
            System.out.println("Es probable que no se encuentre la clase del conector jdbc "+ System.getProperty("driver")+". Agregela a su classpath con la opcion -cp.");
            JOptionPane.showMessageDialog(dialog,"Es probable que no se encuentre la clase del conector jdbc "+ System.getProperty("driver")+". Agregela a su classpath con la opcion -cp. "+e);
            System.exit(-1);
            
        }catch(java.lang.InstantiationException e){
            System.out.println("ocurrio un error de instancion. "
            + e.toString());
            JOptionPane.showMessageDialog(dialog,"ocurrio un error de instancion. "
            + e.toString());
            System.exit(-1);
        }catch(java.lang.IllegalAccessException e){
            System.out.println("Ocurrio un error de acceso ilegal "+ 
                    e.toString());
            JOptionPane.showMessageDialog(dialog,"Ocurrio un error de acceso ilegal "+ 
                    e.toString());
            System.exit(-1);
        }
        
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        //Login login = new Login();
        //login.setVisible(true);
        
        
    }
    
}

