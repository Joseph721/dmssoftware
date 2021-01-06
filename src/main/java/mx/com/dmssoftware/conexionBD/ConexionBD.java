package mx.com.dmssoftware.conexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class ConexionBD {
     public Connection conectar = null;
     
    public Connection conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        //  conectar = (Connection) DriverManager.getConnection("jdbc:mysql://node60693-env-1340796.jelastic.saveincloud.net:3306/test?user=root&password=4XeuaPL1gX&useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false");
       conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dmssoftware","root","");
      // conectar = (Connection) DriverManager.getConnection("jdbc:mysql://node60697-env-1152801.jelastic.saveincloud.net:3306/dmssoftware","root","7BkeFsDK0s");
      //  conectar = (Connection) DriverManager.getConnection("jdbc:mysql://99.000webhost.io/id15822233_dmssoftware","id15822233_root","XG^mZ(ZI2vccL9[w");
      //connection = DriverManager.getConnection(url, login, password);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión " + ex.getMessage());
        }

        return conectar;

    }
}
