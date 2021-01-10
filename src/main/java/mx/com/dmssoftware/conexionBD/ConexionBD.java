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

            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dmssoftware", "root", "");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de conexión " + ex.getMessage());
        }

        return conectar;

    }
//     public Connection conexion(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//           // conectar = (Connection) DriverManager.getConnection("jdbc:mysql://node60693-env-1340796.jelastic.saveincloud.net:3306/dmssoftware", "root", "4XeuaPL1gX");
//          conectar = (Connection) DriverManager.getConnection("jdbc:mysql://mysql-18148-0.cloudclusters.net:18176/dmssoftware","Joseph","xg7FBK5?b}A)j=Kt");
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Error de conexión " + ex.getMessage());
//        }
//
//        return conectar;
//    }
}
