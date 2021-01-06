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
}
