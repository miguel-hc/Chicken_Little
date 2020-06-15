package bd;

import java.sql.*;

public class Conexion_mysql extends Conexion {
    
    private String opciones;
    
    public Conexion_mysql() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        opciones = System.getProperty("options");
        
        initdb();
    }
    
    
    @Override
    public void initdb() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        s_conexion = jdbc + host + "/"+ database;
        Class.forName(driver).newInstance();
        conexion = DriverManager.getConnection(jdbc + host + "/" +database+ "?"+
                opciones, username, password);
        dbmd = conexion.getMetaData();
        un_st = conexion.createStatement();
    }
    
}
