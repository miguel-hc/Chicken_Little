package bd;

import java.sql.*;

public class Conexion {
    
    public Connection conexion = null;
    public Statement un_st = null;
    public DatabaseMetaData dbmd;
    public String s_conexion = null;
    public ResultSet resultado = null;
    public String un_sql = null;
    
    protected String jdbc;
    protected String driver;
    protected String host;
    protected String database;
    protected String username;
    protected String password;
    
    public Conexion() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        jdbc = System.getProperty("jdbc");
        driver = System.getProperty("driver");
        host = System.getProperty("databasehost");
        database = System.getProperty("database");
        username = System.getProperty("username");
        password = System.getProperty("password");
        initdb();
    }
    
    public void initdb() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        s_conexion = jdbc + host + "/" + database;
        Class.forName(driver).newInstance();
        conexion = DriverManager.getConnection(jdbc + host + "/"+ database + username + password);
        dbmd = conexion.getMetaData();
        un_st = conexion.createStatement();
    }
    
    public Connection getConexion (){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/chicken","miguel","fsociety07#");
        }catch(Exception e){
            
        }
        return con;
    }
}
