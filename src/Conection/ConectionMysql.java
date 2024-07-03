 
package Conection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Admin
 */
public class ConectionMysql {
    Connection cn;
    
    public Connection conectar (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/login_java","root","");
            System.out.println("Conectado");
        }catch (Exception e) {
            System.out.println("Error en conexcion BD");
            
        }
        return cn;
    }
}
