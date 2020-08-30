
package Model;

import Controller.LoginController;
import bd.Conexion;
import bd.factoriaServicio;
import java.sql.SQLException;

public class LoginModel {
    public boolean acces = false;
    public void login () throws ClassNotFoundException, 
            InstantiationException, IllegalAccessException, 
            SQLException
    {
        Conexion cdb = factoriaServicio.getInstancia().getConexionDB();
        LoginController lg = new LoginController();
        cdb.un_sql = "Select * from acceso where Usuario = '"+lg.getUsuario()+"' and Pass = '"+lg.getPassword()+"'";
        cdb.resultado = cdb.un_st.executeQuery(cdb.un_sql);   
        if (cdb.resultado != null){
            if (cdb.resultado.next()){
                LoginController lc = new LoginController();
                lc.setUsuario(cdb.resultado.getString("Usuario"));
                System.out.println(lc.getUsuario());
                acces = true;
            }
        }
        //cdb.conexion.close();
    }
    
    public boolean isLogin(){
        return acces;
    }
    
}
