/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensaje;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class MensajeDialogo {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Operación realizada correctamente");
        
        JOptionPane.showMessageDialog(null, "Mensaje dentro de la ventana", "Mensaje en la barra de titulo", JOptionPane.WARNING_MESSAGE);
    }
}
