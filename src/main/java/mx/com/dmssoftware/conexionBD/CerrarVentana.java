package mx.com.dmssoftware.conexionBD;

import javax.swing.JOptionPane;


/**
 *
 * @author Joseph
 */
public class CerrarVentana {
    public void cerrarVentana(){
        
        Object [] opc = {"Aceptar","Cancelar"};
        
        int eleccion = JOptionPane.showOptionDialog(null, "¿Está segur@ que quiere salir del sistema?", "Mensaje de confirmación",
                JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, "Aceptar");
        
        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        
    }
}
